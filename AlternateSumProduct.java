package com.company;

import java.util.Scanner;

public class AlternateSumProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr =new int[n];
        int sum=0,products = 1;
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            if (0 == (i+1) % 2)
                sum+=arr[i];
            else {
                products *=arr[i]; 
            }
        }
        System.out.print(sum+" "+products);
    }
}
