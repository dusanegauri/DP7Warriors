package com.operators;

import java.util.Scanner;

public class VolumeOfCylinder {
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Radius of cylinder:");
		float radius=sc.nextFloat();
		
		System.out.println("Height of cylinder:");
		float height=sc.nextFloat();
		
		double volume= Math.PI*radius*radius*height;
		
		System.out.println("Volume of cylinder is: " +volume);
		
	}
}
