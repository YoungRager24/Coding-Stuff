package Jared_Daniels_cpt236_a80s_lab_5;

import java.util.Scanner;

public class JaredDanielsMain
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		//array to store vehicles
        JaredDanielsVehicle[] vehicles = new JaredDanielsVehicle[10];
        int index = 0;
		
		//user input for vehicles
		while(true)
		{
			System.out.println();
			System.out.println("1. Car");
            System.out.println("2. Truck");
            System.out.println("3. SUV");
            System.out.println("4. Display Vehicles");
            System.out.println("5. Exit");
            System.out.println("Enter number for vehicle: ");
            int choice = scanner.nextInt();
            
            if (choice == 1)//choice for car and details for car
            {
            	System.out.println("Enter Car details:");
                System.out.print("Make: ");
                String make = scanner.next();
                System.out.print("Model: ");
                String model = scanner.next();
                System.out.print("Year: ");
                int year = scanner.nextInt();
                System.out.print("Price: $");
                double price = scanner.nextDouble();
                System.out.print("Number of Doors: ");
                int numDoors = scanner.nextInt();
                System.out.print("Convertible (true/false): ");
                boolean isConvertible = scanner.nextBoolean();
                vehicles[index] = new JaredDanielsCar(make, model, year, price, numDoors, isConvertible);
                index++;
            }
            else if (choice == 2)//choice for truck and details for truck
            {
            	 System.out.println("Enter Truck details:");
                 System.out.print("Make: ");
                 String make = scanner.next();
                 System.out.print("Model: ");
                 String model = scanner.next();
                 System.out.print("Year: ");
                 int year = scanner.nextInt();
                 System.out.print("Price: $");
                 double price = scanner.nextDouble();
                 System.out.print("Bed Length: ");
                 double bedLength = scanner.nextDouble();
                 System.out.print("Towing Capacity: ");
                 double towingCapacity = scanner.nextDouble();
                 vehicles[index] = new JaredDanielsTruck(make, model, year, price, bedLength, towingCapacity);
                 index++;
            }
            else if (choice == 3)//choice for SUV and details for SUV
            {
            	 System.out.println("Enter SUV details:");
                 System.out.print("Make: ");
                 String make = scanner.next();
                 System.out.print("Model: ");
                 String model = scanner.next();
                 System.out.print("Year: ");
                 int year = scanner.nextInt();
                 System.out.print("Price: $");
                 double price = scanner.nextDouble();
                 System.out.print("Seating Capacity: ");
                 int seatingCapacity = scanner.nextInt();
                 System.out.print("Third row? (true/false): ");
                 boolean hasThirdRow = scanner.nextBoolean();
                 vehicles[index] = new JaredDanielsSUV(make, model, year, price, seatingCapacity, hasThirdRow);
                 index++;
            }
            else if (choice == 4)//choice to display vehicles you've entered and their details
            {
            	System.out.println("Vehicles:");
                for (int i = 0; i < index; i++) 
                {
                    vehicles[i].display();
                    try {
						Thread.sleep(2000);
					} catch (InterruptedException e) 
                    {
						e.printStackTrace();
					}
                }
            }
            else if (choice == 5)//exit program
            {
            	System.out.println("Thank you!");
            	break;
            }
		}
	}

}
