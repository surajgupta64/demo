package com.company;

public class array2missing {
        public static void main(String[] args)
        {
            int arr[] = {1, 3, 5, 6};

            int n = 2 + arr.length;

            boolean []mark = new boolean[n+1];
            for (int i = 0; i < n-2; i++)
                mark[arr[i]] = true;

            System.out.println("Two Missing Numbers are");
            for (int i = 1; i <= n; i++)
                if (! mark[i])
                    System.out.print(i + " ");

            System.out.println();
        }

}
