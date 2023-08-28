package com.operators;
import java.util.Scanner;
public class Person_info 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:");
		String name= sc.next();
		
		System.out.println("Age:");
		int age = sc.nextInt();
		
		System.out.println("Height:");
		float height = sc.nextFloat();
		
		System.out.println("Gender:");
		char gender = sc.next().charAt(0);
		
		System.out.println("Name-" +name);
		System.out.println("Age-" +age);
		System.out.println("Height-" +height);
		System.out.println("Gender-" +gender);
	}
}
