import java.util.*;
class Sim
{
	Scanner sc=new Scanner(System.in);
	String name,address,aadhar_number ;
	
	void issue()
	{
		System.out.println();
		System.out.println("          ---------------------  ");
		System.out.println("          | ISSUING A SIM CARD|");
		System.out.println("          ---------------------");
		System.out.println();
		System.out.println();
		System.out.println("Details Need To Be Filled :");
		System.out.println();
		System.out.print("Enter Name : ");
		name = sc.nextLine();
		System.out.print("Enter Address : ");
		address = sc.nextLine();
		System.out.print("Enter Aadhar Number : ");
		aadhar_number = sc.nextLine();
		
		if(aadhar_number.length()==12)
		{
			System.out.println("Valid Aadhar_Number");
		}
		else
		{
			System.out.println("Invalid Aadhar_Number");
			System.exit(0);
		}
		System.out.println();
		
	}
	void issue2()
	{
		System.out.println("Which Sim Card Do You Want To Issue : ");
		System.out.println("1. Prepaid");
		System.out.println("2. Postpaid ");
		System.out.print("Select Your Sim : ");
		int select_sim= sc.nextInt();
		switch(select_sim)
		{
			case 1 :
			{
				System.out.println();
				System.out.println("      ISSUING A PREPAID SIM");
				System.out.println();
				break;
			}
			case 2 :
			{
				System.out.println();
				System.out.println("      ISSUING A POSTPAID SIM");
				System.out.println();
				break;
			}
			default :
			{
				System.out.println();
				System.out.println("*Please Select Valid Sim Type*");
				System.out.println();
				issue2();
				break;
			}
		}
	}
	void issue3()
	{
		System.out.println("1. VIP Number");
		System.out.println("2. Random Number");
		System.out.print("Choose Your Number Type : ");
		int choose_number = sc.nextInt();
		System.out.println("Enter Number : ");
		String number=sc.nextLine();
		sc.nextLine();
		switch(choose_number)
		{
			case 1 :
			{
				System.out.println();
				System.out.println("Your VIP Number Has Been Issued And Will Activate Within 48 Hours");
				System.out.println();
				System.out.println("                  ===THANK YOU===");
				System.out.println();
				System.out.println();
				break;
			}
			case 2 :
			{
				System.out.println();
				System.out.println("Your Random Number Has Been Issued And Will Activate Within 48 Hours");
				System.out.println();
				System.out.println("                  ===THANK YOU===");
				System.out.println();
				System.out.println();
				break;
			}
			default :
			{
				System.out.println();
				System.out.println("*Please Make A Valid Choice*");
				System.out.println();
				issue3();
				break;
			}
		}
	}
	
	//for update sim card
	void update()
	{
		System.out.println();
		System.out.println("          -----------------------");
		System.out.println("          | UPDATING A SIM CARD |");
		System.out.println("          -----------------------");
		System.out.println();
	}
	void update2()
	{
		System.out.println("1. Information Linked With Sim Card Of User");
		System.out.println("2. 3G to 4G");
		System.out.println("3. PrePaid to Postpaid");
		System.out.print("Enter Choice : ");
		int select_update = sc.nextInt();
		
		switch(select_update)
		{
			case 1 :
			{
				System.out.print("Enter Name : ");
				sc.nextLine();
				name = sc.nextLine();
				System.out.print("Enter Address : ");
				address = sc.nextLine();
				System.out.print("Enter Aadhar Number : ");
				aadhar_number = sc.nextLine();
				System.out.println();
				System.out.println("      ~~Information Updated Sucessfully~~");
				System.out.println();
				System.out.println();
				break;
			}
			case 2 :
			{
				System.out.println();
				System.out.println("Your Sim Has Been Updated From 3G to 4G ");
				System.out.println("4G Service Will Activate Within 12 Hours");
				System.out.println();
				System.out.println(              "~~Welcome to 4G~~");
				System.out.println();
				System.out.println();
				break;
			}
			case 3 :
			{
				System.out.println();
				System.out.println("You Have Been Upgraded From Prepaid To Postpaid ");
				System.out.println();
				System.out.println("           ~~Enjoy Your Plan~~        ");
				System.out.println();
				System.out.println();
				break;
			}
			default :
			{
				System.out.println();
				System.out.println("*Please Make A Valid Choice*");
				System.out.println();
				update2();
				break;
				
			}
		}
	}
	
