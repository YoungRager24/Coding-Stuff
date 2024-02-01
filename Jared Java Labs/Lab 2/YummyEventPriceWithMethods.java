/*
 * Jared Daniels
 * This program takes the number of guests that are attending an event and calculates the price of $35 per person and 
 * decides if it is a big event or not based on how many are attending, then displays it back.
 * 29 January 2024
 * CPT-236-A80S
 */ 

import java.util.Scanner;

public class YummyEventPriceWithMethods {
	static int guests;
	public static void main(String[] args) {
		companyMotto();
		numberOfGuests();
		totalCost();
	}
	
	public static int numberOfGuests() {
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("\nPlease enter number of guests attending: ");
		guests = inputDevice.nextInt();
		System.out.println("Number of guests: " + guests);
		return guests;
	}
	
	public static void companyMotto() {
		System.out.println("***********************************************");
		System.out.println("*                                             *");
		System.out.println("* Yummy makes the food that makes it a party. *");
		System.out.println("*                                             *");
		System.out.println("***********************************************");
	}
	
	public static void totalCost() {
		final int price = 35;
		int total;
		boolean eventSize;
		
		total = guests * price;
		
		if (guests >= 50)
		{
			eventSize = true;
		}
		else
		{
			eventSize = false;
		}
		
		System.out.println("The price per person is: $" + price);
		System.out.println("The total price is: $" + total);
		System.out.println("Big Event? " + eventSize);
	}
}
