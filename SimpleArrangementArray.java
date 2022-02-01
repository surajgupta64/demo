package com.company;


/*Given an array A (0 indexed) of n integers from 0 to n-1 (each integer exactly once), output an array such that A[i] becomes A[A[i]].

Make sure you don't use extra memory than array itself.
Input
The first line of the input contains a number n, the number of integers in the array.
The second line of the input contains n numbers, the elements of A.

Constraints
1 <= n <= 100000
0 <= A[i] <= n-1
Output
Output the required array of n integers.
*/


import java.util.Scanner;

public class SimpleArrangementArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr =new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int big = 10000;
        for (int i=0;i<n;i++){
            arr[i]= (arr[i]+(arr[arr[i]]%big)*big);
        }
        for (int a=0;a<n;a++){
          arr[a]=arr[a]/big;
        }
        for (int b=0;b<n;b++){
            System.out.print(arr[b]+" ");
        }
    }
}
