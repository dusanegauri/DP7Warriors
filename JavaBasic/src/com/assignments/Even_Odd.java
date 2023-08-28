package com.assignments;
import java.util.Scanner;
public class Even_Odd 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER:");
		double num= sc.nextDouble();
		if (num%2==0)
		{System.out.println(num+ " is even.");}
		else {System.out.println(num+ " is odd.");}
		sc.close();
	}

}
