package com.nissan.app;

import java.util.Scanner;

public class Assignment2Question5 {
		/*
		 * e. Create a menu driven program using do-while and switch-case
		 *  which implements a help system for Java’s selection and iteration statements. 
		 *  You have to display the syntax of selected control statement.
			Help on:
			
			1. if
			
			2. switch
			
			3. while
			
			4. do-while
			
			5. for
			
			Choose one:
			
			4
			
			The do-while:
			
			do {
			
			statement;
			
			 } while (condition);
		 */
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int choice;
		try {
		do {
		choice=menu();
		
		showSyntax(choice);
		
		}while(choice!=0);
		}catch(Exception e) {
			System.out.println("Invalid Input... Please try again..");
		}
	}

		private static void showSyntax(int choice) {
		switch(choice) {
		case 1:
			System.out.println("'if' statement syntax:\n");
			System.out.println("if(condition) "
					+ "{"
					+ "\n\tstatement;"
					+ "\n\t} else{"
					+ "\n\t\t}");
			break;
		case 2:
			System.out.println("'switch' statement syntax:\n");
			System.out.println("switch(condition){"
					+ "\ncase 1:\n\tbreak;\ndefault:\n\tbreak;"+"\n}") ;	
					break;
		case 3:
			System.out.println("'while' statement syntax:\n");
			System.out.println("while(condition){\n\tstatements;\n\t}");
			break;
		case 4:
			System.out.println("'do while' statement syntax:\n");
			System.out.println("do{\n     statements;\n   }while(condition);");
			
			break;
		case 5:
			System.out.println("'for' statement syntax:\n");
			System.out.println("for(expression1;expression2;expression3)\n{\n\tstatements;\n}");
			break;
		default:
			System.out.print("Please enter valid month.");
			break;
		case 0:
			System.out.println("Exited sucessfully.Thank You!!!");
			
			break;
		
		}
		
	}

		private static int menu() {
			int choice;
			System.out.println("\nEnter your choice to see syntax: ");
			System.out.println(""
					+ "1.if\n2.switch\n3.while\n4.do while\n5.for\n0.exit");
			choice=sc.nextInt();
			return choice;
		}

}
