package com.company;

import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class TF {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc= new Scanner( System.in);
        int n= sc.nextInt();
        int[]  arr=new int[n];
        int sum=0,b=0,i;
        for(i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("done "+arr[i]);

    }
}
