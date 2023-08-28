package com.loops;
import java.util.Scanner;
public class Example 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int num;
		for (i=1;i<=50;i++)
		{
			if ((i%3==0)&&(i%5==0))
				System.out.println("Bye");
			else if (i%3==0)
				System.out.println("Hello");
			else if (i%5==0)
				System.out.println("Welcome");
			else System.out.println(i);
		}
	}

}


