package com.company;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers for addition");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println(sum);
    }
}
