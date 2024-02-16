package javalearning;

import java.util.Scanner;

public class javaPattern {
	
    public static void main(String[] args) {
        int number = 5;
         for(int i = 0 ;i < 5 ;i++){
             for (int j=0;j<5;j++){
                 //if(i ==0){
                  //  System.out.print(number+" ");
                // }else{
                 //   System.out.print(number+" ");
                 //   number--;
                 //}
                 //System.out.print(number-i+" ");
                 if(i< j){
                     System.out.print(number-i+" ");
                 }else{
                     System.out.print(number-j+" ");
                 }
             }
             System.out.println();
         }
    }
}
