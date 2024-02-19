package Jared_Daniels_cpt236_a80s_lab_4;

/*
 * Jared Daniels
 * This program takes text and processes it in various ways.
 * 19 February 2024
 * CPT-236-A80S
 */ 

import javax.swing.JOptionPane;
import java.util.Scanner;

public class JaredDanielsMain {

	public static void main(String[] args) 
	{
		JaredDanielsTextProcessor textProcessor = new JaredDanielsTextProcessor();
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			//ask user what process they would like to use
			System.out.println("What would you like to do? (Enter number for option)"
					+ "\n1. Append text" + "\n2. Remove characters" + "\n3. Replace characters" + "\n4. Display current text" 
					+ "\n5. Reverse Text" + "\n6. Convert text to uppercase" + "\n7. Convert text to lowercase");
			int choice = scanner.nextInt();
            scanner.nextLine();
            
			if (choice == 1)//appends text
			{
				System.out.println("Enter text to append: ");
                String textToAppend = scanner.nextLine();
                textProcessor.appendText(textToAppend);
			}
			
			else if (choice == 2)
			{
				System.out.println("Enter characters to remove: ");
                String characters = scanner.nextLine();
                textProcessor.removeChar(characters);
			}
			
			else if (choice == 3)
			{
				System.out.println("Enter characters to replace:");
                String oldChars = scanner.nextLine();
                System.out.println("Enter new characters:");
                String newChars = scanner.nextLine();
                textProcessor.replaceChar(oldChars, newChars);
			}
			
			else if (choice == 4)
			{
				textProcessor.displayText();
			}
			
			else if (choice == 5)
			{
				textProcessor.reverseText(); 
			}
			
			else if (choice == 6)
			{
				textProcessor.convertToUppercase(); 
			}
			
			else if (choice == 7)
			{
				textProcessor.convertToLowercase(); 
			}
			
			else
			{
				break;
			}
		}
	}

}
