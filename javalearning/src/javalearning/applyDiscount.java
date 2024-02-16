package javalearning;

import java.util.Scanner;

public class applyDiscount {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
		
    		int inputNumber = inputObj.nextInt();
    		//System.out.println(inputNumber);
    		double payableAmount = 0;
    		double discountAmount =0;
        if(inputNumber < 500) {
    			discountAmount =0;
    		}else if(inputNumber > 500 && inputNumber < 1000) {
    			discountAmount =(inputNumber *0.1);
    		}else if(inputNumber > 2000) {
    		    discountAmount = (inputNumber *0.2);
    		}
    		//System.out.println(discountAmount);
    		payableAmount = inputNumber + discountAmount;
    		System.out.println("The final payable amount is "+payableAmount);
    }
}
