package com.conditional;

public class CharAddition {
	public static void main(String args[])
	{
		char c1=65;
		char c2=2;
		
		char c3= (char)(c1+c2);
		System.out.println("1 = "+ c3);
		int i1= 97;
		int i3=3;
		char ch= (char)(i1+i3);
		System.out.println("2 = "+ ch);
		char ch1='1';
		char ch2='2';
		char result= (char)(ch1+ch2);
		System.out.println("3 = "+ result);
		
		char ch4='0'; //48
		char ch5='5'; //53
		//48+53=101: 101 is asci value of e
		
		char result2= (char)(ch4+ch5); //adds ascii value 
		System.out.println("4 = "+ result2);
	}

}
