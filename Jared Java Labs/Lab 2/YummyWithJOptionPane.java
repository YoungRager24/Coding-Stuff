/*
 * Jared Daniels
 * This program takes the number of guests that are attending an event and calculates the price of $35 per person and 
 * decides if it is a big event or not based on how many are attending, then displays it back.
 * 29 January 2024
 * CPT-236-A80S
 */ 

import javax.swing.JOptionPane;

public class YummyWithJOptionPane {
	static int guests;
	public static void main(String[] args) {
		numberOfGuests();
		totalCost();
	}
	
	public static int numberOfGuests() {
		guests = Integer.parseInt(JOptionPane.showInputDialog(null, "******************************************************" 
				+ "\n*                                                                                       *" 
				+ "\n* Yummy makes the food that makes it a party. *" 
				+ "\n*                                                                                       *" 
				+ "\n******************************************************" + 
				"\nHow many guests are attending?"));
		return guests;
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
		
		JOptionPane.showMessageDialog(null, "There are " + guests + " guests attending." 
				+ "\nThe price per person is: $" + price 
				+ "\nThe total price is: $" + total + "\nBig Event? " + eventSize);
	}
}
