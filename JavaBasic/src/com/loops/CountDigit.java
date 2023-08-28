package com.loops;
import java.util.Scanner;
public class CountDigit 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int digit=sc.nextInt();
		int count=0;
		if (digit==0)
		{
			count=1;
		}
		else 
		{
			for (int num=digit; num!=0;num/=10)
			{
				count++;
			}
		}
		System.out.println("Number of digits are: "+count);
		sc.close();
	}

}
