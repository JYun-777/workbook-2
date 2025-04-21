package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] testScores = {23,5,37,34,56,78,90,86,100,96};
        double average;
        double highScore;
        double lowScore;
        double[] median;

        Arrays.sort(testScores);

        highScore = testScores[testScores.length - 1];

        lowScore = testScores[0];

        int index = testScores.length/2;
        if (testScores.length % 2 == 0){
            median = new double[]{testScores[index - 1], testScores[index]};
        }
        else{
            median = new double[]{testScores[index]};
        }

        double sum = 0;
        for (double testScore : testScores) {
            sum += testScore;
        }
        average = sum/testScores.length;
        System.out.println(Arrays.toString(testScores));
        System.out.printf("Average score: %f\nHigh Score: %f\nLowest Score: %f\nMedian Scores: %f,%f",
                average, highScore, lowScore, median[0], median[1]);



    }
}