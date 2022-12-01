package com.nissan.app;

import java.util.Scanner;

public class Assignment2Question4 {
	/*
	 * c. Write a program that uses an if-else-if ladder to determine which season a particular
			Month is in.
			Months 1, 2 and 12 are come under winter season.
			Months 3, 4 and 5 are come under spring season.
			Months 6, 7 and 8 are come under summer season.
			Months 9, 10 and 11 are come under autumn season.
			Accept a number for month from user and print the result accordingly.
	 * 
	 * d. Rewrite the above program using switch-case

	 */
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
		int month=acceptMonth();
		displaySeason(month);
		}catch(Exception e) {
		System.out.println("Invalid input. Please try again.");
	}
		
	}
	private static void displaySeason(int month) {
		switch(month) {
	
		case 1:
			System.out.print("It's a Winter Season...");
			break;
		case 2:
			System.out.print("It's a Winter Season...");
			break;
		case 3:
			System.out.print("It's a Spring Season...");
			break;
		case 4:
			System.out.print("It's a Spring Season...");
			break;
		case 5:
			System.out.print("It's a Spring Season...");
			break;
		case 6:
			System.out.print("It's a Summer Season...");
			break;
		case 7:
			System.out.print("It's a Summer Season...");
			break;
		case 8:
			System.out.print("It's a Summer Season...");
			break;
		case 9:
			System.out.print("It's a Autumn Season...");
			break;
		case 10:
			System.out.print("It's a Autumn Season...");
			break;
		case 11:
			System.out.print("It's a Autumn Season...");
			break;
		case 12:
			System.out.print("It's a Winter Season...");
			break;
		 default:
			System.out.print("Please enter valid month.");
			break;
		}
	}
	private static int acceptMonth() {
		System.out.print("Enter Month number: ");
		int input=sc.nextInt();
		return input;
		
	}

}
