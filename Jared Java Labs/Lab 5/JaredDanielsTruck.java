package Jared_Daniels_cpt236_a80s_lab_5;

public class JaredDanielsTruck extends JaredDanielsVehicle
{
	//attributes
	private double bedLength;
	private double towingCapacity;
	
	//constructor
	public JaredDanielsTruck(String make, String model, int year, double price, double bedLength, double towingCapacity) 
	{
        super(make, model, year, price);
        this.bedLength = bedLength;
        this.towingCapacity = towingCapacity;
	}
	
	@Override
    public void display() 
	{
        super.display();
        System.out.println("Bed Length: " + bedLength);
        System.out.println("Towing Capacity: " + towingCapacity);
	}
}
