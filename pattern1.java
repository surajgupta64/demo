package com.company;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        /*for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print( " "+j);
            }
            System.out.println();
        }*/
        Scanner sc=new Scanner(System.in);
        int p;
        int n= sc.nextInt();
        for (int i=1; i<=n; i++){
           int a= sc.nextInt();
           p=1;
           for (int j=2;j<a;j++){
               if (a%j==0){
                   p=0;
               }
           }
           if(p>0){
               System.out.println("yes");
           }else {
               System.out.println("no");
           }
        }
    }
}
