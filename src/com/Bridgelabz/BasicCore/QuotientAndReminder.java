package com.Bridgelabz.BasicCore;

public class QuotientAndReminder {
    public static void QuotientAndReminder(int num1, int num2){

        int quotient = num1/num2;
        int reminder= num1 % num2;
        System.out.println("quotient  is " + quotient);
        System.out.println("reminder is "+ reminder);
    }

    public static void main(String[] args) {
        QuotientAndReminder(15,2);
    }

}

