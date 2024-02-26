package Jared_Daniels_cpt236_a80s_lab_5;

public class JaredDanielsSUV extends JaredDanielsVehicle
{
	//attributes
	private int seatingCapacity;
	private boolean hasThirdRow;
	
	//constructor
	public JaredDanielsSUV(String make, String model, int year, double price, int seatingCapacity, boolean hasThirdRow) 
	{
        super(make, model, year, price);
        this.seatingCapacity = seatingCapacity;
        this.hasThirdRow = hasThirdRow;
    }
	
	@Override
    public void display() 
	{
        super.display();
        System.out.println("Bed Length: " + seatingCapacity);
        System.out.println("Third Row: " + (hasThirdRow ? "Yes" : "No"));
	}
}
