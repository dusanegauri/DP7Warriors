package com.assignments;
import java.util.Scanner;
public class PositiveNegativeNumber
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	
	System.out.println("ENTER ANY NUMBER:");
	double num= sc.nextDouble();
	
	if (num>=0)
	{System.out.println(num+ " is positive.");}
	else {System.out.println(num+ " is negative.");}
	sc.close();
	}

}
