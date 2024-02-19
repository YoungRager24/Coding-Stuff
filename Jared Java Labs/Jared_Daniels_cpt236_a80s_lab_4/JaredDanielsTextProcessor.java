package Jared_Daniels_cpt236_a80s_lab_4;

import javax.swing.JOptionPane;

/*
 * Jared Daniels
 * This program takes text and processes it in various ways.
 * 19 February 2024
 * CPT-236-A80S
 */ 

public class JaredDanielsTextProcessor 
{
	private StringBuilder currentText;
	
	public JaredDanielsTextProcessor() 
	{
        currentText = new StringBuilder();
	}
	
	public void appendText(String text)//appends text to an existing text
	{
		currentText.append(text);
	}
	
	public void removeChar(String characters)//removes specified characters from text
	{
		 currentText = new StringBuilder(currentText.toString().replace(characters, ""));
	}
	
	public void replaceChar(String oldChars, String newChars)//replaces specified characters with other characters
	{
		currentText = new StringBuilder(currentText.toString().replace(oldChars, newChars));
	}
	
	public void displayText()//displays current text
	{
		System.out.println("Current Text: " + currentText);
    }
	
	public void reverseText()//reverses the text
	{
        currentText.reverse();
    }

    public void convertToUppercase()//converts text to uppercase
    {
        currentText = new StringBuilder(currentText.toString().toUpperCase());
    }

    public void convertToLowercase()//converts text to lowercase
    {
        currentText = new StringBuilder(currentText.toString().toLowerCase());
    }
}
