package com.class_work;
import java.util.Scanner;
public class ATM 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int balance=260000;
		int pin=2602;
		System.out.println("Enter username:");
		String username=sc.next();
		System.out.println("Enter your pin:");
		int pin2=sc.nextInt();
		 if (pin2==pin)
		 {
			 System.out.println("Welcome to HDFC Bank " +username);
			 System.out.println("Press 1 for Deposite");
			 System.out.println("Press 2 for Withdraw");
			 System.out.println("Press 3 for Check Balance");
			 System.out.println("Press 4 for Exit");
			 int choice=sc.nextInt();
			 switch (choice)
			 {
			 case 1: System.out.println("Enter amount to deposite:");
				 int deposite_amount=sc.nextInt();
				 int total_balance=balance+deposite_amount;
				 System.out.println("Your total balance is "+total_balance+ "/-");
			 break;
			 case 2: System.out.println("Enter amount to withdraw:");
				 int withdraw_amount=sc.nextInt();
				 int total_balance2=balance-withdraw_amount;
				 System.out.println("Your total balance is "+total_balance2+ "/-");
			 break;
			 case 3: System.out.println("Your current balance is "+balance+"/-");
			 break;
			 case 4: System.out.println("Exit");
		    break;
		    default: System.out.println("Please enter valid option");}
		     }
		 else System.out.println("Please Enter Valid Pincode.");
		 sc.close();
	}
}
