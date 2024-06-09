import java.util.Scanner;
import java.util.Random;

//This program is a text-based adventure game called Celestia, where the player will battle randomized enemies//
//and battle a boss if they win 10 battles. The player can attack, drink a potion, run away, or end the game//
public class Game {
    public static void main(String[] args) {

//Establishes the classes that will be used to allow the user to "battle" randomly generated enemies//
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        boolean playing = true;

        Player player = new Player();
        Enemy enemy = new Enemy();


        System.out.println();

        System.out.println("Welcome to Celestia!\n ");
        System.out.println("In this game you traverse through the floating kingdom of Celestia" +
                " and your goal is to reach the top of the kingdom and confront the Mad King.");
        System.out.println("After winning 10 battles, you will face the Mad King. Be sure to prepare and preserve you potions!");
        System.out.print("Fight hard and reach the top of Celestia!");
        System.out.println("\n");

//Labels the monster generating loop so that the program knows to create a new monster with each battle//
        GAME:
        while (player.wins <10) {

//Creates the name, health, and damage of the monster that will be generated each time the battle loop restarts//
            int enemyHP = rand.nextInt(enemy.enemyHPmax)+1;
            String[] monster = {"Skeleton", "Dragon", "Goblin", "Warrior", "Cyborg", "Assassin", "Ghoul"};
            String spawn = monster[rand.nextInt(monster.length)];

            System.out.println("\t#######################################");
            System.out.print("\t* A " + spawn + " appears in front of you! *\n");
            System.out.println("\t#######################################\n");

//The primary loop where the game is going to occur. Each battle and possible choice is contained within this loop//
            while (enemyHP > 0) {
                System.out.println("\tYour HP: " + player.HP);
                System.out.println("\t" + spawn + "'s HP: " + enemyHP);
                System.out.println("\n\tYour Options Are: ");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink Potion (" + player.potionAmount + " remaining)");
                System.out.println("\t3. Run Away");
                System.out.println("\t4. Stop Playing\n");
                System.out.print("\tEnter Choice (1, 2, 3, or 4): ");

                String Choice = scan.nextLine();

//The "Attack" option//
//Randomizes player and enemy attack damage each turn, and reads the damage values back to the player//
                if (Choice.equals("1")) {

                    int damage = rand.nextInt(player.Attack);
                    int enemy_damage = rand.nextInt(enemy.enemyAttack);
                    player.HP -= enemy_damage;
                    enemyHP -= damage;

                    System.out.println("\n\t##############################################");
                    System.out.println("\t* You hit the " + spawn + " for " + damage + " damage points! *");
                    System.out.println("\t* The " + spawn + " hits back! You lose " + enemy_damage + " HP! *");
                    System.out.println("\t##############################################\n");

//The game ends if the player's health reaches 0//
                    if (player.HP < 1) {
                        break;
                    }
                }

//The "Drink Potion" option//
//The program checks to see if the player has health potions, and then allows them to "drink" a potion and restore 25 HP//
//If the player doesn't have any potions, nothing happens and the set of choices will reiterate//

                else if (Choice.equals("2")) {
                    if (player.potionAmount > 0) {
                        player.HP += player.Heal;
                        player.potionAmount--;
                        System.out.println("\n\t######################################");
                        System.out.println("\t* You drink a potion, healing " + player.Heal + " HP. *\n\t* You " +
                                "have " + player.potionAmount + " potions remaining. *");
                        System.out.println("\t######################################\n");
                    } else {
                        System.out.println("\n\t###########################");
                        System.out.println("\t* You are out of potions! *");
                        System.out.println("\t###########################\n");
                    }

                }

//The "Run Away" option//
//The current battle will end and then a new enemy battle loop will begin immediately//
                else if (Choice.equals("3")) {
                    System.out.println("\n\t###################################");
                    System.out.println("\t* You ran away from the " + spawn + " ! *");
                    System.out.println("\t###################################\n");
                    continue GAME;
                }

//The "Stop Playing" option//
//Allows the player to end the loop/stop the game//
                else if (Choice.equals("4")) {
                    break GAME;

                }

//If the player doesn't enter one of the previous valid choices, the program will prompt them with invalid command//
                else {
                    System.out.println("\nInvalid command.\n");

                }
            }

//The player "dies" if their HP reaches 0, and the game ends//
            if (player.HP < 1) {
                System.out.println("You have been defeated! Celestia claims another soul and the Mad King's power grows...");
                break;
            }
//Feedback given to the player when an enemy's HP reaches 0//
            System.out.println("\t------------------------------------------");
            System.out.println("\t# The " + spawn + " was defeated! #");
            System.out.println("\t# You have " + player.HP + " HP remaining. #");
            player.wins++;
            player.LevelUp++;

//Randomized chance of the enemy dropping a potion after being defeated//
            if (rand.nextInt(5) < enemy.potionDrop) {
                player.potionAmount++;
                System.out.println("\t# The " + spawn + " dropped a health potion! #");
                System.out.println("\t# You currently have " + player.potionAmount + " health potions. #");
            }

//After each battle the player is prompted with how many battles they've won and asked if they want to keep playing//
            System.out.println("\t------------------------------------------");
            System.out.println("\nYou have won " + player.wins + " battle(s).");
            System.out.println("\nWill you keep fighting? Or will you give up and let the Mad King remain in power?");
            System.out.println("1. Continue fighting");
            System.out.println("2. Give Up");

            String Choice2 = scan.nextLine();

//Reads the players input for if they want to keep playing or quit, and reiterates the prompt if an invalid input is entered//
            while (!Choice2.equals("1") && (!Choice2.equals("2"))) {
                System.out.println("Invalid input");
                Choice2 = scan.nextLine();
            }

            if (Choice2.equals("1")) {
                System.out.println("\nYou continue fighting!\n");
            } else if (Choice2.equals("2")) {
                System.out.println("\nYou give up fighting and exit the castle");
                break;
            }
        }



//Establishes a new while loop that contains the final "boss" battle. Triggers after the player wins 10 battles//
        BOSS:
        while (player.wins == 10){
            int boss_damage = rand.nextInt(enemy.getBossDamage());
            int player_damage = rand.nextInt(player.Attack);

            System.out.println("\t#####################################################################" +
                    "########################################");
            System.out.println("\t* You have arrived at the chamber of the Mad King!" +
                    " Take him down and become the rightful ruler of Celestia! *");
            System.out.println("\t########################################################################" +
                    "#####################################\n");

            System.out.println("\tYour HP: "+player.HP);
            System.out.println("\tThe Mad King's HP: "+enemy.BossHP);
            System.out.println("\n\t Your Options Are: ");
            System.out.println("\t1. Attack");
            System.out.println("\t2. Drink Potion ("+player.potionAmount+" remaining)");
            System.out.println("\t3. Stop Playing");

            if (player.HP <=0){
                break;
            }

            String Choice=scan.nextLine();

//Uses the "Attack" "Drink Potion" and "End Game" options from the battle system loop//
            if (Choice.equals("1")){
                player.HP-= boss_damage;
                enemy.BossHP-=player_damage;

                System.out.println("\n\t################################################");
                System.out.println("\t* You hit The Mad King for " +player_damage+ " damage points! *");
                System.out.println("\t* The Mad King hits back! You lose " + boss_damage + " HP! *");
                System.out.println("\t################################################\n");
            }
            else if (Choice.equals("2")){
                if (player.potionAmount > 0){
                    player.HP += player.Heal;
                    player.potionAmount --;
                    System.out.println("\n\t######################################");
                    System.out.println("\t* You drink a potion, healing "+player.Heal+" HP. *\n\t* You have " +
                            ""+player.potionAmount+" potions remaining. *");
                    System.out.println("\t######################################\n");
                }
                else {
                    System.out.println("\n\t###########################");
                    System.out.println("\t* You are out of potions! *");
                    System.out.println("\t###########################\n");
                }

            }
            else if (Choice.equals("3")){
                break BOSS;
            }
            else{
                System.out.println("Invalid Command");
            }
//Prompts the player that they have defeated the boss and won the game//
            if (enemy.BossHP <=0){
                System.out.println("You have defeated The Mad King and stopped his tyrannical rule of Celestia!\n");
                System.out.println("You take the fallen king's crown and claim your " +
                        "place on the throne as the new ruler of Celestia!\n");
                System.out.println("What kind of ruler will you be? Will you lead Celestia " +
                        "into peace and prosperity? Or will you become mad with power?");
                System.out.println("The fate of Celestia rests in your hands now...");
                break BOSS;
            }
    }
        System.out.println("\nThanks for playing!");
}
}




