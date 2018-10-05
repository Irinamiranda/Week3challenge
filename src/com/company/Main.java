package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("What game do you wish to play? numbers/ copycat");
        //prompt user to pick the game
        String gameAnswer = s.nextLine();
        if (gameAnswer.equalsIgnoreCase("copycat")) {

            while (true) {
                //call method copyCat to start the game
                copyCat();
                System.out.println("Would you like to continue? yes/no");
                String answer = s.nextLine();
                if (!answer.equalsIgnoreCase("yes")) {
                    System.out.println(" Thanks for playing");
                    break;
                }
            }
        }
        else if (gameAnswer.equalsIgnoreCase("numbers")) {

            while (true) {
                //call method gameStep to start numbers game
                gameStep();
                System.out.println("Would you like to continue? yes/no");
                String answer = s.nextLine();
                if (!answer.equalsIgnoreCase("yes")) {
                    System.out.println(" Thanks for playing");
                    break;
                }
            }
        }
        else {
            System.out.println("Try again");
        }
    }

        // write your code here

    //create a method to process a loop for numbers game
    public static void gameStep() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s.nextInt();

        for (int i = number; i > 0; i--) {


            if (i % 5 == 0 || i % 7 == 0) {


                System.out.println(i);


            }
        }

    }
    //create a method to process a loop for copycat game
    public static void copyCat() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = s.nextInt();

        for (int i = number; i > 0; i--) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("CopyCat");
            } else if (i % 7 == 0) {
                System.out.println("Cat");
            } else if (i % 5 == 0) {
                System.out.println("Copy");
            } else {
                System.out.println(i);
            }
        }
    }

}
