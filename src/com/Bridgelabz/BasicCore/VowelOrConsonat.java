package com.Bridgelabz.BasicCore;

public class VowelOrConsonat {
    public static void vowelorconsonat(char y) {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u') {
            System.out.println(" It is vowel");
        } else {
            System.out.println("It is Consonant");
        }
    }

    public static void main(String[] args) {
        vowelorconsonat('b');
        vowelorconsonat('u');
    }
}

