package com.operators;

import java.util.Scanner;

public class Bill {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantity of product:");
		int quantity= sc.nextInt();
		System.out.println("Price/product:");
		int price= sc.nextInt();
		
		int total= quantity*price;
		
		System.out.println("The total price is "+total+ "/- only.");
	}
}
