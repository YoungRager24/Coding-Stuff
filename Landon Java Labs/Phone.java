import java.util.*;
import java.util.random.RandomGenerator;

//Prints a randomized phone number, with specific restrictions//
public class Phone {
    public static void main (String[] args){

      int num1,num2,num3;
      Random rand = new Random();
//Generates an area code that doesn't contain an 8 or a 9//
      num1 = rand.nextInt((7)+1)*100;

//Generates the next 3 digits, with the restriction of being less than 665//
      num2 = rand.nextInt((555)+100);

//Generates the last 4 digits//
      num3 = rand.nextInt(9000)+1000;

//Prints the phone number with dashes//
      System.out.print("Your new number is: ");

      System.out.print(num1+"-"+num2+"-"+num3);
      

    }
}