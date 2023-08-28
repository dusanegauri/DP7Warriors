package com.ternary;
import java.util.Scanner;
public class LeapYear 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Year:");
		int year= sc.nextInt();
		String leap;
		leap=(year%4==0 && year%100!=0 || year%400==0)? "Leap Year":"Not a Leap Year";
		System.out.println(leap);
		
	}

}
