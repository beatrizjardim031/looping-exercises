package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) {

        int numTimes = 0;
        do {
            numTimes += 1;
            System.out.println("I like Java.");
        } while (numTimes <= 5);
    }
}
