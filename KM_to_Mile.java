package com.company;

import java.util.Scanner;

public class KM_to_Mile {
    public static void main(String[] args) {
        System.out.println("Enter kilometer to convert mile");
        Scanner sc=new Scanner(System.in);
        float kilometer = sc.nextFloat();
        float mile = kilometer/1.609344f;
        System.out.println(mile);
    }
}
