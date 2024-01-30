package class236_a80s_demo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Basic printing out to console
		System.out.println("Hello - Welcome to CPT - 236: Intro to Java Programming!");
		System.out.println("Thanks ~ Jared");
		
		// Dialogue box input
		String result;
		int choice;
		boolean isYes;
		String response;
		result = JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null, "Hello, " + result + "!");
		choice = JOptionPane.showConfirmDialog(null, "Hello Please Choose an Option");
		isYes = (choice == JOptionPane.YES_OPTION);
		if(choice == 0)
			response = "YES!";
		else if(choice == 1)
			response = "NO";
		else
			response = "CANCELLED";
		
		JOptionPane.showMessageDialog(null, "You Responded " + response);
		
		JOptionPane.showConfirmDialog(null, "Select One of the Following", "Choose", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		
		// Scanner class inputs
		Scanner inputScannerDevice = new Scanner(System.in);
		
		String name;
		int age;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter your name » ");
		name = inputDevice.nextLine();
		System.out.print("Please enter your age » ");
		age = inputDevice.nextInt();
		System.out.println("Your name is " + name +
			" and you are " + age + " years old.");
		
	}
	
	//display hours method
	public static void displayHours()
	{
		System.out.println("Monday - Friday: 8am - 11pm");
		System.out.println("Saturday: 10am - 5pm");
		System.out.println("Sunday: Closed");
	}

}
