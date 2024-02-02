//Prints the area of a triangle with user data//
import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle{
    public static void main(String[] args){
//Prompts the user to input the length of 3 sides of a triangle//
        double a,b,c,s,Heron;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        a=scan.nextInt();
        System.out.print("Enter the length of side 2: ");
        b=scan.nextInt();
        System.out.print("Enter the length of side 3: ");
        c=scan.nextInt();

        //Calculates Heron's formula with the length's given by the user to determine the area//
        s=(a+b+c)/2;
        Heron = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        //Prints the final answer with 3 decimal places//
        DecimalFormat deci = new DecimalFormat("0.###");

        System.out.print("The area of your triangle is: "+deci.format(Heron));

    }
}