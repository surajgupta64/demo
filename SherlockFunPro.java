package com.company;

public class SherlockFunPro {
    public static void main(String[] args) {
        System.out.println( Help(6,2));

    }
    static int Help(int N, int M){
//Enter your code here
        if(N%M==0){
            return 1;
        }
        else
            return 0;
    }
}
