package Jared_Daniels_cpt236_a80s_lab_5;

public class JaredDanielsVehicle 
{
	//attributes
	private String make;
	private String model;
	private int year;
	private double price;
	
	//constructor
	public JaredDanielsVehicle(String make, String model, int year, double price)
	{
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	//display method every class will use
	public void display() 
	{
        System.out.println("\nMake: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}

