import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    Dice dice = new Dice();

    dice.gameStart();




    /*  int total = 0;
    int total2 = 0;

    System.out.println("Enter your name, player one. ");
        Player player1 = new Player(sc.nextLine());

    for(int i = 1; i < 2; i++) {
        int roll = random.nextInt(6) + 1;
        int roll2 = random.nextInt(6) + 1;
        System.out.println(roll);
        System.out.println(roll2);
        total += roll + roll2;

        System.out.println("Your final score is " + total);

        System.out.println("Player two, please enter your name. ");
        Player player2 = new Player(sc.nextLine());


        for(int j = 1; j < 2; j++);
        int roll3= random.nextInt(6) + 1;
        int roll4 = random.nextInt(6) + 1;
        System.out.println(roll3);
        System.out.println(roll4);
        total2 += roll3 + roll4;

        System.out.println("Your final score is " + total2);

        if(total > total2) {
            System.out.println("Congratulations " + player1.getName() + ", you won!");
        }   else if (total < total2) {
            System.out.println("Congratulations " + player2.getName() + ", you won!");
        }   else if (total == total2){
            System.out.println("Tie!");

            }
        } */
    }
}



