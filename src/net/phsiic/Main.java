package net.phsiic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String yes = "y";
        int points = 0;
        String answer = "w";

        String q1 = "What is the capitol of Indiana?";
        String q2 = "In what year did 9/11 occur?";
        String q3 = "What country first landed on the moon?";
        String a1 = "Indianapolis";
        String a1a = "Indy";
        String a2 = "2001";
        String a3 = "America";
        String a3a = "United States";
        String a3b = "The United States";
        String a3c = "The United States of America";
        String a3d = "United States of America";
        String a3e = "USA";
        String a3f = "U.S.A";

        System.out.println("Welcome to the trivia game!");
        System.out.println("Would you like to play the game?");
        System.out.println("Type y to continue, n to quit");
        Scanner scanner = new Scanner(System.in);
        yes = scanner.next();
        if(yes.equals("y")) {
            System.out.println("Beginning game!");
        } else {
            System.exit(0);
        }

        System.out.println(q1);
        Scanner scanner0 = new Scanner(System.in);
        answer = scanner0.next();
        if(answer.equals(a1) || answer.equals(a1a)) {
            System.out.println("You answered correctly!");
            points++;
            System.out.println("You now have " + points + " points!");
        } else {
            System.out.println("You answered incorrectly :(");
            System.out.println("The correct answer was " + a1 + " or " + a1a + ".");
            System.out.println("You have " + points + " points.");
        }

        System.out.println(q2);
        Scanner scanner1 = new Scanner(System.in);
        answer = scanner1.next();
        if(answer.equals(a2)) {
            System.out.println("You answered correctly!");
            points++;
            System.out.println("You now have " + points + " points!");
        } else {
            System.out.println("You answered incorrectly :(");
            System.out.println("The correct answer was " + a2 + ".");
            System.out.println("You have " + points + " points.");
        }

        System.out.println(q3);
        Scanner scanner2 = new Scanner(System.in);
        answer = scanner2.next();
        if(answer.equals(a3) || answer.equals(a3a) || answer.equals(a3b) || answer.equals(a3c) || answer.equals(a3d) || answer.equals(a3e) || answer.equals(a3f)) {
            System.out.println("You answered correctly!");
            points++;
            System.out.println("You now have " + points + " points!");
        } else {
            System.out.println("You answered incorrectly :(");
            System.out.println("The correct answer was " + a3 + " or " + a3a + " or " + a3b + " or " + a3c + " or " + a3d + " or " + a3e + " or " + a3f + ".");
            System.out.println("You have " + points + " points.");
        }

        System.out.println("You have completed the trivia game!");
        System.out.println("Your final score is " + points + "/3 points!");
    }
}
