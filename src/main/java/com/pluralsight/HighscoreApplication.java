package com.pluralsight;

import java.util.Scanner;

public class HighscoreApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

    while (true) {
        System.out.print("Please enter game score ^.^: ");
        String input =  keyboard.nextLine().trim();

        if (!input.contains("|")) {
            System.out.println("Invalid format! T^T\n Please use: Home:Visitor|score1:score2");
            continue;
        }
        String[] parts = input.split("\\|");

        if (parts.length != 2) {
            System.out.println("Invalid format! T^T\n Please use: Home:Visitor|score1:score2");
            continue;
        }




}
    }
}
