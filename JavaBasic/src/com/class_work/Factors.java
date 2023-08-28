package com.class_work;
import java.util.Scanner;
public class Factors 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Enter the factor:");
		int factor=sc.nextInt();
		if (factor>0) {
			if (num%factor==0) {
				System.out.println(factor+ " is a factor of "+num);
			}
			else { System.out.println(factor+ " is not a factor of "+num);
			}
		}
		else { System.out.println("Negative factor are not allowed");
	}
		sc.close();
	}
}
