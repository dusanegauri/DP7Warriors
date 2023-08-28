package com.loops;
import java.util.Scanner;
public class SumOfEven_n_numbers 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range you want sum: ");
		int num= sc.nextInt();
		int sum=0;
		for (int i=1;i<=num;i++)
		{
			if (i%2==0)
			{
				sum+=i;
			}
		}
		System.out.println("Sum of all even number is: "+sum);
		sc.close();
	}

}
