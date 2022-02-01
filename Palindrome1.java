package com.company;

import java.util.Arrays;

// Java program to illustrate checking of a string
// if its palindrome or not using reverse function
class Palindrome1
{
    public static void main (String[] args)
    {
        String s="abcdeb";
        char[] s2 =s.toCharArray();
        Arrays.sort(s2);
        String s1="";
        for (int i=0;i<s.length();i++){
            if (i%2!=0){
                s1+=s.charAt(i);
            }
        }
        String reverse = new StringBuffer(s1).reverse().toString();
        if (s1.equals(reverse))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
