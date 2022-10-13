package com.Bridgelabz.BasicCore;

public class PowerOf2 {
    public static void main(String[] args) {
        int num, mul=1;
        num = Integer.parseInt(args[0]);

        if (num>31)
        {
            System.out.println("value of number should be less than 31");

        } else
        {
            System.out.println(mul);
            for (int i=1; i<=num; i++)
            {
                mul= mul*2;
                System.out.println(mul);
            }
        }
    }
}

