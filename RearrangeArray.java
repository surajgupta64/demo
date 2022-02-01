package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArray {
        /*public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            for (int i = 0; i < n; i++)
                arr[i] += (arr[arr[i]] % n) * n;
            for (int i = 0; i < n; i++)
                arr[i] /= n;

            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println("");
        }*/


    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int A[]=new int[n];
        for (int i=0;i<n;i++){
            A[i]= sc.nextInt();
        }
        int[] aux = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            aux[A[i]] = i;
        }
        for (int i = 0; i < n; i++)
            System.out.print(aux[i]+" ");
        System.out.println();
    }

}
