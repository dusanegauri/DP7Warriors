package com.switch_assignments;
import java.util.Scanner;
public class Vowels 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the aplhabet:");
		char alphabet=sc.next().charAt(0);
		
		switch (alphabet)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': System.out.println("Vowels");
		break;
		default: System.out.println("Consonent");
		
		}
		sc.close();
	}

}
