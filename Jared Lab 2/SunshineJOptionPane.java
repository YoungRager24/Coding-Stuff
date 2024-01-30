package Jared_Daniels_cpt236_a80s_lab_2;

/*
 * Jared Daniels
 * This program takes the minutes of rental time and computes how much it costs for every hour and extra minute.
 * 29 January 2024
 * CPT-236-A80S
 */ 

import javax.swing.JOptionPane;

public class SunshineJOptionPane {
	static int minutes;
	
	public static void main(String[] args) {
		rentalTime();
		rentalCost();
	}

	public static int rentalTime() {
		minutes = Integer.parseInt(JOptionPane.showInputDialog(null, "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS"
				+ "\nS                                                                                    S"
				+ "\nS Sunshine Seashore makes it fun in the sun. S"
				+ "\nS                                                                                    S"
				+ "\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS"
				+ "\nPlease enter rental time in minutes: "));
		return minutes;
	}
	
	public static void rentalCost() {
		int hours = minutes/60;
		minutes = minutes%60;
		int totalCost = (hours*40) + (minutes*1);
		JOptionPane.showMessageDialog(null, "Your total hours are: " + hours
				+ "\nYour total minutes are: " + minutes
				+ "\nYour total cost is: $" + totalCost);
	}
}
