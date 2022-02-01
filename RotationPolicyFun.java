package com.company;

public class RotationPolicyFun {
    public static void main(String[] args) {
        System.out.println(RotationPolicy(1,6));
    }
    static int RotationPolicy(int A, int B){
        int a=0;
        for (int i=A;i<=B;i++){
            if (i==2||i==6){
                a++;
            }
        }
        return a;
    }
}
