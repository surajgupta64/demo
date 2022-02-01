package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class duplicateChar {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int col= sc.nextInt();
            int[][] matrix = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j <col ; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            spiralMatrix(matrix.length,matrix[0].length,matrix);

        }
        public static List<Integer> spiralMatrix(int rowEnd,int colEnd,int[][] matrix) {
            List<Integer> res = new ArrayList();

            if(matrix.length == 0) return res;

            int rowBegin = 0;
            int colBegin = 0 ;

            while((rowBegin < rowEnd) && (colBegin < colEnd)){
                for(int i=colBegin; i<colEnd;i++){
                    res.add(matrix[rowBegin][i]);
                }
                rowBegin --;

                for(int i =rowBegin ; i< rowEnd ; i++){
                    res.add(matrix[i][colEnd]);
                }
                colEnd -- ;

                if(rowBegin< rowEnd){
                    for(int i =colEnd-1 ; i>=colBegin ; i--){
                        res.add(matrix[rowEnd][i]);
                    }
                    rowEnd--;
                    if(colBegin<colEnd){
                        for(int i = rowEnd-1 ; i>=rowBegin ; i--){
                            res.add(matrix[i][colBegin]);
                        }
                        colBegin-- ;
                    }

                }

            }
            return res;
        }



    /*public static void main(String[] args) {
        String string1 = "Great responsibility";
        int count;

        //Converts given string into character array
        char string[] = string1.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
        //Counts each character present in the string
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if(count > 1 && string[i] != '0')
                System.out.print(string[i]+" ");
        }
    }*/
}
