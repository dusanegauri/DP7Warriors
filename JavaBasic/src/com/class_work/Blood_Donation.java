package com.class_work;
import java.util.Scanner;
public class Blood_Donation 
{
	public static void main(String rags[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your Gender:");
		char gender=sc.next().charAt(0);
		
		System.out.println("Enter Your Age:");
		int age= sc.nextInt();
		
		System.out.println("Enter your weight:");
		float weight=sc.nextFloat();
		
		if (gender=='M')
		{
		
		if (age>=18)
		{
			if(weight>=70)
			{System.out.println("Your are eligible to donate the blood.");}
			else {System.out.println("Your weight is not suitable for donating the blood.");}
		}
		
		else {System.out.println("Your age is not suitable.");}
		}
		else {System.out.println("Your are not allowed to donate the blood.");}
		sc.close();
	}

}
