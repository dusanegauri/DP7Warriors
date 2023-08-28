package com.class_work;
import java.util.*;
public class Movie_Tickets
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Date d= new Date();
		
		System.out.println("Enter movie name:");
		String movie= sc.next();
		
		System.out.println("Enter the ratings:");
		float rating= sc.nextFloat();
		
		System.out.println("The price of the movie is 500/- only.");
		System.out.println("Coupon Codes Available!!");
		System.out.println("Enter 0 for silver coupon & Enter 1 for gold coupon.");
		int price= 500;
		System.out.println("Enter the code:");
		int code= sc.nextInt();
	
		
		
		 if (code==0)
		 {
			System.out.println("You got discount of Rs.50 on your booking.");
			int silver_price= price-50;
			System.out.println("Your final ticket price is "+silver_price);
			System.out.println("Enter the number of tickets you have to booked:");
			int tickets_no= sc.nextInt();
			int total_price= silver_price*tickets_no; 
			System.out.println("Your total bill is " +total_price+"/- only");
		}
		else if (code==1)
		{
			System.out.println("You got discount of Rs.100 on your bookings.");
			int gold_price= price-100;
			System.out.println("Your final ticket price is "+gold_price);
			System.out.println("Enter the number of tickets you have to booked:");
			int ticket_no= sc.nextInt();
			int total_price2=gold_price*ticket_no;
			System.out.println("Your total bill is " +total_price2+ "/- only");
		}
		
		else {System.out.println("Your codes does not matched.");
		System.out.println("Your Final Tickets price is " +price);
		}
		
		System.out.println("Your tickets are been booked for the show of " +movie+ " of ratings " +rating+ " on " +d+ "." );
		System.out.println("Enjoy your show!!");
		sc.close();
	}

}
