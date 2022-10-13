package com.Bridgelabz.BasicCore;

public class FlipCoin {
    public static void Flipcoin() {

        if (Math.random() < 0.5) {
            System.out.println("head");
        } else {
            System.out.println("tail");
        }
    }


    public static void main(String[] args) {
        Flipcoin();
    }
}
