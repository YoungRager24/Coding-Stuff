package Jared_Daniels_cpt236_a80s_lab_5;

public class JaredDanielsCar extends JaredDanielsVehicle
{
	//attributes
	private int numDoors;
	private boolean isConvertible;
	
	//constructor
	public JaredDanielsCar(String make, String model, int year, double price, int numDoors, boolean isConvertible) 
	{
		super(make, model, year, price);
		this.numDoors = numDoors;
		this.isConvertible = isConvertible;
	}
	
	@Override
    public void display() 
	{
        super.display();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Convertible: " + (isConvertible ? "Yes" : "No"));
    }
}
