package javalearning;

import java.util.ArrayList;

public class Learn {

	public static void main(String[] args) {
		 String name="ludia";
//		 System.out.print(name);
//	     System.out.println();
//	     name =   reverseString( name);
//	     System.out.print(name);
//	     System.out.println();
//	     //pyramid
//	     printNumberPyramid(6);
//	     //RemoveWhiteSpaces
//	     RemoveWhiteSpaces("hjh hjkhj hjhj hjhj jhj hjhj hj hj jhj");
	     duplicateCharCount("Better Butter");
	}

	private static void duplicateCharCount(String inputString) {
		char[] strArray = inputString.toCharArray();
		char[] duplicates = new char[strArray.length] ;
		ArrayList duplicate = new ArrayList<>() ;
		System.out.println(inputString);
		for(int i=0;i<strArray.length;i++) {
			if(duplicate.contains(strArray[i])) {
				System.out.println(strArray[i]);
				duplicate.add(strArray[i]);
				System.out.println(strArray[i]);
			}else {
				
			}
		}
		for (char c : strArray)  {
			if(duplicate.contains(c)) {

			}else {
				
			}
        }
	}

	private static void RemoveWhiteSpaces(String string) {
		string = string.replace(" " , "");
		System.out.println(string);
	}

	private static void printNumberPyramid(int n) {
		int i, j;
		for ( i=0;i<n ;i++) {//row
			 for (j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for (j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
		}
	}

	static String reverseString(String name) {
		String reverseName ="";
		 char[] nameArray =name.toCharArray();
	        System.out.print(nameArray.length);
	        System.out.println();
	        for(int i=nameArray.length-1;i >=0;i--){
	        	reverseName +=nameArray[i];
	        }
	       
			return reverseName;
	}
}
