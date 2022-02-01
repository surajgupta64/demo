package com.company;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int originalNumber, remainder, result = 0;

        originalNumber = N;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == N){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
