package com.conditional;
import java.util.Scanner;
public class NestedDemo2 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter total percentage:");
		float per=sc.nextFloat();
		System.out.println("Enter percentage of PCM:");
		float bestp= sc.nextFloat();
		if ((per>=90)||(per>=85))
		{
			System.out.println("Eligible");
		}
		else {System.out.println("Not Eligible");}
	}

}