	//for recharge plan
	void recharge()
	{
		System.out.println();
		System.out.println("                        ------------------------------");
		System.out.println("                        | RECHARGE PLANS FOR PREPAID |");
		System.out.println("                        ------------------------------");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("1. 239 INR"+"\t"+"1.5 GB/Day"+"\t"+"28 Days");
		System.out.println("   (Unlimited Calls  , 100 SMS/Day , Free Caller Tunes)");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("2. 519 INR"+"\t"+"2.0 GB/Day"+"\t"+"56 Days");
		System.out.println("   (Unlimited Calls  , 100 SMS/Day , Free Caller Tunes)");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("3. 109 INR"+"\t"+"99 INR TT "+"\t"+"1 Month");
		System.out.println("   (99 INR TalkTime  , 200 MB Data , Local/STD/LL@2.5/sec)");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("4. 999 INR"+"\t"+"2.5 GB/Day"+"\t"+"84 Days");
		System.out.println("   (Unlimited Calls  , 100 SMS/Day , Free Caller Tunes , 3 OTT Platform Support)");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("                        -------------------------------");
		System.out.println("                        | RECHARGE PLANS FOR POSTPAID |");
		System.out.println("                        -------------------------------");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("5.  399* INR"+"\t"+"40 GB"+"\t"+"1 User + 0 Free Add-On");
		System.out.println("   (399/Month+Taxes , Unlimited Calls , 100 SMS/Day)");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("6.  999* INR"+"\t"+"100 GB"+"\t"+"1 User + 3 Free Add-On");
		System.out.println("   (999/Month+Taxes , Unlimited Calls , 2 OTT platform , 3 Regular Add-On , 100 SMS/Day)");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("7. 1499* INR"+"\t"+"200 GB"+"\t"+"1 User + 4 Free Add-On");
		System.out.println("   (1499/Month+Taxes , Unlimited Calls , 4 OTT platform , 4 Regular Add-On , 100 SMS/Day)");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.print("Enter Your Recharge Plan : ");
		int select_plan = sc.nextInt();
		int amount;
		boolean payment = true;
		
		switch(select_plan)
		{
			case 1 :
			{
				System.out.println();
				System.out.println("You Have Selected  239INR_1.5GB/Day_28Days  Plan");
				while(payment)
				{
					System.out.print("Enter Amount : ");
					amount = sc.nextInt();
					if(amount==239)
					{
						System.out.println();
						System.out.println("       Recharge Payment Sucessfull");
						System.out.println();
						System.out.println();
						payment = false;
					}
					else
					{
						System.out.println("*Entered Amount Doesn't Match Plan's Amount*");
						System.out.println();
					}
				}
				
				break;
			}
			case 2 :
			{
				System.out.println();
				System.out.println("You Have Selected  519INR_2.0GB/Day_56Days  Plan");
				while(payment)
				{
					System.out.print("Enter Amount : ");
					amount = sc.nextInt();
					if(amount==519)
					{
						System.out.println();
						System.out.println("       Recharge Payment Sucessfull");
						System.out.println();
						System.out.println();
						payment = false;
					}
					else
					{
						System.out.println("*Entered Amount Doesn't Match Plan's Amount*");
						System.out.println();
					}
				}
				break;
			}
			case 3 :
			{
				System.out.println();
				System.out.println("You Have Selected  109INR_99INRTT_1Month  Plan");
				while(payment)
				{
					System.out.print("Enter Amount : ");
					amount = sc.nextInt();
					if(amount==109)
					{
						System.out.println();
						System.out.println("       Recharge Payment Sucessfull");
						System.out.println();
						System.out.println();
						payment = false;
					}
					else
					{
						System.out.println("*Entered Amount Doesn't Match Plan's Amount*");
						System.out.println();
					}
				}
				break;
			}
			case 4 :
			{
				System.out.println();
				System.out.println("You Have Selected  999INR_2.5GB/Day_84Days  Plan");
				while(payment)
				{
					System.out.print("Enter Amount : ");
					amount = sc.nextInt();	
					if(amount==999)
					{
						System.out.println();
						System.out.println("       Recharge Payment Sucessfull");
						System.out.println();
						System.out.println();
						payment = false;
					}
					else
					{
						System.out.println("*Entered Amount Doesn't Match Plan's Amount*");
						System.out.println();
						break;
					}
				}
				break;
			}
			case 5 :
			{
				System.out.println();
				System.out.println("Your Plan  399*INR_40GB_1User+0FreeAdd-On  Has Been Activated");
				System.out.println("Bill Will Be Generated At The End Of The Month");
				System.out.println();
				System.out.println();
				break;
			}
			case 6 :
			{
				System.out.println();
				System.out.println("Your Plan  999*INR_100GB_1User+3FreeAdd-On  Has Been Activated");
				System.out.println("Bill Will Be Generated At The End Of The Month");
				System.out.println();
				System.out.println();
				break;
			}
			case 7 :
			{
				System.out.println();
				System.out.println("Your Plan  1499*INR_200GB_1User+4FreeAdd-On  Has Been Activated ");
				System.out.println("Bill Will Be Generated At The End Of The Month");
				System.out.println();
				System.out.println();
				break;
			}
			default :
			{
				System.out.println();
				System.out.println("*Please Enter Valid Plan*");
				System.out.println();
				System.out.println();
				recharge();
				break;
			}
		}
	}
	
	//for troubleshooting
	void troubleshooting()
	{
		System.out.println();
		System.out.println("            -------------------");
		System.out.println("            | TROUBLESHOOTING |");
		System.out.println("            -------------------");
		System.out.println();
		System.out.print("Enter your query here : ");
		sc.nextLine();
		String query = sc.nextLine();
		System.out.println();
		System.out.println();
	}
	
