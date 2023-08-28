package com.assignments;

import java.util.Scanner;

public class Divisible5_7 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n1=sc.nextInt();
		
		if ((n1%5==0) && (n1%7==0))
		{
			System.out.println("Given number is completely divisible by 5 & 7.");
		}
		else
		{
			System.out.println("Given number is not divisible by 5 & 7.");
		}
		sc.close();
	}
	

}


