package com.switch_assignments;
import java.util.Scanner;
public class EvenOdd 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		switch(num%2)
		{
		case 0: System.out.println("The number is EVEN NUMBER.");
		break;
		case 1: System.out.println("The number is ODD NUMBER.");
		}
		sc.close();
	}

}
