package javalearning;

import java.util.Scanner;

public class findSmallestNumber {
	
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
//		  System.out.println(inputObj.nextInt());
    		int a = 0,b = 0,c =0,temp=0,temp2=0;
    		a = inputObj.nextInt();
    		b = inputObj.nextInt();
    		c = inputObj.nextInt();
    		temp = a < b ? a : b;
    		temp2 = temp < c ?temp : c;
    		System.out.println("The smallest number among the given number is "+temp2 );
    }
}
