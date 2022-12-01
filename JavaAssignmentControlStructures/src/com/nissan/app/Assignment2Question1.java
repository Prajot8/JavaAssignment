package com.nissan.app;

import java.util.Scanner;

public class Assignment2Question1 {
	/*
	 * a. Consider an electricity billing calculation. 
	 * There are two types of customers. Domestic and Industry. 
	 * If it is domestic, the slabs are like this,
		The reading in the range,0-100 then amt=units* Rs.1
	 */
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		try {
		//Accept customer type
		char custType=acceptCustType();
		//accept units reading
		int units;
		if(custType=='W') {units=0;}else{units=acceptUnitsReading();}
		//calculate and display electricity bill
		calElectricityBill(custType, units);
		}catch(Exception e) {
			System.out.println("Invalid input. Please try again.");
		}

	}
	private static void calElectricityBill(char custType, int units) {
		double amount;
		if(custType=='D') {
			if(units>=1 && units<=100) {
			amount=units*1;
			System.out.println("Your Electricity bill amounts Rs "+amount);
		}else if(units>100 && units<=200){
			amount=units*1.5;
			System.out.println("Your Electricity bill amounts Rs "+amount);
			}else if(units>200 && units<=500){
			amount=units*2;
			System.out.println("Your Electricity bill amounts Rs "+amount);
			}else {
				amount=units*5;
				System.out.println("Your Electricity bill amounts Rs "+amount);}
			
		}else if(custType=='I'){
			amount=units*10;
			System.out.println("Your Electricity bill amounts Rs "+amount);
		}
		
	}
	private static char acceptCustType() {
		System.out.print("Enter 1-Domestic\t2-Industry ");
		int choice=sc.nextInt();
		if(choice==1) {
			return 'D';
		}else if(choice==2){
			return 'I';
		}else {System.out.println("Invalid input, please enter valid choice.");return 'W';}
	}
	
	private static int acceptUnitsReading() {
		System.out.print("Enter reading unit : ");
		int units=sc.nextInt();
		return units;
	}
	
	

}
