package com.IfElse;

import java.util.Scanner;

public class Voting {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		if(age>=18);
		{
			System.out.println("You can vote");
		}
		{
			System.out.println("You cannot vote");
		}
	}
	

}