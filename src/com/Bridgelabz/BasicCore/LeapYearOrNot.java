package com.Bridgelabz.BasicCore;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void LeapYearOrNot(){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year %400 == 0)
        {
            System.out.println(year +" is leap year");
        }else if (year %4 ==0 && year %100 !=0)
        {
            System.out.println( year +" is leap year");
        } else
        {
            System.out.println( year + " is not leap year");
        }
    }

    public static void main(String[] args) {
        LeapYearOrNot();
    }
}

