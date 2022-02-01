package com.company;

import java.util.Scanner;

public class palindromestringY {

        static boolean isPalindrome(long number,int n)
        {long palindrome = number; // copied number into variable
            long rev_num = 0;
            for(int i=0; i<n; i++) {
                rev_num = rev_num * 10 + palindrome % 10;
                palindrome = palindrome / 10;
            }

            if (number == rev_num) {
                return true;
            }
            return false;

        }

        public static void main(String args[])
        {
            String str;
            Scanner scan =  new Scanner(System.in);
            str = scan.next();
            long num = Integer.parseInt(str);
            if(isPalindrome(num,str.length()))
                System.out.println("1");
            else
                System.out.println("0");
        }

}
