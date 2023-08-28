package com.switch_assignments;

import java.util.Scanner;

public class DaysInMonth {
	public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Month (Lowercase):");
	String month_name= sc.next();
	
	switch (month_name)
	{
	case "january":
	case "march":
	case "may":
	case "july":
	case "august":
	case "october":
	case "december": System.out.println("31 days");
	break;
	
	case "april":
	case "june":
	case "september":
	case "november": System.out.println("30 days");
	break;
	
	case "february": System.out.println("Enter the year:");
	                int year= sc.nextInt();
	                if((year%4==0)||(year%400==0)&&(year%100!=0))
	                {
	                	System.out.println("29 days");
	                }
	                else {System.out.println("28 days");}
	break;
	default: System.out.println("Error!!! No such month available or Please enter month in lowercase.");
		
		
	}
	sc.close();
	
	
	
}

}
