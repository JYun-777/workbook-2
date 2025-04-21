package org.example;

public class Main {

    public static void main(String[] args) {
        int roll1;
        int roll2;
        int sum;
        int count2rolls = 0;
        int count4rolls = 0;
        int count6rolls = 0;
        int count7rolls = 0;

        Dice dice = new Dice();

        int rollAmount = 20;

        int rollCount = 0;
        while (rollCount < rollAmount) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;
            System.out.printf("Roll 1:  %d - %d  Sum:  %d\n", roll1, roll2, sum);

            switch (sum){
                case 2:
                    count2rolls++;
                    break;
                case 4:
                    count4rolls++;
                    break;
                case 6:
                    count6rolls++;
                    break;
                case 7:
                    count7rolls++;
                    break;
            }

            rollCount++;
        }

        System.out.printf("Number of times rolled\n2: %d\n4: %d\n6: %d\n7: %d\n", count2rolls, count4rolls, count6rolls, count7rolls);
    }
}