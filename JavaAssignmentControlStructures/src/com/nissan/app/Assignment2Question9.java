package com.nissan.app;

import java.util.Scanner;

public class Assignment2Question9 {
	/*
	 * i. Accept a real constant value from user and typecast this value into integer and print the result.
	 */
	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number : ");
		final float number=sc.nextFloat();
		System.out.println("After typecasting  : "+ (int) number);
		}
		catch(Exception e)
		{
			System.out.println("Invalid input, please try again.");
		}

	}

}
