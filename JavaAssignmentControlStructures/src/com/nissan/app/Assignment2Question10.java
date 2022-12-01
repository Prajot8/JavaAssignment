package com.nissan.app;

import java.util.Scanner;

public class Assignment2Question10 {
	/*
	 * j. Create a small application that reads a month in number and print it in words.
	 */
	public static void main(String[] args) {
		  try
		    {
			     Scanner sc=new Scanner(System.in);
		         System.out.println("Enter the month number(1-12) : ");
		         int month=sc.nextInt();
		         
		         System.out.println("Month name is : "+getMonthsName(month));
		     }
		       catch(Exception e)
		      {
			     System.out.println("Invalid input, please try again.");
		       }
		}
			private static String getMonthsName(int month) {
				switch(month)
				{
				case 1:
					return "January";
					
				case 2:
					return "February";
					
				case 3:
					return "March";
					
				case 4:
					return "April";
					
				case 5:
					return "May";
					
				case 6:
					return "June";
				
				case 7:
					return "July";
					
				case 8:
					return "August";
					
				case 9:
					return "September";
					
				case 10:
					return "October";
					
				case 11:
					return "November";
					
					default:
						return "December";
				}
				
			}

	}


