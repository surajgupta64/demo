package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class sepEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }

        sepEvenOdd(arr,n);

    }

    public static void sepEvenOdd(long @NotNull [] arr, int size){

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if ((arr[j] < arr[j + 1])) {
                    long swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }

        for(int i=0;i<size;i++){
            if (arr[i]%2!=0)
            System.out.print(arr[i]+" ");
        }
        for(int i=size-1;i>=0;i--){
            if (arr[i]%2==0)
                System.out.print(arr[i]+" ");
        }
    }
}
