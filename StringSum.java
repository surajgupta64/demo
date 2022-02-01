package com.company;

import java.util.Scanner;

public class StringSum {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            count(arr[i]);
        }
    }

    public static void count(String arr){
        int ans=arr.length();
        for (int i=0; i<arr.length();i++){
            for(int j=i+1;j<arr.length();j++){
                if (arr.charAt(i)==arr.charAt(j)){
                    ans--;
                }
            }
        }
        System.out.println(ans);
    }
}
