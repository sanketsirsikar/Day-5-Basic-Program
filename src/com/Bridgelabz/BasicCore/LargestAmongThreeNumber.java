package com.Bridgelabz.BasicCore;

public class LargestAmongThreeNumber {
    public static void LargestNumber(int num1, int num2, int num3){
        if (num1>=num2 && num1>=num3)
        {
            System.out.println(num1 +"num is greter ");
        }else if (num2>=num1 && num2>=num3)
        {
            System.out.println(num2 + " num is greter");
        }else
        {
            System.out.println(num3 + "num is greter");
        }

    }

    public static void main(String[] args) {
        LargestNumber(60,10,20);
    }
}


