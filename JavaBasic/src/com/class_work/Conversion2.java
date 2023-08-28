package com.class_work;
import java.util.Scanner;
public class Conversion2 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch= sc.next().charAt(0);
		char ch1= (char) (ch+32);
		
		System.out.println("Enter the character:");
		char ch2= sc.next().charAt(0);
		char ch3= (char) (ch2-32);
		
		System.out.println(ch1);
		System.out.println(ch3);
		
		sc.close();
	}
}
