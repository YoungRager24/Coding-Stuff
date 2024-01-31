package JaredDaniels_cpt236_a80s_Test1;

/*
 * Jared Daniels
 * CPT-236-A80S
 */ 

//importing classes
import java.util.Random;
import javax.swing.JOptionPane;

public class JaredDaniels_cpt236_a80s_Test1 {
	
	public static void main(String[] args) { //start of main method
		int option = 0;
		while(option == 0) { //while loop added so user can play multiple times
			int computerChoice = computerPick();
			int playerFinalChoice = userPick();
			String winner = getWinner(computerChoice, playerFinalChoice);
			JOptionPane.showMessageDialog(null, "\n" + winner);
			option = JOptionPane.showConfirmDialog(null, "Would you like to play again?");
		}
		JOptionPane.showMessageDialog(null, "Thank you for playing!!!"); //thanks user for playing
    }

    public static int computerPick() { //assigns a random integer for the computer to pick
        Random randomGen = new Random();
        int num = randomGen.nextInt(1, 4);
        return num;
    }
    
    public static int userPick() { //user inputs choice between rock paper and scissors
    	JOptionPane.showMessageDialog(null, " Rock Paper Scissors \n" +
                " Rock : 1 \n"  +
                " Paper : 2 \n"  +
                " Scissors : 3 \n");
        int playerChoice = 0;
        while(playerChoice < 1 || playerChoice > 3){ //loop that makes sure you enter a number between 1 and 3
        	String input = JOptionPane.showInputDialog(null, "Please make your choice (between 1 and 3):");
            try {
            	playerChoice = Integer.parseInt(input);
            }catch (NumberFormatException e) {       
            }
        }
        return playerChoice;
    }

    public static String getWinner(int computer, int player){ //if statements that decide who wins based on the random number the computer played and the number the user inputed
        if (computer == 1){
            if (player == 1){
                return "You chose Rock\nThe computer chose Rock\nYou drew.";
            }else if(player == 2){
                return "You chose Paper\nThe computer chose Rock\nYou win!";
            }else{
                return "You chose Scissors\nThe computer chose Rock\nComputer wins!";
            }
        }else if (computer == 2){
            if (player == 1){
                return "You chose Rock\nComputer chose Paper\nComputer wins!";
            }else if(player == 2){
                return "You chose Paper\nComputer chose Paper\nYou drew.";
            }else{
                return "You chose Scissors\nComputer chose Paper\nYou win!";
            }
        }else if (computer == 3){
            if (player == 1){
                return "You chose Rock\nComputer chose Scissors\nYou win!";
            }else if(player == 2){
                return "You chose Paper\nComputer chose Scissors\nComputer wins!";
            }else{
                return "You chose Scissors\nComputer chose Scissors\nYou drew.";
            }
        }
		return null;
    }
}
