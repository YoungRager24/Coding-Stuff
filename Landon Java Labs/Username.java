import java.util.*;

public class Username {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int num;

// Creates a prompt that asks the user for their first and last name//
        System.out.print("Enter first name: ");
        String first = scan.nextLine();

        System.out.print("Enter last name: ");
        String last = scan.nextLine();

//Uses the users information to create a randomized username//
        System.out.print(first.charAt(0));
        // Prints the first letter of the users first name//

        System.out.print(last.substring(0,5));
        //Prints the first 5 letters of the users last name//

        System.out.print(num = rand.nextInt(90) + 10);
        //Prints a random number from 10-99//
    }
}


