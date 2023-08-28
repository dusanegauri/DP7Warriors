package com.switch_assignments;
import java.util.Scanner;
public class GreatestOf2Numbers 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Numbers:");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		switch(num1)
		{
		case 1: 
			if (num1>num2) System.out.println("Number 1 is Greater.");
			else if (num1==num2) System.out.println("Both number are equal.");
			else System.out.println("Number 2 is Greater.");
		}
		sc.close();
	}

}
