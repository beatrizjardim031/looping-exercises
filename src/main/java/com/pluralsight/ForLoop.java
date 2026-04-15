package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

//     for  (initialization; condition; other)
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000); //this method is pausing the countdown 1 second between each number
        }

        System.out.println("Launch!!!");
    }
}
