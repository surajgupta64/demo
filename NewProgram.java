package com.company;

import java.util.Scanner;

public class NewProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=2,b=4;
        System.out.println(a/b);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(sumofproduct(n1,n2));


    }

    private static int sumofproduct(int n1, int n2) {
        if (n1 == 0 || n2 == 0)
            return 0;
        return ((n1 % 10)* (n2 % 10) + sumofproduct(n1/10,n2/10));
    }

     /*   String input = "GeeksForGeeks";

        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }*/
        // 4. Sorting only the positive numbers from an array A={12,34,-20,44,-10,56,-2,86,12},
        // output: {12,12,-20,34,-10,44,-2,56,86}
    /*    int A[] = {12, 34, -20, 44, -10, 56, -2, 86, 12};
        int b[] = sort(A);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
    private static int[] sort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length - 1; j++) {
                int temp = A[j];
                if (temp >= 0) {
                    int k = j + 1;
                    while (A[k] < 0)
                        k++;
                    if ((A[j] > A[k]) && (A[k] >= 0)) {
                        A[j] = A[k];
                        A[k] = temp;
                    }
                }
            }
        }
        return A;
    }*/
        /*
        //3. print the sum of all the +ve integers from an array A={12,34,-20,44,-10,56,-2,86,12}.
        int A[]={12,34,-20,44,-10,56,-2,86,12};
        int sum=0;
        for (int i=0;i<A.length;i++){
            if (A[i]>0){
                System.out.print(A[i]+" ");
                sum=sum+A[i];
            }
        }
        System.out.println("= "+sum);*/
}