package com.assignments;
import java.util.Scanner;
public class Vowels {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the alphabet:");
		char alphabet=sc.next().charAt(0);
		
		if (alphabet== 'a' || alphabet== 'e' || alphabet=='i' || alphabet== 'o' || alphabet=='u' || alphabet=='A' || alphabet=='E' || alphabet=='I' || alphabet=='O' || alphabet=='U')
		{
			System.out.println("The alphabet is vowel.");
		}
		else {System.out.println("The alphabet is consonent.");}
	}

}
