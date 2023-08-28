package com.assignments;
import java.util.Scanner;
public class ElectricityBill 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of unit: ");
		int units= sc.nextInt();
		double total;
		if (units<=50)
		{
			total=units*0.5;
			System.out.println("Your total bill amount is: "+total);
		}
		else if(units<150)
		{
			total=50*0.5+(units-50)*0.75;
			System.out.println("Your total bill amount is: "+total);
		}
		else if(units<=250)
		{
			total=50*0.5+100*0.75+(units-150)*1.20;
			System.out.println("Your total bill amount is: "+total);
		}
		else {total=50*+100*0.75+100*1.20+(units-250)*1.5;
		System.out.println("Your total bill amount is: "+total);}
		total= total+total*0.2;
		System.err.println("Your Final Bill is " +total);
		sc.close();
	}

}
