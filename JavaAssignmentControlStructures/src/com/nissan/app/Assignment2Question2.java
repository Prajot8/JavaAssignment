package com.nissan.app;

import java.util.Scanner;

//Class Varify
public class Assignment2Question2 {
	/*
	 * b. You are a Software developer in XYZ Company and 
	 * you are asked to create a program to verify a user’s PIN code when a user visits an ATM. 
	 * To implement this concept, you must use decisional statements to make appropriate decisions 
	 * when a use’s PIN code matches with the pin code assigned to that user. 
	 * For that, you have created a class named Verify, 
	 * in which a user has to enter some numeric value as the PIN code during runtime. 
	 * Apart from that, you have initialized a variable y with some numeric value and 
	 * compare the value stored in the variable y with the value accepted from a user.
	 */
	private static final int y=7944;
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
		acceptPin();
		}catch(Exception e) {
			System.out.println("Invalid input. Please try again.");
		}
	}
	private static void checkPin(int pin) {
		
		if(pin==y) {
			System.out.println("Pin Matched Sucessfully..");
		}else {
			System.out.println("Wrong Pin entered.. Please try again.");
		}
	}
	private static void acceptPin() {
		System.out.print("Enter Your ATM Pin : ");
		int pin=sc.nextInt();
		checkPin(pin);
	}

}
