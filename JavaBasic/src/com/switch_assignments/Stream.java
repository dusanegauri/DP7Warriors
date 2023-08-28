package com.switch_assignments;
import java.util.Scanner;
public class Stream 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name= sc.next();
		System.out.println("Choose the option for your stream.");
		String choice= sc.next();
		System.out.println("Enter your Percentage");
		int passing_criteria=sc.nextInt();
		switch(choice)
		{
		case "MBA": System.out.println("The course you have selected is MBA.");
		switch (passing_criteria)
		{case 75: System.out.println("You are eligible for the MBA course.");
		break;
		default: System.out.println("You are not eligible for MBA course.");}
		break;
		case "Engineering": System.out.println("The course you have selected is Engineering.");
		switch (passing_criteria)
		{case 85: System.out.println("You are eligible for the Engineering course.");
		break;
		default: System.out.println("You are not eligible for Engineering course.");}
		
		break;
		case "MCA": System.out.println("The course you have selected is MCA.");
		break;
		default: System.out.println("Please select valid course.");
		}
		sc.close();
	}
}
