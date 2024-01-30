package cpt236_a80s_lab_2;

/*
 * Jared Daniels
 * This program takes the minutes of rental time and computes how much it costs for every hour and extra minute.
 * 29 January 2024
 * CPT-236-A80S
 */ 

import java.util.Scanner;

public class SunshineRentalPriceWithMethods {
	static int minutes;
	
	public static void main(String[] args) {
		companyMotto();
		rentalTime();
		rentalCost();
	}

	public static int rentalTime() {
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("\nPlease enter rental time in minutes: ");
		minutes = inputDevice.nextInt();
		return minutes;
	}
	
	public static void companyMotto() {
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S                                            S");
		System.out.println("S Sunshine Seashore makes it fun in the sun. S");
		System.out.println("S                                            S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
	}
	
	public static void rentalCost() {
		int hours = minutes/60;
		minutes = minutes%60;
		int totalCost = (hours*40) + (minutes*1);
		System.out.println("Your total hours are: " + hours);
		System.out.println("Your total minutes are: " + minutes);
		System.out.println("Your total cost is: $" + totalCost);
	}
}
