package com.operators;

import java.util.Scanner;

public class PercentageOfStudents {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		
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
		
		System.out.println("The percentage is "+per+ "%.");
	}

}
