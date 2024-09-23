import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    int total = 0;
    int total2 = 0;

    System.out.println("Enter your name. ");
    String playerName = sc.nextLine();

    for(int i = 1; i < 2; i++) {
        int roll = random.nextInt(6) + 1;
        int roll2 = random.nextInt(6) + 1;
        System.out.println(roll);
        System.out.println(roll2);
        total += roll + roll2;

        System.out.println("Your final score is " + total);

        System.out.println("Player two please enter your name. ");
        String playerName2 = sc.nextLine();


        for(int j = 1; j < 2; j++);
        int roll3 = random.nextInt(6) + 1;
        int roll4 = random.nextInt(6) + 1;
        System.out.println(roll3);
        System.out.println(roll4);
        total2 += roll3 + roll4;

        System.out.println("Your final score is " + total2);

        if(total > total2) {
            System.out.println("Congratulations " + playerName + ", you won!");
        }   else if (total < total2) {
            System.out.println("Congratulations " + playerName2 + ", you won!");
        }   else if (total == total2){
            System.out.println("Tie!");


            // Add condition if both players get the same score.

        }
        }

    }
    }










   /* Player player = new Player(playerName);
    Random random = new Random();
    int roll = random.nextInt(6) + 1;
    System.out.println("You rolled a " + roll);
    int roll2 = random.nextInt(6) + 1;
    System.out.println("You rolled a " + roll2);
    int rollTotal = roll + roll2;
    System.out.println("Your total score is " + rollTotal);



    System.out.println("Player two enter your name. ");
    String playerTwoName = sc.nextLine();
    Player playerTwo = new Player(playerTwoName);
    int roll3 = random.nextInt(6) + 1;
    System.out.println("You rolled a " + roll3);
    int roll4 = random.nextInt(6) + 1;
    System.out.println("You rolled a " + roll4);
    int rollTotal2 = roll2 + roll3;
    System.out.println("Your total score is " + rollTotal2);

    if (rollTotal > rollTotal2) {
        System.out.println("The winner is " + playerName);
    }   else {
        System.out.println("The winner is " + playerTwoName);
        } */



