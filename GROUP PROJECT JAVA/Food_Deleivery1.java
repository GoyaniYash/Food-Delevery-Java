 import java.util.Scanner;

class Food_Deleivery1{
    String dish;
    double price;

    void setData(String dish, double price) {
        this.dish = dish;
        this.price = price;
    }

    void display() {
        System.out.println("The name of the dish is " + dish);
        System.out.println("The price of " + dish + " is " + price);
        System.out.println("--------------------------------------------------------");
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Food_Deleivery1[] F1 = new Food_Deleivery1[15];
        Food_Deleivery1[] F2 = new Food_Deleivery1[15];
        Food_Deleivery1[] F3 = new Food_Deleivery1[15];
        Food_Deleivery1[] F4 = new Food_Deleivery1[15];
        Food_Deleivery1[] F5 = new Food_Deleivery1[15];
        Food_Deleivery1[] F6 = new Food_Deleivery1[15];
        Food_Deleivery1[] F7 = new Food_Deleivery1[15];
        Food_Deleivery1[] F8 = new Food_Deleivery1[15];
        String restaurant1 = "The Biryani Life";
        String restaurant2 = "Bizz Restaurant";
        String restaurant3 = "Prince Chinese Food";
        String restaurant4 = "La Pinoz Pizza";
        String restaurant5 = "Sweet Truth Restaurant";
        String restaurant6 = "Salim Burger";
        String restaurant7 = "The Dosa Cafe";
        String restaurant8 = "The Soup Mansion";

        for (int i = 0; i < 15; i++) {
            F1[i] = new Food_Deleivery1();
            F2[i] = new Food_Deleivery1();
            F3[i] = new Food_Deleivery1();
            F4[i] = new Food_Deleivery1();
            F5[i] = new Food_Deleivery1();
            F6[i] = new Food_Deleivery1();
            F7[i] = new Food_Deleivery1();
            F8[i] = new Food_Deleivery1();
        }
        F1[0].setData("Veg Biryani", 150);
        F1[1].setData("Kolkota Biryani", 200);
        F1[2].setData("Sindhi Biryani", 250);
        F1[3].setData("Memoni Biryani", 120);
        F1[4].setData("Malabar Biryani", 100);
        F1[5].setData("Ambur Biryani", 155);
        F1[6].setData("Dindigul Biryani", 170);
        F1[7].setData("Bombay Biryani", 230);
        F1[8].setData("Hyderabadi Biryani", 150);
        F1[9].setData("Thalassery Biryani", 145);
        F1[10].setData("Awadhi Biryani", 180);
        F1[11].setData("Bhatkali Biryani", 350);
        F1[12].setData("Tehari Biryani", 100);
        F1[13].setData("Delhi Biryani", 270);
        F1[14].setData("Kalyani Biryani", 350);
        F2[0].setData("Malai Kofta", 180);
        F2[1].setData("Paneer Butter Masala", 200);
        F2[2].setData("Paneer Lababdar", 220);
        F2[3].setData("Paneer Angara", 229);
        F2[4].setData("Cheese Butter Masala", 239);
        F2[5].setData("Paneer Kofta", 249);
        F2[6].setData("Paneer Bhurji", 250);
        F2[7].setData("Palak Paneer", 259);
        F2[8].setData("Shahi Paneer", 269);
        F2[9].setData("Kadhai Paneer", 249);
        F2[10].setData("Paneer Corn Masala", 270);
        F2[11].setData("Butter paratha", 79);
        F2[12].setData("Roti", 60);
        F2[13].setData("Butter Kulcha", 110);
        F2[14].setData("Butter naan", 90);
        F3[0].setData("Chinese Roll", 180);
        F3[1].setData("Schezwan Rice", 200);
        F3[2].setData("Dry Manchurian", 210);
        F3[3].setData("Gravy Manchurian", 229);
        F3[4].setData("Chinese Bhel", 139);
        F3[5].setData("Hakka Noodles", 149);
        F3[6].setData("Chow Mein", 150);
        F3[7].setData("Paneer Manchurian", 159);
        F3[8].setData("Steamed rice", 129);
        F3[9].setData("Veg chilli", 149);
        F3[10].setData("Paneer Garlic Chow", 170);
        F3[11].setData("Paneer Roll", 179);
        F3[12].setData("Pasta ", 160);
        F3[13].setData("White Sauce Pasta", 180);
        F3[14].setData("Red Sauce Pasta", 210);
        F4[0].setData("Margherita Pizza", 125);
        F4[1].setData("Sweet Corns Pizza", 155);
        F4[2].setData("Double Cheese Pizza", 175);
        F4[3].setData("Garden Delight Pizza", 175);
        F4[4].setData("Onion Pizza", 105);
        F4[5].setData("Burn To Hell Pizza", 239);
        F4[6].setData("Tandoori Paneer Pizza", 235);
        F4[7].setData("Cheezy 7 Pizza", 159);
        F4[8].setData("Peri Peri Pizza", 259);
        F4[9].setData("English Retreat Pizza", 265);
        F4[10].setData("Garlic Pizza", 185);
        F4[11].setData("Spring Pizza", 179);
        F4[12].setData("Onion and Paneer Pizza ", 195);
        F4[13].setData("Farm Villa Pizza", 160);
        F4[14].setData("Capsicum Pizza", 100);
        F5[0].setData("Vanilla Icecream", 65);
        F5[1].setData("Chocolate Icecream", 95);
        F5[2].setData("Butterscoth Icecream", 95);
        F5[3].setData("Strawberry Icecream", 95);
        F5[4].setData("Rasgulla", 65);
        F5[5].setData("Gulab Jamun", 65);
        F5[6].setData("Cheesecake", 125);
        F5[7].setData("Chocolate Cake", 150);
        F5[8].setData("Chocolate Pastry", 75);
        F5[9].setData("Hazelnut Brownie", 185);
        F5[10].setData("Thumbs Up", 45);
        F5[11].setData("Sprite", 45);
        F5[12].setData("Fanta", 45);
        F5[13].setData("Coca Cola", 45);
        F5[14].setData("Soda", 30);
        F6[0].setData("Veg Burger", 60);
        F6[1].setData("Aloo Tikki Burger", 70);
        F6[2].setData("Cheese Aloo Tikki Buger", 80);
        F6[3].setData("Schezwan Burger", 90);
        F6[4].setData("Peri Peri Burger", 90);
        F6[5].setData("Cheese Schezwan Burger", 110);
        F6[6].setData("Cheese Peri Peri Burger", 110);
        F6[7].setData("American Burger", 130);
        F6[8].setData("Farm Aloo Tikki", 135);
        F6[9].setData("Cheesy Fire House", 140);
        F6[10].setData("Crispy Masala Burger", 149);
        F6[11].setData("Spicy Paneer", 150);
        F6[12].setData("Fries", 89);
        F6[13].setData("Cheesy Fries", 100);
        F6[14].setData("Peri Peri Fries", 120);
        F7[0].setData("Idli Sambhar", 125);
        F7[1].setData("Masala Dosa", 145);
        F7[2].setData("Plain Dosa", 130);
        F7[3].setData("Mysore Masala Dosa", 160);
        F7[4].setData("Rava Ma sala Dosa", 160);
        F7[5].setData("Cheese Dosa", 140);
        F7[6].setData("Paneer Dosa", 160);
        F7[7].setData("Uttapam", 130);
        F7[8].setData("Masala Uttapam", 145);
        F7[9].setData("Cheese Uttapam", 155);
        F7[10].setData("Mendu Vada", 120);
        F7[11].setData("Upma", 110);
        F7[12].setData("Rava Upma", 130);
        F7[13].setData("Oats Upma", 130);
        F7[14].setData("Cheese Corn Mendu Vada", 150);
        F8[0].setData(" Tomato Soup", 100);
        F8[1].setData(" Veg Soup", 120);
        F8[2].setData(" Manchow Soup", 130);
        F8[3].setData(" Hot N Sour Soup", 130);
        F8[4].setData(" Garlic Soup", 130);
        F8[5].setData(" Cheese Tomato Soup", 140);
        F8[6].setData(" Corn Soup", 150);
        F8[7].setData(" Cheese Corn Soup", 160);
        F8[8].setData(" Sweet Corn Soup", 150);
        F8[9].setData(" ExEnter Soup", 140);
        F8[10].setData(" Spicy Tomato Soup", 150);
        F8[11].setData(" Spicy Corn Soup", 160);
        F8[12].setData(" Brocoli Soup", 140);
        F8[13].setData(" Lemon Coriander Soup", 130);
        F8[14].setData(" Asian Soup", 160);
        
        double total_bill = 0;
        System.out.println("   ---------------------------------");
        System.out.println("   Welcome to food management system");
        System.out.println("   ---------------------------------");
        System.out.println("Enter your username for create account ");
        String create_user_name = sc.nextLine();
        System.out.println("Enter password for create account");
        String create_password = sc.next();
        System.out.println("Conrgatulations! You have successfully created account ");
        System.out.println("--------------------------------------------------------");
        System.out.println("Login");
        int count_password = 0;
        while (count_password == 0) 
		{
            System.out.println("Enter username ");
            String confirm_user_name = sc.next();
            System.out.println("Enter login password");
            String confirm_password = sc.next();
            if ((confirm_user_name.compareToIgnoreCase(create_user_name) == 0)&& (confirm_password.compareToIgnoreCase(create_password) == 0)) 
			{
                System.out.println("Login Successfull !");
                System.out.println("--------------------------------------------------------");
                count_password++;
            } else {
                System.out.println("Incorrect user name or password ");
                System.out.println("Try Again ");
                System.out.println("--------------------------------------------------------");
            }
        }
		boolean condition = true;
        while (condition) 
		{
            System.out.println("Select from the belowing choices ");
            System.out.println("If you want to see all the dishes available at every restaurant. Enter 1 ");
            System.out.println("If you want to view dishes by category of food. Enter 2");
            System.out.println("If you want to search a restaurant by a dish. Enter 3");
            System.out.println("If you want to view dishes of a particular restaurant. Enter 4");
            System.out.println("If you want to order food. Enter 5 ");
            System.out.println("If you want to exit the app. Enter 6 ");
            int choice = sc.nextInt();
            System.out.println("--------------------------------------------------------");
            switch (choice) 
			{
                case 1:
                    System.out.println("The name of restaurant is " + restaurant1);
                    System.out.println("The dishes available are ");
                    for (int i = 0; i < 15; i++) 
					{
                        F1[i].display();
                    }
                    System.out.println("The name of restaurant is " + restaurant2);
                    System.out.println("The dishes available are ");
                    for (int i = 0; i < 15; i++) 
					{
                        F2[i].display();
                    }
                    System.out.println("The name of restaurant is " + restaurant3);
                    System.out.println("The dishes available are ");
                    for (int i = 0; i < 15; i++) 
					{
                        F3[i].display();
                    }
                    System.out.println("The name of restaurant is " + restaurant4);
                    System.out.println("The dishes available are ");
                    for (int i = 0; i < 15; i++) 
					{
                        F4[i].display();
                    }
                    System.out.println("The name of restaurant is " + restaurant5);
                    System.out.println("The dishes available are ");
                    for (int i = 0; i < 15; i++) 
					{
                        F5[i].display();
                    }
                    System.out.println("The name of restaurant is " + restaurant6);
                    System.out.println("The dishes available are ");
                    for (int i = 0; i < 15; i++) 
					{
                        F6[i].display();
                    }
                    System.out.println("The name of restaurant is " + restaurant7);
                    System.out.println("The dishes available are ");
                    for (int i = 0; i < 15; i++) 
					{
                        F7[i].display();
                    }
                    System.out.println("The name of restaurant is " + restaurant8);
                    System.out.println("The dishes available are ");
                    for (int i = 0; i < 15; i++) 
					{
                        F8[i].display();
                    }
                    break;
                case 2:
                    System.out.println("Select your desired category");
                    System.out.println("Enter 1 for Biryani");
                    System.out.println("Enter 2 for North Indian");
                    System.out.println("Enter 3 for Chinese Food");
                    System.out.println("Enter 4 for Pizza");
                    System.out.println("Enter 5 for Desserts and Ice Cream");
                    System.out.println("Enter 6 for Burger");
                    System.out.println("Enter 7 for South Indian");
                    System.out.println("Enter 8 for Soup ");
                    System.out.println("--------------------------------------------------------");
                    int choice1 = sc.nextInt();
                    switch (choice1) 
					{
                        case 1:
                            System.out.println("The available dishes are ");
                            for (int i = 0; i < 15; i++) 
							{
                                F1[i].display();
                            }
                            break;
                        case 2:
                            System.out.println("The available dishes are ");
                            for (int i = 0; i < 15; i++) 
							{
                                F2[i].display();
                            }
                            break;
                        case 3:
                            System.out.println("The available dishes are ");
                            for (int i = 0; i < 15; i++) 
							{
                                F3[i].display();
                            }
                            break;
                        case 4:
                            System.out.println("The available dishes are ");
                            for (int i = 0; i < 15; i++) 
							{
                                F4[i].display();
                            }
                            break;
                        case 5:
                            System.out.println("The available dishes are ");
                            for (int i = 0; i < 15; i++) 
							{
                                F5[i].display();
                            }
                            break;
                        case 6:
                            System.out.println("The available dishes are ");
                            for (int i = 0; i < 15; i++) 
							{
                                F6[i].display();
                            }
                            break;
                        case 7:
                            System.out.println("The available dishes are ");
                            for (int i = 0; i < 15; i++) 
							{
                                F7[i].display();
                            }
                            break;
                        case 8:
                            System.out.println("The available dishes are ");
                            for (int i = 0; i < 15; i++) 
							{
                                F8[i].display();
                            }
                            break;
                        default:
                            System.out.println("Enter correct choice ");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter name of the dish ");
                    sc.nextLine();
                    String search_dish = sc.nextLine();
                    int count = 0;
                    for (int i = 0; i < 15; i++) 
					{
                        if (search_dish.compareToIgnoreCase(F1[i].dish) == 0) 
						{
                            System.out.println("The name of the restaurant that has this dish is " + restaurant1);
                            System.out.println("The price of the dish is " + F1[i].price);
                            count++;
                            System.out.println("--------------------------------------------------------");
                        } 
						else if (search_dish.compareToIgnoreCase(F2[i].dish) == 0) 
						{
                            System.out.println("The name of the restaurant that has this dish is " + restaurant2);
                            System.out.println("The price of the dish is " + F2[i].price);
                            count++;
                            System.out.println("--------------------------------------------------------");
                        } 
						else if (search_dish.compareToIgnoreCase(F3[i].dish) == 0) 
						{
                            System.out.println("The name of the restaurant that has this dish is " + restaurant3);
                            System.out.println("The price of the dish is " + F3[i].price);
                            count++;
                            System.out.println("--------------------------------------------------------");
                        } 
						else if (search_dish.compareToIgnoreCase(F4[i].dish) == 0) 
						{
                            System.out.println("The name of the restaurant that has this dish is " + restaurant4);
                            System.out.println("The price of the dish is " + F4[i].price);
                            count++;
                            System.out.println("--------------------------------------------------------");
                        } 
						else if (search_dish.compareToIgnoreCase(F5[i].dish) == 0) 
						{
                            System.out.println("The name of the restaurant that has this dish is " + restaurant5);
                            System.out.println("The price of the dish is " + F5[i].price);
                            count++;
                            System.out.println("--------------------------------------------------------");
                        } 
						else if (search_dish.compareToIgnoreCase(F6[i].dish) == 0) 
						{
                            System.out.println("The name of the restaurant that has this dish is " + restaurant6);
                            System.out.println("The price of the dish is " + F6[i].price);
                            count++;
                            System.out.println("--------------------------------------------------------");
                        } 
						else if (search_dish.compareToIgnoreCase(F7[i].dish) == 0) 
						{
                            System.out.println("The name of the restaurant that has this dish is " + restaurant7);
                            System.out.println("The price of the dish is " + F7[i].price);
                            count++;
                            System.out.println("--------------------------------------------------------");
                        } 
						else if (search_dish.compareToIgnoreCase(F8[i].dish) == 0) 
						{
                            System.out.println("The name of the restaurant that has this dish is " + restaurant8);
                            System.out.println("The price of the dish is " + F8[i].price);
                            count++;
                            System.out.println("--------------------------------------------------------");
                        }
                    }
                    if (count == 0) 
					{
                        System.out.println("No dish found with the name " + search_dish);
                    }
                    break;
                case 4:
                    System.out.println("Select a restaurant to view all their dishes ");
                    System.out.println("1. The Biryani Life");
                    System.out.println("2. Bizz Restaurant");
                    System.out.println("3. Prince Chinese Food");
                    System.out.println("4. La Pinoz Pizza");
                    System.out.println("5. Sweet Truth Restaurant");
                    System.out.println("6. Salim Burger");
                    System.out.println("7. The Dosa Cafe");
                    System.out.println("8. The Soup Mansion");
                    int choice2 = sc.nextInt();
                    switch (choice2) 
					{
                        case 1:
                            System.out.println("The Biryani Life");
                            System.out.println("--------------------------------------------------------");
                            for (int i = 0; i < 15; i++) 
							{
                                F1[i].display();
                            }
                            break;
                        case 2:
                            System.out.println("Bizz Restaurant");
                            System.out.println("--------------------------------------------------------");
                            for (int i = 0; i < 15; i++) 
							{
                                F2[i].display();
                            }
                            break;
                        case 3:
                            System.out.println("Prince Chinese Food");
                            System.out.println("--------------------------------------------------------");
                            for (int i = 0; i < 15; i++) 
							{
                                F3[i].display();
                            }
                            break;
                        case 4:
                            System.out.println("La Pinoz Pizza");
                            System.out.println("--------------------------------------------------------");
                            for (int i = 0; i < 15; i++) 
							{
                                F4[i].display();
                            }
                            break;
                        case 5:
                            System.out.println("Sweet Truth Restaurant");
                            System.out.println("--------------------------------------------------------");
                            for (int i = 0; i < 15; i++) 
							{
                                F5[i].display();
                            }
                            break;
                        case 6:
                            System.out.println("Salim Burger");
                            System.out.println("--------------------------------------------------------");
                            for (int i = 0; i < 15; i++)
							{
                                F6[i].display();
                            }
                            break;
                        case 7:
                            System.out.println("The Dosa Cafe");
                            System.out.println("--------------------------------------------------------");
                            for (int i = 0; i < 15; i++) 
							{
                                F7[i].display();
                            }
                            break;
                        case 8:
                            System.out.println("The Soup Mansion");
                            System.out.println("--------------------------------------------------------");
                            for (int i = 0; i < 15; i++) 
							{
                                F8[i].display();
                            }
                            break;
                        default:
                            System.out.println("Enter correct choice");
                            System.out.println("--------------------------------------------------------");
                            break;
                    }
                    break;
                case 5:
                    boolean condition2 = true;
                    while (condition2) 
					{
                        System.out.println("If you want to order by dish name. Enter 1");
                        System.out.println("If you want to order from a particular restaurant. Enter 2");
                        int choice3 = sc.nextInt();
                        boolean condition1 = true;
                        switch (choice3) 
						{
                            case 1:
                                while (condition1) 
								{
                                    System.out.println("Enter name of the dish ");
                                    sc.nextLine();
                                    String search_dish_for_order = sc.nextLine();
                                    int count1 = 0;
                                    for (int i = 0; i < 15; i++) 
									{
                                        if (search_dish_for_order.compareToIgnoreCase(F1[i].dish) == 0) 
										{
                                            System.out.println("The name of the restaurant that has this dish is " + restaurant1);
                                            System.out.println("The price of the dish is " + F1[i].price);
                                            count1++;
                                            System.out.println("--------------------------------------------------------");
                                            System.out.println("If you want to add dish to your cart Enter 1");
                                            System.out.println("If you do not want to add dish to your cart Enter 2");
                                            int choice_dish = sc.nextInt();
                                            if (choice_dish == 1) 
											{
                                                System.out.println("You have successfully added this dish to your cart");
                                                total_bill += F1[i].price;
                                                System.out.println("--------------------------------------------------------");
                                            }
                                        } 
										else if (search_dish_for_order.compareToIgnoreCase(F2[i].dish) == 0) 
										{
                                            System.out.println("The name of the restaurant that has this dish is " + restaurant2);
                                            System.out.println("The price of the dish is " + F2[i].price);
                                            count1++;
                                            System.out.println("--------------------------------------------------------");
                                            System.out.println("If you want to add dish to your cart Enter 1");
                                            System.out.println("If you do not want to add dish to your cart Enter 2");
                                            int choice_dish = sc.nextInt();
                                            if (choice_dish == 1) 
											{
                                                System.out.println("You have successfully added this dish to your cart");
                                                total_bill += F2[i].price;
                                                System.out.println("--------------------------------------------------------");
                                            }
                                        } 
										else if (search_dish_for_order.compareToIgnoreCase(F3[i].dish) == 0) 
										{
                                            System.out.println("The name of the restaurant that has this dish is " + restaurant3);
                                            System.out.println("The price of the dish is " + F3[i].price);
                                            count1++;
                                            System.out.println("--------------------------------------------------------");
                                            System.out.println("If you want to add dish to your cart Enter 1");
                                            System.out.println("If you do not want to add dish to your cart Enter 2");
                                            int choice_dish = sc.nextInt();
                                            if (choice_dish == 1) 
											{
                                                System.out.println("You have successfully added this dish to your cart");
                                                total_bill += F3[i].price;
                                                System.out.println("--------------------------------------------------------");
                                            }
                                        } 
										else if (search_dish_for_order.compareToIgnoreCase(F4[i].dish) == 0) 
										{
                                            System.out.println("The name of the restaurant that has this dish is " + restaurant4);
                                            System.out.println("The price of the dish is " + F4[i].price);
                                            count1++;
                                            System.out.println("--------------------------------------------------------");
                                            System.out.println("If you want to add dish to your cart Enter 1");
                                            System.out.println("If you do not want to add dish to your cart Enter 2");
                                            int choice_dish = sc.nextInt();
                                            if (choice_dish == 1) 
											{
                                                System.out.println("You have successfully added this dish to your cart");
                                                total_bill += F4[i].price;
                                                System.out.println("--------------------------------------------------------");
                                            }
                                        } 
										else if (search_dish_for_order.compareToIgnoreCase(F5[i].dish) == 0) 
										{
                                            System.out.println("The name of the restaurant that has this dish is " + restaurant5);
                                            System.out.println("The price of the dish is " + F5[i].price);
                                            count1++;
                                            System.out.println("--------------------------------------------------------");
                                            System.out.println("If you want to add dish to your cart Enter 1");
                                            System.out.println("If you do not want to add dish to your cart Enter 2");
                                            int choice_dish = sc.nextInt();
                                            if (choice_dish == 1) 
											{
                                                System.out.println("You have successfully added this dish to your cart");
                                                total_bill += F5[i].price;
                                                System.out.println("--------------------------------------------------------");
                                            }
                                        } 
										else if (search_dish_for_order.compareToIgnoreCase(F6[i].dish) == 0) 
										{
                                            System.out.println("The name of the restaurant that has this dish is " + restaurant6);
                                            System.out.println("The price of the dish is " + F6[i].price);
                                            count1++;
                                            System.out.println("--------------------------------------------------------");
                                            System.out.println("If you want to add dish to your cart Enter 1");
                                            System.out.println("If you do not want to add dish to your cart Enter 2");
                                            int choice_dish = sc.nextInt();
                                            if (choice_dish == 1) 
											{
                                                System.out.println("You have successfully added this dish to your cart");
                                                total_bill += F6[i].price;
                                                System.out.println("--------------------------------------------------------");
                                            }
                                        } 
										else if (search_dish_for_order.compareToIgnoreCase(F7[i].dish) == 0) 
										{
                                            System.out.println("The name of the restaurant that has this dish is " + restaurant7);
                                            System.out.println("The price of the dish is " + F7[i].price);
                                            count1++;
                                            System.out.println("--------------------------------------------------------");
                                            System.out.println("If you want to add dish to your cart Enter 1");
                                            System.out.println("If you do not want to add dish to your cart Enter 2");
                                            int choice_dish = sc.nextInt();
                                            if (choice_dish == 1) 
											{
                                                System.out.println("You have successfully added this dish to your cart");
                                                total_bill += F7[i].price;
                                                System.out.println("--------------------------------------------------------");
                                            }
                                        } 
										else if (search_dish_for_order.compareToIgnoreCase(F8[i].dish) == 0) 
										{
                                            System.out.println("The name of the restaurant that has this dish is " + restaurant8);
                                            System.out.println("The price of the dish is " + F8[i].price);
                                            count1++;
                                            System.out.println("--------------------------------------------------------");
                                            System.out.println("If you want to add dish to your cart Enter 1");
                                            System.out.println("If you do not want to add dish to your cart Enter 2");
                                            int choice_dish = sc.nextInt();
                                            if (choice_dish == 1) 
											{
                                                System.out.println("You have successfully added this dish to your cart");
                                                total_bill += F8[i].price;
                                                System.out.println("--------------------------------------------------------");
                                            }
                                        }
                                    }
                                    if (count1 == 0) 
									{
                                        System.out.println("No dish found with the name " + search_dish_for_order);
                                    }
                                    System.out.println("Do you want to add anything to your cart. Enter 1");
                                    System.out.println("If you want to confirm your order . Enter 2");
                                    int choice_exit = sc.nextInt();
                                    switch (choice_exit) 
									{
                                        case 1:
                                            break;
                                        case 2:
                                            condition1 = false;
                                            break;
                                        default:
                                            System.out.println("Enter correct choice");
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                boolean condition3 = true;
                                while (condition3) 
								{
                                    System.out.println("Select a restaurant you wish to order from ");
                                    System.out.println("1. The Biryani Life");
                                    System.out.println("2. Bizz Restaurant");
                                    System.out.println("3. Prince Chinese Food");
                                    System.out.println("4. La Pinoz Pizza");
                                    System.out.println("5. Sweet Truth Restaurant");
                                    System.out.println("6. Salim Burger");
                                    System.out.println("7. The Dosa Cafe");
                                    System.out.println("8. The Soup Mansion");
                                    int choice4 = sc.nextInt();
                                    switch (choice4) 
									{
                                        case 1:
                                            System.out.println("The Biryani Life");
                                            System.out.println(
                                                    "--------------------------------------------------------");
                                            for (int i = 0; i < 15; i++) 
											{
                                                System.out.println("Enter " + (i + 1) + " for " + F1[i].dish+ " with price " + F1[i].price);
                                            }
                                            boolean condition4 = true;
                                            while (condition4) 
											{
                                                System.out.println("--------------------------------------------------------");
                                                System.out.println("Select the dish you want to order ");
                                                int choice_dish_restaurant1 = sc.nextInt();
                                                choice_dish_restaurant1--;
                                                for (int i = 0; i < 15; i++) 
												{
                                                    if (i == choice_dish_restaurant1) 
													{
                                                        System.out.println("The dish is successfully added to cart ");
                                                        System.out.println("--------------------------------------------------------");
                                                        total_bill += F1[i].price;
                                                    }
                                                }
                                                System.out.println("Do you want to order any other dish? Enter 1");
                                                System.out.println("If you want to exit this restaurant. Enter 2");
                                                int condition_for_exit = sc.nextInt();
                                                System.out.println("--------------------------------------------------------");
                                                switch (condition_for_exit) 
												{
                                                    case 1:
                                                        break;
                                                    case 2:
                                                        condition4 = false;
                                                        break;
                                                    default:
                                                        condition = false;
                                                        System.out.println("Enter correct choice");
                                                        break;
                                                }
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Bizz Restaurant");
                                            System.out.println("--------------------------------------------------------");
                                            for (int i = 0; i < 15; i++) 
											{
                                                System.out.println("Enter " + (i + 1) + " for " + F2[i].dish+ " with price " + F2[i].price);
                                            }
                                            boolean condition5 = true;
                                            while (condition5) {
                                                System.out.println("--------------------------------------------------------");
                                                System.out.println("Select the dish you want to order ");
                                                int choice_dish_restaurant2 = sc.nextInt();
                                                choice_dish_restaurant2--;
                                                for (int i = 0; i < 15; i++) 
												{
                                                    if (i == choice_dish_restaurant2) 
													{
                                                        System.out.println("The dish is successfully added to cart ");
                                                        System.out.println("--------------------------------------------------------");
                                                        total_bill += F2[i].price;
                                                    }
                                                }
                                                System.out.println("Do you want to order any other dish? Enter 1");
                                                System.out.println("If you want to exit this restaurant. Enter 2");
                                                int condition_for_exit = sc.nextInt();
                                                System.out.println("--------------------------------------------------------");
                                                switch (condition_for_exit) 
												{
                                                    case 1:
                                                        break;
                                                    case 2:
                                                        condition5 = false;
                                                        break;
                                                    default:
                                                        condition5 = false;
                                                        System.out.println("Enter correct choice");
                                                        break;
                                                }
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Prince Chinese Food");
                                            System.out.println("--------------------------------------------------------");
                                            for (int i = 0; i < 15; i++) 
											{
                                                System.out.println("Enter " + (i + 1) + " for " + F3[i].dish+ " with price " + F3[i].price);
                                            }
                                            System.out.println("--------------------------------------------------------");
                                            boolean condition6 = true;
                                            while (condition6) 
											{
                                                System.out.println("Select the dish you want to order ");
                                                int choice_dish_restaurant3 = sc.nextInt();
                                                choice_dish_restaurant3--;
                                                for (int i = 0; i < 15; i++) 
												{
                                                    if (i == choice_dish_restaurant3) 
													{
                                                        System.out.println("The dish is successfully added to cart ");
                                                        System.out.println("--------------------------------------------------------");
                                                        total_bill += F3[i].price;
                                                    }
                                                }
                                                System.out.println("Do you want to order any other dish? Enter 1");
                                                System.out.println("If you want to exit this restaurant. Enter 2");
                                                int condition_for_exit = sc.nextInt();
                                                System.out.println("--------------------------------------------------------");
                                                switch (condition_for_exit) 
												{
                                                    case 1:
                                                        break;
                                                    case 2:
                                                        condition6 = false;
                                                        break;
                                                    default:
                                                        condition6 = false;
                                                        System.out.println("Enter correct choice");
                                                        break;
                                                }
                                            }
                                            break;
                                        case 4:
                                            System.out.println("La Pinoz Pizza");
                                            System.out.println("--------------------------------------------------------");
                                            for (int i = 0; i < 15; i++) 
											{
                                                System.out.println("Enter " + (i + 1) + " for " + F4[i].dish+ " with price " + F4[i].price);
                                            }
                                            System.out.println("--------------------------------------------------------");
                                            boolean condition7 = true;
                                            while (condition7) 
											{
                                                System.out.println("Select the dish you want to order ");
                                                int choice_dish_restaurant4 = sc.nextInt();
                                                choice_dish_restaurant4--;
                                                for (int i = 0; i < 15; i++) 
												{
                                                    if (i == choice_dish_restaurant4) 
													{
                                                        System.out.println("The dish is successfully added to cart ");
                                                        System.out.println("--------------------------------------------------------");
                                                        total_bill += F4[i].price;
                                                    }
                                                }
                                                System.out.println("Do you want to order any other dish? Enter 1");
                                                System.out.println("If you want to exit this restaurant. Enter 2");
                                                int condition_for_exit = sc.nextInt();
                                                System.out.println("--------------------------------------------------------");
                                                switch (condition_for_exit) 
												{
                                                    case 1:
                                                        break;
                                                    case 2:
                                                        condition7 = false;
                                                        break;
                                                    default:
                                                        condition7 = false;
                                                        System.out.println("Enter correct choice");
                                                        break;
                                                }
                                            }
                                            break;
                                        case 5:
                                            System.out.println("Sweet Truth Restaurant");
                                            System.out.println("--------------------------------------------------------");
                                            for (int i = 0; i < 15; i++) 
											{
                                                System.out.println("Enter " + (i + 1) + " for " + F5[i].dish+ " with price " + F5[i].price);
                                            }
                                            System.out.println("--------------------------------------------------------");
                                            boolean condition8 = true;
                                            while (condition8) 
											{
                                                System.out.println("Select the dish you want to order ");
                                                int choice_dish_restaurant5 = sc.nextInt();
                                                choice_dish_restaurant5--;
                                                for (int i = 0; i < 15; i++) 
												{
                                                    if (i == choice_dish_restaurant5) 
													{
                                                        System.out.println("The dish is successfully added to cart ");
                                                        System.out.println("--------------------------------------------------------");
                                                        total_bill += F5[i].price;
                                                    }
                                                }
                                                System.out.println("Do you want to order any other dish? Enter 1");
                                                System.out.println("If you want to exit this restaurant. Enter 2");
                                                int condition_for_exit = sc.nextInt();
                                                System.out.println("--------------------------------------------------------");
                                                switch (condition_for_exit) 
												{
                                                    case 1:
                                                        break;
                                                    case 2:
                                                        condition8 = false;
                                                        break;
                                                    default:
                                                        condition8 = false;
                                                        System.out.println("Enter correct choice");
                                                        break;
                                                }
                                            }
                                            break;
                                        case 6:
                                            System.out.println("Salim Burger");
                                            System.out.println("--------------------------------------------------------");
                                            for (int i = 0; i < 15; i++) 
											{
                                                System.out.println("Enter " + (i + 1) + " for " + F6[i].dish+ " with price " + F6[i].price);
                                            }
                                            System.out.println("--------------------------------------------------------");
                                            boolean condition9 = true;
                                            while (condition9) {
                                                System.out.println("Select the dish you want to order ");
                                                int choice_dish_restaurant6 = sc.nextInt();
                                                choice_dish_restaurant6--;
                                                for (int i = 0; i < 15; i++) 
												{
                                                    if (i == choice_dish_restaurant6) 
													{
                                                        System.out.println("The dish is successfully added to cart ");
                                                        System.out.println("--------------------------------------------------------");
                                                        total_bill += F6[i].price;
                                                    }
                                                }
                                                System.out.println("Do you want to order any other dish? Enter 1");
                                                System.out.println("If you want to exit this restaurant. Enter 2");
                                                int condition_for_exit = sc.nextInt();
                                                System.out.println("--------------------------------------------------------");
                                                switch (condition_for_exit) 
												{
                                                    case 1:
                                                        break;
                                                    case 2:
                                                        condition9 = false;
                                                        break;
                                                    default:
                                                        condition9 = false;
                                                        System.out.println("Enter correct choice");
                                                        break;
                                                }
                                            }
                                            break;
                                        case 7:
                                            System.out.println("The Dosa Cafe");
                                            System.out.println("--------------------------------------------------------");
                                            for (int i = 0; i < 15; i++) 
											{
                                                System.out.println("Enter " + (i + 1) + " for " + F7[i].dish+ " with price " + F7[i].price);
                                            }
                                            System.out.println("--------------------------------------------------------");
                                            boolean condition10 = true;
                                            while (condition10) 
											{
                                                System.out.println("Select the dish you want to order ");
                                                int choice_dish_restaurant7 = sc.nextInt();
                                                choice_dish_restaurant7--;
                                                for (int i = 0; i < 15; i++) 
												{
                                                    if (i == choice_dish_restaurant7) 
													{
                                                        System.out.println("The dish is successfully added to cart ");
                                                        System.out.println("--------------------------------------------------------");
                                                        total_bill += F7[i].price;
                                                    }
                                                }
                                                System.out.println("Do you want to order any other dish? Enter 1");
                                                System.out.println("If you want to exit this restaurant. Enter 2");
                                                int condition_for_exit = sc.nextInt();
                                                System.out.println("--------------------------------------------------------");
                                                switch (condition_for_exit) 
												{
                                                    case 1:
                                                        break;
                                                    case 2:
                                                        condition10 = false;
                                                        break;
                                                    default:
                                                        condition10 = false;
                                                        System.out.println("Enter correct choice");
                                                        break;
                                                }
                                            }
                                            break;
                                        case 8:
                                            System.out.println("The Soup Mansion");
                                            System.out.println("--------------------------------------------------------");
                                            for (int i = 0; i < 15; i++) 
											{
                                                System.out.println("Enter " + (i + 1) + " for " + F8[i].dish+ " with price " + F8[i].price);
                                            }
                                            System.out.println("--------------------------------------------------------");
                                            boolean condition11 = true;
                                            while (condition11) 
											{
                                                System.out.println("Select the dish you want to order ");
                                                int choice_dish_restaurant8 = sc.nextInt();
                                                choice_dish_restaurant8--;
                                                for (int i = 0; i < 15; i++) 
												{
                                                    if (i == choice_dish_restaurant8) 
													{
                                                        System.out.println("The dish is successfully added to cart ");
                                                        System.out.println("--------------------------------------------------------");
                                                        total_bill += F8[i].price;
                                                    }
                                                }
                                                System.out.println("Do you want to order any other dish? Enter 1");
                                                System.out.println("If you want to exit this restaurant. Enter 2");
                                                int condition_for_exit = sc.nextInt();
                                                System.out.println("--------------------------------------------------------");
                                                switch (condition_for_exit) 
												{
                                                    case 1:
                                                        break;
                                                    case 2:
                                                        condition11 = false;
                                                        break;
                                                    default:
                                                        condition11 = false;
                                                        System.out.println("Enter correct choice");
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            System.out.println("Enter correct choice");
                                            System.out.println("--------------------------------------------------------");
                                            break;
                                    }
                                    System.out.println("Do you want to order anything from other restaurant. If yes Enter 1 and if no enter 2");
                                    int choice5 = sc.nextInt();
									if (choice5 == 2) 
									{
                                        condition3 = false;
                                    }
                                }
                                System.out.println("--------------------------------------------------------");
                                break;
                            default:
                                System.out.println("Enter correct choice");
                        }
                        System.out.println("Do you want to order anything again? If yes enter 1 or enter 2");
                        int choice_for_exit = sc.nextInt();
                        System.out.println("--------------------------------------------------------");
                        if (choice_for_exit == 2) 
						{
                            condition2 = false;
                        }
                    }
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Your total bill is " + total_bill);
                    System.out.println("--------------------------------------------------------");
                    double gst = total_bill * 0.05;
                    System.out.println("The gst of this amount is " + (gst));
                    System.out.println("--------------------------------------------------------");
                    total_bill += gst;
                    System.out.println("So your total bill after gst is " + total_bill);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Great. There is a quiz ahead.");
                    System.out.println("There are 10 questions. ");
                    System.out.println("If you answer 5 questions correctly you get 10% discount  ");
                    System.out.println("If you answer more than 5 questions correctly you get 15% discount  ");
                    System.out.println("If you answer 10 questions correctly you get 20% discount  ");
                    System.out.println("--------------------------------------------------------");
                    int count_correct_answer = 0;
                    double discount = 0;
                    System.out.println("There are how many days in a year? (Not a leap year) ");
                    System.out.println("1. 367");
                    System.out.println("2. 365");
                    System.out.println("3. 366 ");
                    System.out.println("4. 364");
                    int quiz_answer1 = sc.nextInt();
                    System.out.println("--------------------------------------------------------");
                    if (quiz_answer1 == 2) 
					{
                        System.out.println("Great. Your answer is correct ");
                        System.out.println("--------------------------------------------------------");
                        count_correct_answer++;
                    } 
					else 
					{
                        System.out.println("Oops. You got the wrong answer ");
                        System.out.println("The correct answer is 2. 365");
                        System.out.println("--------------------------------------------------------");
                    }
                    System.out.println("Indus river originates with ");
                    System.out.println("1. Tibet");
                    System.out.println("2. Ladakh");
                    System.out.println("3. Nepal");
                    System.out.println("4. Kinnaur");
                    int quiz_answer2 = sc.nextInt();
                    System.out.println("--------------------------------------------------------");
                    if (quiz_answer2 == 1) 
					{
                        System.out.println("Great. Your answer is correct ");
                        System.out.println("--------------------------------------------------------");
                        count_correct_answer++;
                    } 
					else 
					{
                        System.out.println("Oops. You got the wrong answer ");
                        System.out.println("The correct answer is 1. Tibet");
                        System.out.println("--------------------------------------------------------");
                    }
                    System.out.println("The hottest planet in the solar system is ");
                    System.out.println("1. Earth");
                    System.out.println("2. Mercury");
                    System.out.println("3. Venus");
                    System.out.println("4. Mars");
                    int quiz_answer3 = sc.nextInt();
                    System.out.println("--------------------------------------------------------");
                    if (quiz_answer3 == 3) 
					{
                        System.out.println("Great. Your answer is correct ");
                        System.out.println("--------------------------------------------------------");
                        count_correct_answer++;
                    } 
					else 
					{
                        System.out.println("Oops. You got the wrong answer ");
                        System.out.println("The correct answer is 3. Venus ");
                        System.out.println("--------------------------------------------------------");
                    }
                    System.out.println("Where was the electricty supllied first in India");
                    System.out.println("1. Mumbai");
                    System.out.println("2. Dehradun");
                    System.out.println("3. Darjeeling");
                    System.out.println("4. Chennai");
                    int quiz_answer4 = sc.nextInt();
                    System.out.println("--------------------------------------------------------");
                    if (quiz_answer4 == 3) 
					{
                        System.out.println("Great. Your answer is correct ");
                        System.out.println("--------------------------------------------------------");
                        count_correct_answer++;
                    } 
					else 
					{
                        System.out.println("Oops. You got the wrong answer ");
                        System.out.println("The correct answer is 3. Darjeeling");
                        System.out.println("--------------------------------------------------------");
                    }
                    System.out.println("Where is Taj Mahal located?");
                    System.out.println("1. Agra");
                    System.out.println("2. Chennai");
                    System.out.println("3. Rajkot");
                    System.out.println("4. Kutch");
                    int quiz_answer5 = sc.nextInt();
                    System.out.println("--------------------------------------------------------");
                    if (quiz_answer5 == 1) 
					{
                        System.out.println("Great. Your answer is correct ");
                        System.out.println("--------------------------------------------------------");
                        count_correct_answer++;
                    } 
					else 
					{
                        System.out.println("Oops. You got the wrong answer ");
                        System.out.println("The correct answer is 1. Agra");
                        System.out.println("--------------------------------------------------------");
                    }
                    System.out.println("The sum of all probabilities is ");
                    System.out.println("1. 0.5");
                    System.out.println("2. 0.75");
                    System.out.println("3. 0.9");
                    System.out.println("4. 1");
                    System.out.println("--------------------------------------------------------");
                    int quiz_answer6 = sc.nextInt();
                    if (quiz_answer6 == 4) 
					{
                        System.out.println("Great. Your answer is correct ");
                        System.out.println("--------------------------------------------------------");
                        count_correct_answer++;
                    } 
					else 
					{
                        System.out.println("Oops. You got the wrong answer ");
                        System.out.println("The correct answer is 4. 1");
                        System.out.println("--------------------------------------------------------");
                    }
                    System.out.println("Which month have 28 days ");
                    System.out.println("1. February");
                    System.out.println("2. All months");
                    System.out.println("3. Januray");
                    System.out.println("4. December");
                    int quiz_answer7 = sc.nextInt();
                    System.out.println("--------------------------------------------------------");
                    if (quiz_answer7 == 1) 
					{
                        System.out.println("Great. Your answer is correct ");
                        System.out.println("--------------------------------------------------------");
                        count_correct_answer++;
                    } 
					else 
					{
                        System.out.println("Oops. You got the wrong answer ");
                        System.out.println("The correct answer is 1. February");
                        System.out.println("--------------------------------------------------------");
                    }
                    System.out.println("What is gravity of earth?");
                    System.out.println("1. 9.8");
                    System.out.println("2. 10");
                    System.out.println("3. 9.6");
                    System.out.println("4. 9.7");
                    int quiz_answer8 = sc.nextInt();
                    System.out.println("--------------------------------------------------------");
                    if (quiz_answer8 == 1) 
					{
                        System.out.println("Great. Your answer is correct ");
                        System.out.println("--------------------------------------------------------");
                        count_correct_answer++;
                    } 
					else 
					{
                        System.out.println("Oops. You got the wrong answer ");
                        System.out.println("The correct answer is 1. 9.8");
                        System.out.println("--------------------------------------------------------");
                    }
                    System.out.println("In which year India attained Independence");
                    System.out.println("1. 1947");
                    System.out.println("2. 1951");
                    System.out.println("3. 1948");
                    System.out.println("4. 1952");
                    int quiz_answer9 = sc.nextInt();
                    System.out.println("--------------------------------------------------------");
                    if (quiz_answer9 == 1) 
					{
                        System.out.println("Great. Your answer is correct ");
                        System.out.println("--------------------------------------------------------");
                        count_correct_answer++;
                    } 
					else 
					{
                        System.out.println("Oops. You got the wrong answer ");
                        System.out.println("The correct answer is 1. 1947");
                        System.out.println("--------------------------------------------------------");
                    }
                    System.out.println("How many hours are there in a week ?");
                    System.out.println("1. 168");
                    System.out.println("2. 172");
                    System.out.println("3. 192");
                    System.out.println("4. 144");
                    int quiz_answer10 = sc.nextInt();
                    System.out.println("--------------------------------------------------------");
                    if (quiz_answer10 == 1) 
					{
                        System.out.println("Great. Your answer is correct ");
                        System.out.println("--------------------------------------------------------");
                        count_correct_answer++;
                    } 
					else 
					{
                        System.out.println("Oops. You got the wrong answer ");
                        System.out.println("The correct answer is 1. 168");
                        System.out.println("--------------------------------------------------------");
                    }
                    if (count_correct_answer == 5) 
					{
                        System.out.println("Congratulations! You got 10% discount");
                        discount = total_bill * 0.1;
                        System.out.println("Your discount ont order of " + total_bill + " is " + discount);
                        total_bill -= discount;
                    } 
					else if (count_correct_answer > 5 && count_correct_answer < 10) 
					{
                        System.out.println("Congratulations! You got 15% discount");
                        discount = total_bill * 0.15;
                        System.out.println("Your discount ont order of " + total_bill + " is " + discount);
                        total_bill -= discount;
                    } 
					else if (count_correct_answer == 10) 
					{
                        System.out.println("Congratulations! You got 20% discount");
                        discount = total_bill * 0.2;
                        System.out.println("Your discount ont order of " + total_bill + " is " + discount);
                        total_bill -= discount;
                    } 
					else 
					{
                        System.out.println("Sorry! You got no discount ");
                    }
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Your total bill after discount is " + total_bill);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Please Rate Us !");
                    System.out.println("1. Poor quality");
                    System.out.println("2. Can improve");
                    System.out.println("3. Moderate");
                    System.out.println("4. Excellent*");
                    System.out.println("5. Outstanding");
                    int rate = sc.nextInt();
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Thank you for rating us ");
                    switch (rate) 
					{
                        case 1:
                            System.out.println("*");
                            break;
                        case 2:
                            System.out.println("* *");
                            break;
                        case 3:
                            System.out.println("* * *");
                            break;
                        case 4:
                            System.out.println("* * * *");
                            break;
                        case 5:
                            System.out.println("* * * * *");
                            break;
                        default:
                            System.out.println("Incorrect choice");
                            break;
                    }
                    System.out.println("--------------------------------------------------------");
                case 6:
                    condition = false;
                    System.out.println("Thank you . Have a great day! ");
                    break;
                default:
                    System.out.println("Enter correct choice ");
                    break;
            }
        }
    }
}