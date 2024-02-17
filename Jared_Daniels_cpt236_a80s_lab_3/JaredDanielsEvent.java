package Jared_Daniels_cpt236_a80s_lab_3;

public class JaredDanielsEvent 
{
	//defining static and nonstatic fields
	public final static double lowerPricePerGuest = 32.0;
	public final static double higherPricePerGuest = 35.0;
	public final static int cutoffLargeEvent = 50;
	private String eventNumber;
	private int numOfGuests;
	private double price;

	//set method for event number
	public void setEventNumber(String eventNumber)
	{
		this.eventNumber = eventNumber;
	}
	
	//set method for number of guests
	public void setGuests(int numOfGuests)
	{
		this.numOfGuests = numOfGuests;
		total();
	}
	
	//get method for event number
	public String eventNumber()
	{
		return eventNumber;
	}
	
	//get method for number of guests
	public int getNumOfGuests() 
	{
		return numOfGuests;
	}
	
	//get method for price
	public double getPrice()
	{
		return price;
	}
	
	//constructor that accepts even number and number of guests
	public JaredDanielsEvent(String eventNumber, int numOfGuests)
	{
		setEventNumber(eventNumber);
		setGuests(numOfGuests);
	}
	
	//default constructor
	public JaredDanielsEvent()
	{
		eventNumber = "A000";
		numOfGuests = 0;
	}
	
	//method that decides if event is large or not
	public boolean isLargeEvent()
	{
		return numOfGuests >= cutoffLargeEvent;
	}
	
	//method that calculates price based on size of event
	public void total()
	{
		if (isLargeEvent())
		{
			price = numOfGuests * lowerPricePerGuest;
		} 
		else
		{
			price = numOfGuests * higherPricePerGuest;
		}
	}
}
