package com.bridgelabz.Day2Basics;

import java.util.Scanner;

public class VowelOrConstant {
	 public static void main(String[] args) {
         
	    	Scanner scanner = new Scanner(System.in); 
	    	System.out.println("Enter the character to check its vowel or consonant"); 
	    	char ch = scanner.next().charAt(0); 

	        switch (ch) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println(" Entered character is vowel");
	                break;
	            default:
	                System.out.println(" Entered character is consonant");
	        }
	    }
}
