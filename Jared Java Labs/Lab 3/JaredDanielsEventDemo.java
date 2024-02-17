package Jared_Daniels_cpt236_a80s_lab_3;

import java.util.Scanner;

public class JaredDanielsEventDemo 
{
	public static void main(String[] args)
	{
		//event objects
		JaredDanielsEvent event1 = event();
		JaredDanielsEvent event2 = event();
		JaredDanielsEvent event3 = event();
		
		//display details of events
		displayDetails(event1);
        displayDetails(event2);
        displayDetails(event3);
        
        //Deciding the smallest event
        JaredDanielsEvent smallEvent = decideSmallEvent(event1, event2, event3);
        
        //displaying invite to smallest event
        invite(smallEvent);
	}
	
	//creating object that accepts user input
	public static JaredDanielsEvent event()
	{
		Scanner input = new Scanner(System.in);
		int guests;
		String eventNumber = "A000";
		//prompts user for input of event number and number of guests
		 do {
	            System.out.println("Enter the number of guests (between 5 and 100 inclusive): ");
	            guests = input.nextInt();

	            if (guests < 5 || guests > 100) 
	            {
	                System.out.println("Invalid number of guests. Please try again.");
	            }
	        } while (guests < 5 || guests > 100);
		return new JaredDanielsEvent(eventNumber, guests);
	}
	
	//method used to display info of the event
	public static void displayDetails(JaredDanielsEvent event)
	{
		System.out.println("Event Number: " + event.eventNumber());
        System.out.println("Number of Guests: " + event.getNumOfGuests());
        System.out.println("Event Price: $" + event.getPrice());
	}
	
	//method to find event with fewest guests
	public static JaredDanielsEvent decideSmallEvent(JaredDanielsEvent event1, JaredDanielsEvent event2, JaredDanielsEvent event3)
	{
		 if (event1.getNumOfGuests() <= event2.getNumOfGuests() && event1.getNumOfGuests() <= event3.getNumOfGuests()) 
		 {
			 return event1;
	     } 
		 else if (event2.getNumOfGuests() <= event1.getNumOfGuests() && event2.getNumOfGuests() <= event3.getNumOfGuests()) 
		 {
			 return event2;
		 } 
		 else 
		 {
	         return event3;
	     }
	}
	
	//method that displays "Please come to my event!" as many times as there are guests for the smallest event
	public static void invite(JaredDanielsEvent smallEvent)
	{
		for(int i = 0; i < smallEvent.getNumOfGuests(); i++)
		{
			System.out.println("Please come to my event!");
		}
	}
}
