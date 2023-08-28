package com.ternary;
import java.util.Scanner;
public class GreatestOf3Num 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 3 numbers:");
		int num1= sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int max;
		max= (num1>num2)? (num1>num3)? num1:num3 : (num2>num3)?num2:num3;
		//max=(num1>num3)?num1:num3;
		
		System.out.println(max+ " is greater.");
		sc.close();
	}

}
