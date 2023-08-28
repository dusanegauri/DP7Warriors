package com.switch_assignments;
import java.util.Scanner;
public class SimpleCalculator 
{
	public static void main(String args[])
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1:");
		int num1= sc.nextInt();
		System.out.println("Enter Number 2:");
		int num2= sc.nextInt();
		System.out.println("Enter the operation you have to perform:");
		System.out.println("Press + for Addition.");
		System.out.println("Press - for Substraction");
		System.out.println("Press * for Multiplication");
		System.out.println("Press / for Division");
		System.out.println("Press % for Remainder");
		char ch= sc.next().charAt(0);
		switch (ch)
		{
		case '+': System.out.println("Sum of the numbers is "+(num1+num2));
		break;
		case '-': System.out.println("Subtraction of the numbers is "+(num1-num2));
		break;
		case '*': System.out.println("Multiplication of the numbers is "+(num1*num2));
		break;
		case '/': System.out.println("Division of the numbers is "+(num1/num2));
		break;
		case '%': System.out.println("Remainder of the numbers is "+(num1%num2));
		break;
		default: System.out.println("No Such Operation Available.");
		}
		sc.close();
	}
}
