package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Input game score in this format:\n   Home:Visitor|21:9");
        System.out.print(">");

        String scoreLine;
        scoreLine = read.nextLine();

        String[] teamAndScores;
        teamAndScores = scoreLine.split("\\|");

        String[] teams;
        String[] scores;

        teams = teamAndScores[0].split(":");
        scores = teamAndScores[1].split(":");

        int scoreTeam0 = Integer.parseInt(scores[0]);
        int scoreTeam1 = Integer.parseInt(scores[1]);

        if (scoreTeam0 > scoreTeam1){
            System.out.println("Winner: " + teams[0]);
        } else if (scoreTeam1 > scoreTeam0){
            System.out.println("Winner: " + teams[1]);
        } else {
            System.out.println("The teams have tied");
        }




    }
}