import java.util.Scanner;
import java.util.Random;

public class Dice {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

   private int total = 0;
   private int total2 = 0;
   private int[] player1Roll = new int [2];
   private int[] player2Roll = new int [2];

   public void gameStart() {
        System.out.println("Welcome to the Dice Game! ");
        System.out.println("Player one, please enter your name. ");
        Player player1 = new Player(sc.nextLine());

        for(int i = 1; i < 2; i++) {
            player1Roll[i] = random.nextInt(6) + 1;
            System.out.println("Your total score is " + player1Roll[i]);
        }

        System.out.println("Player two, please enter your name. ");
        Player player2 = new Player(sc.nextLine());

        for(int i = 1; i < 2; i++) {
            player2Roll[i] = random.nextInt(6) + 1;
            System.out.println("Your total score is " + player2Roll[i]);


            if(player1Roll[i] > player2Roll[i]) {
                System.out.println("Congratulations " + player1.getName() + " you have won!");
            }   else if(player2Roll[i] > player1Roll[i]) {
                System.out.println("Congratulations " + player2.getName() + " you have won!");
            }   else if(player1Roll[i] == player2Roll[i]) {
                System.out.println("The final result is a tie.");
            }
        }
   }
}

