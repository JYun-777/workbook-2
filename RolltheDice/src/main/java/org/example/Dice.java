package org.example;



public class Dice {
    public int roll(){
        int num = (int) (Math.random() * 6) + 1;
        return num;
    }
}
