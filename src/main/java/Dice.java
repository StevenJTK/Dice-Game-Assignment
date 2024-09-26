import java.util.Scanner;
import java.util.Random;

public class Dice {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    // Attributes
    private int total = 0;
    private int total2 = 0;
    private int[] player1Roll = new int[2];
    private int[] player2Roll = new int[2];

    public void gameStart() {

        System.out.println("Player one, please enter your name. ");
        Player player1 = new Player(sc.nextLine());

        for (int i = 0; i < 2; i++) {
            player1Roll[i] = random.nextInt(6) + 1;
            total += player1Roll[i];
            System.out.println(player1Roll[i]);

        }

        System.out.println("Your final score is " + total);

        System.out.println("Player two, please enter your name. ");
        Player player2 = new Player(sc.nextLine());

        for (int i = 0; i < 2; i++) {
            player2Roll[i] = random.nextInt(6) + 1;
            total2 += player2Roll[i];
            System.out.println(player2Roll[i]);
        }

        System.out.println("Your total score is " + total2);

        if (total > total2) {
            System.out.println("Congratulations " + player1.getName() + ", you are the winner! ");
        } else if (total < total2) {
            System.out.println("Congratulations " + player2.getName() + ", you are the winner! ");
        }   else {
            System.out.println("Tie!");
        }
    }
}
