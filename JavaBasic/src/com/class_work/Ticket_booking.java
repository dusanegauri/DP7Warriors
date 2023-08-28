package com.class_work;

import java.util.*;

public class Ticket_booking {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Date d= new Date();
		System.out.println("Enter the Airlines Company: ");
		String airline= sc.next();
		
		System.out.println("Welcome to " +airline+ " Airlines!!!");
		
		System.out.println("Enter your Departure Location:");
		String departure= sc.next();
		
		System.out.println("Enter your Destination Location:");
		String destination= sc.next();
		
		System.out.println("Enter the Coupon Code if have:");
		double code= sc.nextDouble();
		
		if (code==2602)
		{
			double price= 50000;
			System.out.println("Congraulations!! You have got the Discount of 10%");
			double discount= price*0.1;
			double final_price= price-discount;
			System.out.println("Your final price is " + final_price+ "/- only.");
		}
		else
		{
			double price= 50000;
			System.out.println("Sorry no such code available. Better Luck Next Time.");
			System.out.println("Your final price is " +price+ "/- only.");
		}
		System.out.println("Congrats!!! Your tickets have been booked from " +departure+ " to " +destination+ " on " +d+".");
		System.out.println("Enjoy Your Holidays!!!");
		sc.close();
	}
}
