package com.pluralsight;

import java.util.InputMismatchException;

import java.util.Scanner;

public class HighscoreApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

    while (true) {
        System.out.print("Please enter game score ^.^: ");
        String input =  keyboard.nextLine().trim();

        if (!input.contains("|")) {
            System.out.println("Invalid format! T^T\nPlease use: Home:Visitor|score1:score2");
            continue;
        }
        String[] parts = input.split("\\|");

        if (parts.length != 2) {
            System.out.println("Invalid format! T^T\nPlease use: Home:Visitor|score1:score2");
            continue;
        }

        String teamPart  = parts[0].trim();
        String scorePart = parts[1].trim();

        if (!teamPart.contains(":") || !scorePart.contains(":")) {
            System.out.println("Invalid format! T^T\nPlease use: Home:Visitor|score1:score2");
            continue;
        }

        String[] teams  = teamPart.split(":");
        String[] scores = scorePart.split(":");

        if (teams.length != 2 || scores.length != 2) {
            System.out.println("Invalid format! T^T\nPlease use: Home:Visitor|score1:score2");
            continue;
        }

        String homeTeam    = teams[0].trim();
        String visitorTeam = teams[1].trim();

        if (homeTeam.isEmpty() || visitorTeam.isEmpty()) {
            System.out.println("Team names can't be empty silly! >.<");
            continue;
        }

        int homeScore;
        int visitorScore;

        try {
            homeScore    = Integer.parseInt(scores[0].trim());
            visitorScore = Integer.parseInt(scores[1].trim());
        } catch (NumberFormatException e) {
            System.out.println("Scores must be whole numbers! ^^;\nExample: 21:9");
            continue;
        }

        if (homeScore < 0 || visitorScore < 0) {
            System.out.println("Scores can't be negative! -.-");
            continue;
        }

        if (homeScore > visitorScore) {
            System.out.println("Winner ^u^: " + homeTeam);
        }




    }
    }
}
