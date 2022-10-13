package com.Bridgelabz.BasicCore;

import java.util.Scanner;

public class CheckNumberEvenOrOdd {
    public static void EvenOrOdd(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 ==0 )
        {
            System.out.println(num+ " number  is even");
        }else
        {
            System.out.println(num + " number  is odd ");
        }
    }

    public static void main(String[] args) {
        EvenOrOdd();
    }
}
