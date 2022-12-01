package com.nissan.app;

import java.util.Scanner;

public class Assignment2Question3 {
	/*
	 * c. Write a program that uses an if-else-if ladder to determine which season a particular
			Month is in.
			Months 1, 2 and 12 are come under winter season.
			Months 3, 4 and 5 are come under spring season.
			Months 6, 7 and 8 are come under summer season.
			Months 9, 10 and 11 are come under autumn season.
			Accept a number for month from user and print the result accordingly.
	 */
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		try {
		int month=acceptMonth();
		determineSeasonFromMoth(month);
		}catch(Exception e) {
			System.out.println("Invalid input. Please try again.");
		}
	}
	private static void determineSeasonFromMoth(int month) {
		if(month>0 && month<=12) {
		if(month==1 || month==2 || month==12) {
			System.out.println("It's a Winter Season...");
		}else if(month==3 || month==4 || month==5) {
			System.out.println("It's a Spring Season...");
		}else if(month==6 || month==7 || month==8) {
			System.out.println("It's a Summer Season...");
		}else{
			System.out.println("It's a Autumn Season...");
		}
		
		}else {
			System.out.println("Please enter valid month.");
		}
		
	}
	private static int acceptMonth() {
		System.out.print("Enter Month number: ");
		int input=sc.nextInt();
		return input;
	}

}
