package javalearning;

import java.util.Scanner;

public class printUsingForLoop {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
//		System.out.println(inputObj.nextInt());
        for(int i=10;i <=50;i++) {
//			System.out.println(i);
			System.out.print(i+" ");
		}
    }
}