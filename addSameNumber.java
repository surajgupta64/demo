package com.company;

import java.util.Scanner;

public class addSameNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        long[] arr1=new long[n1];
        long[] arr2=new long[n2];
        long sum=0;
        for (int i=0; i<n1;i++)
            arr1[i]= sc.nextLong();

        for (int i=0; i<n2;i++)
            arr2[i]= sc.nextLong();

        for (int a=0;a<n1;a++){
            for (int b=0;b<n2;b++){
                if (arr1[a]==arr2[b]){
                   sum+=arr1[a];
                }
            }
        }
        System.out.println(sum);
    }
}