	//terms and conditions
	void t_and_c()
	{
		System.out.println();
		System.out.println("                                                                   ------------------------");
		System.out.println("                                                                   | TERMS & CONDITIONS * |");
		System.out.println("                                                                   ------------------------");
		System.out.println();
		System.out.println("- All Telenor customers engaged on Telenor products will continue to enjoy their existing benefits till expiry of their current pack with Telenor expires.");
		System.out.println("- Post migration,Telenor subscribers shall be free to opt for any similar exclusive plans or any other Plans as offered by us. Company shall endeavor to ensure continuity of tariffs for Telenor customers.");
		System.out.println("- All benefits related to carry forward and forfeiture , FUP , T&C will as per  principles e.g. FUP on Telenor subs is restricted to 1200 Mins which will be converted to  bundle FUP.");
		System.out.println("- All products will be available to Telenor subscribers if they wish to opt for any different plans as offered.");
		System.out.println("-These Terms and Conditions shall constitute an agreement between us and each customer and by subscribing to the Offer, you accept the same as binding upon you.");
		System.out.println("- The terms and conditions of usage of app continue to be applicable upon you as a user of the  services.");
		System.out.println("- Sim will be entitled to postpone, suspend, modify or cancel this Offer or any aspect thereof, across the entire territories of service or any part thereof, at any time with or without notice, for any reason, including, but not limited to, acts of God, force majeure, technical difficulties, or any other reasons beyond reasonable control. If we suspends or cancels the Offer, all aspects of the Offer shall be null and void. We also reserves the right to cancel, change or suspend any postpaid/ prepaid/4G/3G/2G plans offered by us at any time and at its own discretion. We will not be liable to compensate any customer for any postponement or cancellation or for any reason directly or indirectly arising out of any of the aforesaid events.");
		System.out.println("- NO LIABILITY WHATSOEVER IN RESPECT OF ANY CLAIMS OR DISPUTES AND ANY RESULTING DAMAGES OR LOSSES, WHETHER DIRECT OR INDIRECT, RELATING TO THE CUSTOMER AVAILING, NOT RECEIVING OR CUSTOMER’S USE OF THE OFFER.");
		System.out.println("- OUR COMPANY MAKES NO WARRANTIES OR REPRESENTATIONS WHATSOEVER IN RESPECT OF THE OFFER AND THE NETWORK SERVICES INCLUDING AS TO ITS FITNESS FOR ANY PARTICULAR PURPOSE, MERCHANTABILITY, QUALITY, AVAILABILITY, DISRUPTION OR ERROR FREE OPERATION.");
		System.out.println("- Please note that the statements in these terms and conditions do not constitute any general representation from Company regarding Company’s services or its availability. Broadband network is available on an ‘as is where is available’ basis and makes no representation, guarantee or warranty regarding the availability, fitness for any specified purpose or error free operation of the network. Network availability may be affected due to various reasons including force majeure, acts of god, inclement weather, topographical/ geographic/ demographic factors, maintenance work, availability of interconnection with other networks, etc.");
		System.out.println("- Any dispute or claim arising out of or in relation to this agreement, including disputes as to its formation, will be governed by and construed in accordance with Indian laws. Subject to the point above and the customer submit to the exclusive jurisdiction of Courts at New Delhi alone.");
		System.out.println("- India’s Fastest Network is based on findings published by an independent agency Ookla using their Speedtest Intelligence Methodology for Q3–Q4 2017 and awarded on 24th Jan’18. For details, visit sim.in/fastest-network.");
		System.out.println();
		System.out.println("Go To Services Number");
		System.out.print("Enter Number : ");
		String a = sc.nextLine();
		System.out.println();
		System.out.println();
	}
}
class Main
{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("      ~~~~~~~~WELCOME TO SIM STORE~~~~~~~~");
		System.out.println();
		System.out.println("        ~~~India's No. 1 SIM Managers~~~");
		System.out.println();
		System.out.println();
		System.out.println("How Can We Help You : ");
		
		Sim s=new Sim();
		boolean exit = true;
		while(exit)
		{
			System.out.println("1. Issuing SIM Card");
			System.out.println("2. Updating SIM Card");
			System.out.println("3. Recharge");
			System.out.println("4. Troubleshooting");
			System.out.println("5. Terms & Conditions *");
			System.out.println("6. Exit");
			System.out.print("Where To Go : ");
			int service_no = sc.nextInt();
			
			switch(service_no)
			{
				case 1 :
				{
					s.issue();
					s.issue2();
					s.issue3();
					break;
				}
				case 2 :
				{
					s.update();
					s.update2();
					break;
				}
				case 3 :
				{
					s.recharge();
					break;
				}
				case 4 :
				{
					s.troubleshooting();
					break;
				}
				case 5 :
				{
					s.t_and_c();
					break;
				}
				case 6 :
				{
					exit = false;
					break;
				}
				default :
				{
					break;
				}
			}
		}
	}
}