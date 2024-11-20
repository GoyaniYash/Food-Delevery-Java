import java.sql.*;
import java.util.*;

import javax.sound.midi.Soundbank;

public class Admin {
    final static String GREEN = "\u001b[32;1m";
    final static String RED = "\033[1;31m";
    final static String YELLOW = "\u001b[33m";
    final static String BLUE = "\033[1;94m";
    final static String PURPLE = "\u001b[35m";
    final static String reset = "\u001b[0m";
    static Scanner sc=new Scanner(System.in);
    static final String dburl = "jdbc:mysql://localhost:3306/foodordering";
    static final String dbuser = "root";
    static final String dbpass = "";
    static String adminName = "Yash";
    static String password = "yash@2005";

    void adminLogin() throws SQLException{
        String un = "";
        String pass = "";
        int x = 0;
        while (!(adminName.equals(un) && password.equals(pass))) {
            if(x > 0){
                System.out.println(RED+"\nINVALID CREDENTIALS"+reset);
            }
            System.out.print(BLUE+"ENTER USER NAME : "+reset);
            un = sc.next();
            System.out.print(BLUE+"ENTER PASSWORD : "+reset);
            pass = sc.next();
            x++;
        }
        makeChanges();
    }
    void makeChanges() throws SQLException {
        int choice = 0;

        System.out.println(YELLOW +"\nWHAT WOULD YOU LIKE TO DO ?");
        System.out.println(BLUE + "\n==============================================================================");
        System.out.println("\t1 . ADD RESTAURANTS\t2 .REMOVE REASTAURANTS\t3 . ADD MENUITEMS\t4 .REMOVE MENUITEMS\t5.CHANGE PRICE OF FOOD");
        System.out.println("===============================<"+RED+" 6 . EXIT "+BLUE+">===================================");
        System.out.println("ENTER CHOICE : " + reset);
        choice = sc.nextInt();
        System.out.println(YELLOW+"=============================================================================="+reset);

        switch (choice) {
            case 1: addRestaurant();
                break;
            case 2: removeReastuant();
                break;
            case 3: addMenuItems();
                break;
            case 4:removeMenuItems();
                break;
            case 5:changeItemPrice();
                break;
            default:
                break;
        }
    }
    static void addRestaurant() throws SQLException {
        Connection con = DriverManager.getConnection(dburl, dbuser, dbpass);
        System.out.println(PURPLE + "Enter Reastaurants Name : ");
        String rn = sc.nextLine();
        sc.nextLine();
        System.out.println(PURPLE + "Enter Reastaurants Address : ");
        String ra = sc.nextLine();
        System.out.println(PURPLE + "Enter Reastaurants Mobile Number : ");
        String rm = sc.nextLine();

        String q = "insert into reastaurants_name(res_name, res_adress, res_Mno) values(?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(q, Statement.RETURN_GENERATED_KEYS);

        pst.setString(1, rn);
        pst.setString(2, ra);
        pst.setString(3, rm);

        int n = pst.executeUpdate();
        ResultSet generatedKeys = pst.getGeneratedKeys();

        if (n > 0) {
            if (generatedKeys.next()) {
                int newReasturantId = generatedKeys.getInt(1);
                System.out.println(GREEN + "Insertion Complete. Your Reastaurants(" + rn + ")I'd is: " + newReasturantId + reset);
                while(true){
                    System.out.println(PURPLE + "Enter Item Name : ");
                    String in = sc.nextLine();

                    if (in.equalsIgnoreCase("done"))
                    break;

                    System.out.println(PURPLE + "Enter Item Price : ");
                    double ip=sc.nextDouble();
                    sc.nextLine();

                    addMenuItems(newReasturantId,in,ip);
                }
            }
        } else {
            System.out.println(RED + "Insertion Failed!!!" + reset);
        }
    }
    static void removeReastuant() throws SQLException {
        Connection con = DriverManager.getConnection(dburl, dbuser, dbpass);

        String q = "{call deletereasturant(?)}";
        System.out.println(PURPLE + "Enter Reastaurant I'd U Want to Delete a Reastaurant : ");
        int dri = sc.nextInt();

        CallableStatement cst = con.prepareCall(q);
        cst.setInt(1, dri);

        int n = cst.executeUpdate();

        if (n > 0) {
            System.out.println(GREEN + "Deletion Complete!!!" + reset);
        } else {
            System.out.println(RED + "Deletion Failed!!!" + reset);
        }
    }
    static void addMenuItems(int newReasturantId,String in,double ip) throws SQLException{
        Connection con = DriverManager.getConnection(dburl, dbuser, dbpass);

        String q="insert into menu_items(res_id,item_name,item_price) values (?,?,?)";
        PreparedStatement pst=con.prepareStatement(q);
        pst.setInt(1, newReasturantId);
        pst.setString(2, in);
        pst.setDouble(3, ip);
        int n=pst.executeUpdate();
        if (n>0) {
            System.out.println(GREEN + "Item Insert Succesfully." + reset);
        }
        else{
            System.out.println(RED + "Insertion Failed!!!" + reset);
        }
    }
    static void addMenuItems() throws SQLException{
        System.out.println(PURPLE + "Enter Reastaurant I'd : ");
        int res_id=sc.nextInt();
        System.out.println(PURPLE + "Enter Item Name : ");
        String in=sc.nextLine();
        sc.next();
        System.out.println(PURPLE + "Enter Item Price : ");
        double ip=sc.nextDouble();

        //sc.next();
        addMenuItems(res_id, in, ip);
    }
    static void removeMenuItems() throws SQLException{
        Connection con = DriverManager.getConnection(dburl, dbuser, dbpass);
        String q = "{call deletemenuitem(?)}";
        System.out.println(PURPLE + "Enter Item I'd U Want to Delete a Menu Item : ");
        int dmi = sc.nextInt();

        CallableStatement cst = con.prepareCall(q);
        cst.setInt(1, dmi);

        int n = cst.executeUpdate();

        if (n > 0) {
            System.out.println(GREEN + "Deletion Complete!!!" + reset);
        } else {
            System.out.println(RED + "Deletion Failed!!!" + reset);
        }
    }
    static void changeItemPrice() throws SQLException {
        Connection con = DriverManager.getConnection(dburl, dbuser, dbpass);

        String q = "{call itempricechange(?, ?)}";
        // 1. itemid   2. new price
        CallableStatement cst = con.prepareCall(q);
        
        System.out.println(PURPLE + "Enter Item I'd U Want to Change Price : " + reset);
        int i = sc.nextInt();
        System.out.println(PURPLE + "Enter New Price U Want to Change : " + reset);
        int np = sc.nextInt();

        cst.setInt(1, i);
        cst.setDouble(2, np);
        int n = cst.executeUpdate();

        if (n > 0) {
            System.out.println(GREEN + np + " Price is Successfully Changed." + reset);
        } else {
            System.out.println(RED + "No Item Found!!!" + reset);
        }
    }
}