package com.nissan.app;

import java.util.Scanner;

public class Assignment2Question7 {
	/*
	 * g. Create a Box class with three instance variables as width, height, depth. 
	 * Create a method inside this class which returns the volume. 
	 * Create two different objects in other class assign values for instance variable and 
	 * calculate the volume and print it.
	 */
	
	public static void main(String[] args) {
		try {
		Box firstBox= new Box();
		Box secondBox= new Box();
		Scanner sc= new Scanner(System.in);
		int volume;
		System.out.println("Enter Box1 width, height and depth values: ");
		volume=firstBox.generateVolume(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("Volume : "+volume);
		
		
		System.out.println("Enter Box2 width, height and depth values: ");
		volume=secondBox.generateVolume(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("Volume : "+volume);
		}catch(Exception e) {
			System.out.println("Invalid input, please try again.");
		}
	}

}

 class Box{
	int width;
	int height;
	int depth;
	
	public int generateVolume(int width,int height, int depth) {
		return width*height*depth;
	}
	
	
	
	
}
