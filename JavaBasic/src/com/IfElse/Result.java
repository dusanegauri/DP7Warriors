 package com.IfElse;

import java.util.Scanner;

public class Result {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		
		System.out.println("Enter your marks:");
		
		System.out.println("Subject 1:");
		int sub1 = sc.nextInt();
		
		System.out.println("Subject 2:");
		int sub2= sc.nextInt();
		
		System.out.println("Subject 3:");
		int sub3= sc.nextInt();
		
		System.out.println("Subject 4:");
		int sub4= sc.nextInt();
		
		System.out.println("Subject 5:");
		int sub5= sc.nextInt();
		
		int total= sub1+sub2+sub3+sub4+sub5;
		
		float per= 100*total/500; 
		
		if(per>=35)
		{
			System.out.println(name+ " has scored"+ per+ "%.");
			System.out.println("Congratulations!!! Passed and promoted");
		}
		else 
		{
			System.out.println(name+ " has scored "+ per+ "%."
					+ "");
			System.out.println("You are failed!! Try hard next time");
		}
		sc.close();
		}

}
