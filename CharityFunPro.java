package com.company;

public class CharityFunPro {
    public static void main(String[] args) {
        System.out.println(    Charity(5,3));
    }
    static int Charity(int N, int M){
//Enter your code here
        int a;
        if((N*2)<=M){
            a=M/N;
            return a;
        }
        else
            return -1;
    }
}
