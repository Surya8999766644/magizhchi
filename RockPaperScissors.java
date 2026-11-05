

package com.mycompany.rockpapersccisor;

 
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your choice:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        int user = sc.nextInt();

        if (user < 1 || user > 3) {
            System.out.println("Invalid choice. Please select 1, 2, or 3.");
        } 
        else {

            int computer = random.nextInt(3) + 1;

            String userChoice = "";
            String computerChoice = "";

            if (user == 1)
                userChoice = "Rock";
            else if (user == 2)
                userChoice = "Paper";
            else
                userChoice = "Scissors";

            if (computer == 1)
                computerChoice = "Rock";
            else if (computer == 2)
                computerChoice = "Paper";
            else
                computerChoice = "Scissors";

            System.out.println("You chose: " + userChoice);
            System.out.println("Computer chose: " + computerChoice);

            if (user == computer) {
                System.out.println("Result: Draw!");
            }
            else if ((user == 1 && computer == 3) ||
                     (user == 2 && computer == 1) ||
                     (user == 3 && computer == 2)) {

                System.out.println("Result: You win!");
            }
            else {
                System.out.println("Result: Computer wins!");
            }
        }

        sc.close();
    }
}


    