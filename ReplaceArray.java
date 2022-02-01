package com.company;
import java.util.Scanner;

public class ReplaceArray {

        public static void main(String[] args)
        {
            int Arr1n;
            Scanner sc=new Scanner(System.in);
            Arr1n= sc.nextInt();
            int arr[]=new int[Arr1n];
            for (int i=0;i<Arr1n;i++){
                arr[i]=sc.nextInt();
            }

            int prev = arr[0];
            arr[0] = arr[0] * arr[1];

            for (int i=1; i<Arr1n-1; i++)
            {
                int curr = arr[i];
                arr[i] = prev * arr[i+1];
                prev = curr;
            }
            arr[Arr1n-1] = prev * arr[Arr1n-1];
            for (int i=0; i<Arr1n; i++)
                System.out.print(arr[i]+" ");
        }
    }
    /* This code is contributed by Devesh Agrawal */


