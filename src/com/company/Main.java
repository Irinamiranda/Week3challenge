package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Main game = new Main();
        game.checkContinue();

        String answer = s.nextLine();
        if (answer.equalsIgnoreCase("yes")){
            game.checkContinue();
        }
        else {
            System.out.println("Thanks for playing!");
        }







	// write your code here
    }
    public void checkContinue() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s.nextInt();

        for (int i = number; i > 0; i--) {


            if (i % 5 == 0 || i % 7 == 0) {


                System.out.println(i);




            }
        }
        System.out.println("Would you like to continue? yes/no");

    }

}
