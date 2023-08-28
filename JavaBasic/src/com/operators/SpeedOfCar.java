package com.operators;

import java.util.Scanner;

public class SpeedOfCar {
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the Distance in km:");
		double distance = sc.nextDouble();
		
		System.out.println("Enter the Time in hour:");
		double time = sc.nextDouble();
		
		double speed= distance/time;
		
		System.out.print("Speed of the car is " +speed+ "km/hr.");
		sc.close();	}

}
