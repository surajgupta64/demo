package com.company;
import java.util.Locale;
import java.util.Scanner;

public class OddChaString {
    public static void main(String[] args) {
        /*int T = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < T; i++) {
            String myString = scan.nextLine();
            String odd = "";
            for (int j = 0; j < myString.length(); j++) {
                if (j % 2 != 0) {
                    odd += " ";
                } else {
                    odd += myString.charAt(j);
                }
            }

            System.out.println(odd);
        }*/
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(" ");
            } else {
                System.out.print(string.charAt(i));
            }
        }
    }
}
