package com.company;

import java.util.Scanner;

public class test {
  // public static void main(String[] args) {
        /*
        Scanner sc=new Scanner(System.in);
        int input1= sc.nextInt();
        int input2= sc.nextInt();
        int ans=0;
        for (int i=1;i<=input1;i++) {
            if (input2 % i == 0 && input2 / i <= input1){
                ans++;
            }
        }
        System.out.println(ans);*/

      // for handling input/output
// contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
      //class Main {
         public static void main (String[] args) {
            // Your code here
            Scanner sc=new Scanner(System.in);
            int n= sc.nextInt();
            int[]  arr=new int[n];
            int[]  arr1=new int[n];
            int sum=0,b=0;
            for(int i=0;i<n;i++){
               arr[i]= sc.nextInt();
               sum=sum+arr[i];
            }
            for(int i=1;i<n;i++){
               arr1[0]=0;
               if(arr[i-1]<=arr[i]){
                  if(b<arr[i]){
                     b=arr[i];
                  }
                  arr1[i+1]=0;
               }else{
                  arr1[i]=b-arr[i];
               }
            }

            for(int i=0;i<n;i++){
               System.out.print(arr1[i]+" ");
               sum=sum+arr1[i];
            }
            System.out.print("\n"+sum);



         }
      }




