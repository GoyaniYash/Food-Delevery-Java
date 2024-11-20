import java.sql.*;
import java.util.*;

public class App {
    final static String GREEN = "\u001b[32;1m";
    final static String RED = "\033[1;31m";
    final static String YELLOW = "\u001b[33m";
    final static String BLUE = "\033[1;94m";
    final static String PURPLE = "\u001b[35m";
    final static String reset = "\u001b[0m";

    static final String dburl = "jdbc:mysql://localhost:3306/foodordering";
    static final String dbuser = "root";
    static final String dbpass = "";

    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        String driverName="com.mysql.jdbc.Driver";
        Class.forName(driverName);
        Connection con=DriverManager.getConnection(dburl,dbuser,dbpass);
        System.out.println((con!=null)?"Connection SuccessFully":"Connection Failed");

        int startingChoice=starting();
        while (true) {
            if (startingChoice == 1 || startingChoice == 2) {
                break;
            }
            System.out.println(RED + "INVALID CHOICE!!!!" + reset);
            startingChoice = starting();
        }
        System.out.println();
        if(startingChoice==1){
            Admin a = new Admin();
            a.adminLogin();
        }else{
            int intial_choice=0;
            while (true) {
                intial_choice = homePage();
                if(intial_choice==1 || intial_choice==2){
                    break;
                }else{
                    intial_choice = homePage();
                }
            }
    
            System.out.println();
            switch (intial_choice) {
                case 1:
                    register();
                    // menu();
                    break;
                case 2:
                    login();
                    // menu();
                    break;
            }
            System.out.println(YELLOW+"\n\nTHANK YOU FOR VISITING!\n"+reset);
        }
    }

    // METHOD TO CHOOSE CUSTOMER OR ADMIN
    static int starting() {
        Scanner sc = new Scanner(System.in);
        System.out.println(YELLOW+"\n===================================< " + RED + "Welcome Food Ordering System" + YELLOW +" >====================================");
        System.out.println(GREEN + "\t\t1 << ADMIN >>\t\t     2 << CUSTOMER >>" + reset);
        System.out.println(YELLOW + "======================================================================================");
        System.out.print("\nEnter Your Choice : "+reset);
        int intial_choice = sc.nextInt();
        return intial_choice;
    }

    static public int homePage(){
        Scanner sc = new Scanner(System.in);
        System.out.println(YELLOW + "\n===================================WELCOME====================================");
        System.out.println("\t\t1 . << REGISTER >>\t\t2 . << LOGIN >>");
        System.out.println("==============================================================================");
        System.out.print("\nEnter Your Choice : " + reset);
        int intial_choice = sc.nextInt();
         
        return intial_choice;
    }

    static void register() throws SQLException {
        Scanner sc = new Scanner(System.in);
        String umo = "";

        // System.out.println(PURPLE + "Enter Your Id : " + reset);
        // int uid=sc.nextInt();
        // sc.nextLine();

        System.out.println(PURPLE + "Enter Your Name : " + reset);
        String uname = sc.next();
        sc.nextLine();

        System.out.println(PURPLE + "Enter Your E-mail : " + reset);
        String uemail = sc.next();

        boolean isValid = false;
        while (!isValid) {
            System.out.println(PURPLE + "Enter Your Mobile No. : " + reset);
            umo = sc.next();
            sc.nextLine();
            if (umo.length() != 10) {
                System.out.println(RED + "INVALID LENGTH" + reset);
            } else {
                for (char mobileNumber : umo.toCharArray()) {
                    if (!(Character.isDigit(mobileNumber))) {
                        System.out.println(RED + "INVALID: Please Enter Digits Only!!!" + reset);
                    } else {
                        isValid = true;
                        break;
                    }
                }
            }
        }

        System.out.println(PURPLE + "Enter Your Address : " + reset);
        String uaddress = sc.nextLine();

        System.out.println(PURPLE + "Enter Your Pass : " + reset);
        String upass = sc.next();
        

        // insert into DataBase
        String driverName = "com.mysql.jdbc.Driver";
        Connection con = DriverManager.getConnection(dburl, dbuser, dbpass);

        String q = "insert into users( name, email, phone_no, adress,pass) values( ?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(q, Statement.RETURN_GENERATED_KEYS);
        // pst.setInt(1, uid);
        pst.setString(1, uname);
        pst.setString(2, uemail);
        pst.setString(3, umo);
        pst.setString(4, uaddress);
        pst.setString(5, upass);

        pst.executeUpdate();

        // if (n > 0) {
            // System.out.println(PURPLE + "Registration Successfull!!!" + reset);
        // }
        // else{
            // System.out.println(RED + "Registration Failed!!!" + reset);
        // }
            ResultSet generatedKeys = pst.getGeneratedKeys();
            if (generatedKeys.next()) {
                int newUserId = generatedKeys.getInt(1);
                System.out.println(GREEN + "Insertion Complete. Your User ID is: " + newUserId + reset);  
            }
        else {
            System.out.println(RED + "Failed" + reset);
        }
    }

     //  Login Method
    static void login() throws SQLException {
        Scanner sc = new Scanner(System.in);
        String driverName = "com.mysql.jdbc.Driver";
        Connection con = DriverManager.getConnection(dburl, dbuser, dbpass);

        System.out.println(PURPLE + "Enter Your Email : " + reset);
        String email=sc.nextLine();
        System.out.println(PURPLE + "Enter Your Pass : " + reset);
        String pass = sc.next();

        String q="select user_id from users where email=? and pass=?";
        PreparedStatement pst = con.prepareStatement(q);
        pst.setString(1, email);
        pst.setString(2, pass);
        ResultSet rs=pst.executeQuery();
        if (rs.next()) {
            int tempUserId = rs.getInt(1);
            System.out.println(GREEN + "\t=====>Welcome Back<=====\t " + reset);  
        }
        else {
        System.out.println(RED + " Invalid Email Or Password. " + reset);
        }
    }
}