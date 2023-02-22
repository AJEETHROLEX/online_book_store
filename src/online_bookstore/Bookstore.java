package online_bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Bookstore {
	 void bookstore() {
		 int count=0,price=0,input=0;
	 
		 Scanner sc = new Scanner(System.in);
	     while(input < 6) {
	    	 System.out.println("###@Choose the book@###");
			 System.out.println("1.mystery");
			 System.out.println("2.fantasy");
			 System.out.println("3.thriller");
			 System.out.println("4.childrens literature");
			 System.out.println("5.historical fiction");
			 System.out.println("press 6 to exit");
			 
			System.out.println("Enter the book sno");
			
			 input=sc.nextInt();
		switch(input) {
		case 1:
			dbconnection();
			System.out.println("Mystery is in stock\n"+"price=250\n");
			System.out.println("enter how many book want:");
		
			count=sc.nextInt();
			price=250*count;
			System.out.print("total book price is "+price);
			payment();
		break;
		case 2:
			System.out.println("Fantasy is in stock\n"+"price=500\n");
			System.out.println("enter how many book want:");
			count=sc.nextInt();
			price=500*count;
			System.out.print("total book price is \n"+price);
		break;
		case 3:
			System.out.println("Thriller is in stock\n"+"price=250\n");
			System.out.println("enter how many book want:");
			count=sc.nextInt();
			price=250*count;
			System.out.print("total book price is \n"+price);
			payment();
		break;
		case 4:
			System.out.println("childrens litrature is in stock\n"+"price=350\n");
			System.out.println("enter how many book want:");
			count=sc.nextInt();
			price=350*count;
			System.out.print("total book price is "+price);
		break;
		case 5:
			System.out.println("Historical fiction is in stock\n"+"price=550\n");
			System.out.println("enter how many book want:");
			count=sc.nextInt();
			price=550*count;
			System.out.print("total book price is \n"+price);
		break;
		case 6:
			return;
		default:
			System.out.println("---This book is not found---");
			System.exit(0);

	     } 
		 	}}
	 


	 public static void dbconnection() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select stocks from books where id=1;");
				
				while(rs.next()) {
					System.out.print("Stocks"+rs.getInt(1));
				}
			
				con.close();
			}
			catch(Exception e) {
				System.out.println(e.toString());
			}
	 }
	 public static void payment() {
		 Scanner sc = new Scanner(System.in);
	 
		 System.out.println("\nSelect the payment method");
		 System.out.println("1.press ONE for cash on delivery");
		 System.out.println("2.press TWO for online payment");
		 int num=sc.nextInt();
		       if(num==1) {
		     	  System.out.println("you pressed cash on delivery" +" "+ "your order is confirmed");
		     	  System.out.println("Soon we have deliver the book");
		     	  System.out.println("Thank you for choosing us!!!!!!");
		     	  System.exit(0);
		       }
		       else {
		     	  System.out.println("you pressed online payment"+ " " +"please fill your details");
		     	  System.out.println("Enter your bank name:");
		     	  Scanner cc = new Scanner(System.in);
		     	  String get=cc.next();
		     	  System.out.println("Enter your bank ACCOUNT NO:");
		     	  Scanner pp = new Scanner(System.in);
		     	  double get1=pp.nextDouble();
		     	  System.out.println("Enter your bank IFSC code:");
		     	  Scanner ss = new Scanner(System.in);
		     	  double get2=ss.nextDouble();
		     	  System.out.println("Soon we have deliver the book.....");
		     	  System.out.println("Thank you for choosing us!!!!!!");
		       }
	 }






}