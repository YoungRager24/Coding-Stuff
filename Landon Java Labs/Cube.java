import java.util.Scanner;

// Prompts the user for 2 integers and then cubes them//
public class Cube {
    public static void main (String[] args) {
        int num1, num2;
        Scanner scan =new Scanner(System.in);

//Asks for first integer//
        System.out.print("Enter first integer: ");
        num1 = scan.nextInt();

//Asks for second integer//
        System.out.print("Enter second integer: ");
        num2 = scan.nextInt();

//Prints the cube of the 1st integer
        System.out.println("The cube of the first integer is: " + Math.pow(num1,3));

//Prints the cube of the 2nd integer
        System.out.print("The cube of the second integer is: " + Math.pow(num2,3));



    }
}