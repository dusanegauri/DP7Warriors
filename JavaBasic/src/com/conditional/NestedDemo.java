package com.conditional;

public class NestedDemo {
	public static void main(String args[])
	{
		float per=65f;
		
		if (per>=65)
		{
			System.out.println("Eligible for college.");
			if (per>=80)
			{
				System.out.println("Can choose sci & commerce");
			}
			else {System.out.println("Can opt commerce");}
		}
		else {System.out.println("Not eligible for college");}
		
	}

}
