import java.util.Scanner;
public class College {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scan.nextLine();

        System.out.print("Enter age: ");
        String age = scan.nextLine();

        System.out.print("Enter college: ");
        String college = scan.nextLine();

        System.out.print("Enter pet name: ");
        String pet = scan.nextLine();

        //Generates a message with user input//
        System.out.print("Hello, my name is "+name+" and I am "+age+" years old.\n" +
                "I’m enjoying my time at "+college+", though\n" +
                "I miss my pet "+pet+" very much!\n");



    }
}
