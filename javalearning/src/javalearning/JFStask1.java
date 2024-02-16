package javalearning;

import java.util.Scanner;

public class JFStask1 {
	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
//		System.out.println(inputObj.nextInt());
//		int inputNumber = inputObj.nextInt();
//		printUsingForLoop();
//		System.out.println();
//		printUsingWhileLoop();
//		System.out.println();
//		findPositiveorNegative(inputNumber);
//		System.out.println();
//		reverseGivenNumber(inputNumber);
//		System.out.println();
//		findSmallestNumber(inputObj);
//		System.out.println();
//		applyDiscount(inputNumber);
//		System.out.println();
		numberPattern();
	}

	private static void numberPattern() {
		 int size = 5;

	        // Print decreasing square pattern
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                System.out.print((size - Math.min(i, j)) + " ");
	            }
	            System.out.println();
	        }
		
	}

	private static void applyDiscount(int inputNumber) {
		if(inputNumber < 500) {
			System.out.println(inputNumber);
		}else if(inputNumber > 500 && inputNumber < 1000) {
			System.out.println(inputNumber +(inputNumber *0.1));
		}else if(inputNumber > 2000) {
			System.out.println(inputNumber +(inputNumber *0.2));
		}
	}

	private static void findSmallestNumber(Scanner inputObj) {
		int a = 0,b = 0,c =0,temp=0,temp2=0;
		a = inputObj.nextInt();
		b = inputObj.nextInt();
		c = inputObj.nextInt();
		temp = a < b ? a : b;
		temp2 = temp < c ?temp : c;
		System.out.println("The smallest number among the given number is"+temp2 );
		
	}

	private static void reverseGivenNumber(int inputNumber) {
		
	}

	private static void findPositiveorNegative(int inputNumber) {
		if(inputNumber >0) {
			System.out.println("The entered number ("+inputNumber+") is Positive ");
		}else if(inputNumber < 0) {
			System.out.println("The entered number ("+inputNumber+") is Negative ");
		}else {
			System.out.println("The entered number ("+inputNumber+") is Zero ");
		}
		
	}

	private static void printUsingWhileLoop() {
		int i =10;
		while(i<=50) {
			System.out.print(i+" ");
			i++;
		}
		
	}

	private static void printUsingForLoop() {
		for(int i=10;i <=50;i++) {
//			System.out.println(i);
			System.out.print(i+" ");
		}
	}

}