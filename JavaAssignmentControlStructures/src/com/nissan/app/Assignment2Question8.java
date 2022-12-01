package com.nissan.app;

import java.util.Scanner;

public class Assignment2Question8 {
		/*
		 * h. Create a parameterized constructor in the above Box class to initialize the instance variables. 
		 * Then calculate the volume and print it.
		 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int volume;
		System.out.println("Enter Box1 width, height and depth values: ");
		Boxx firstBox= new Boxx(sc.nextInt(),sc.nextInt(),sc.nextInt());
		volume=firstBox.generateVolume();
		System.out.println("Volume : "+volume);
		System.out.println("Enter Box2 width, height and depth values: ");
		Boxx secondBox= new Boxx(sc.nextInt(),sc.nextInt(),sc.nextInt());
		volume=secondBox.generateVolume();
		System.out.println("Volume : "+volume);
	}

}
class Boxx{
	int width;
	int height;
	int depth;
	
	
	
	public Boxx() {
		this.width = 1;
		this.height = 1;
		this.depth=1;
	}



	public Boxx(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}



	public int generateVolume() {
		return this.width*this.height*this.depth;
	}
	
	
	
	
}
