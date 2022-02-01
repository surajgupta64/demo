package com.company;

import java.util.Scanner;

public class arrayPro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int totalSum = num*(num+1)/2;
        int arr[]=new int[num-2];
        int actualSum=0;
        int count=0;
        for (int i=0;i<num-2;i++){
            arr[i]= sc.nextInt();
            actualSum+=arr[i];
        }
        System.out.println(totalSum);
        System.out.print("Missing number in array = ");
        System.out.println(totalSum-actualSum);
        int x=0;
        for (int i=0;i<num-2;i++){
            System.out.print(arr[i]);
            System.out.print("["+i+"] ");
        }
        for (int j=num; j>0;j--){
            for (int i=0;i<num-2;i++){
                System.out.println(arr[i]+" "+j);
                 if (arr[i]!=j){
                      count=1;
                 }
            }
            if (count==1){
                System.out.println(j);
                break;
            }
        }



        /*
        int count_of_factors=0;
        System.out.println(num/2);
        for (int i=2;i<=num/2; i++){
            if (num%i==0){
                count_of_factors=count_of_factors+1;
                break;
            }
        }
        if (count_of_factors==0){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
        */
    }
}
//basics of programming arrays ,sortings.
