package com.company;

import java.util.Scanner;

public class strictlyIncreasingOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=1;
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<n-1;i++){
            if (arr[i]<arr[i+1]){
                a++;
            }
        }
        System.out.println(a);
    }
}
