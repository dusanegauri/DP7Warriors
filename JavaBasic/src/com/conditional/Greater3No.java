package com.conditional;

import java.util.Scanner;

public class Greater3No {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any 3 numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if ((num1>num2) && (num1>num3))
		{
			System.out.println("Num1 is Greater.");
		}
		else if (num2>num3)
		{System.out.println("Num2 id Greater.");}
		else {System.out.println("Num3 is Greater.");}
			
		}

}
