package com.ternary;

public class VotingAge {
	public static void main(String args[])
	{
		int age= 20;
		String status;
		status=(age>=18)?"Yes": "No";
		System.out.println(status);
		
		if (age>=18)
		{
			status="Yes";
		}
		else 
		{
			status="No";
		}
		System.out.println(status);
		boolean s= (age>=18)?true:false;
		System.out.println(s);
		
				
	}

}
