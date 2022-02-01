package com.company;

import java.util.Scanner;

//package storing head file. head file is predefine class and method.
//import java.util.*;
public class FirstProgram {
    //firstprogram is class
    /*public static void main(String[] args) {
        //main is predefined function in java without main function con't run any task.
        System.out.print("hello world");
    }*/

        public static void main (String[] args) {
            // Your code here
            Scanner sc=new Scanner(System.in);
            int ns=sc.nextInt();
            for (int i=1;i<=ns;i++){
                for (int j=1; j<=i;j++){
                    System.out.print(j+" ");
                }
                for (int j=i-1;j>=1;j--){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            for (int i=ns-1;i>=1;i--){
                for (int j=1; j<=i;j++){
                    System.out.print(j+" ");
                }
                for (int j=i-1;j>=1;j--){
                    System.out.print(j+" ");
                }
                System.out.println();
            }




            /*long ans=sc.nextLong();
            int n= (int) ns;
            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            long sum=0;
            for(int i=0; i<n; i++){
                for(int j=0;j<n;j++){
                    sum=arr[i]+arr[j];
                    if(sum==ans)
                        break;

                }
            }*/

            /*
            if(sum==ans){
                System.out.println("1");
            }else {
                System.out.println("0");
            }*/
        }

}
