package Assignment_4;

import java.util.Scanner;

//WAP to count the number of consonants, vowels, special characters in a String.



public class Q4_CountConVowSpe {


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the string: ");
	        String input = scan.nextLine();

	        int vowelCount = 0;
	        int consCount = 0;
	        int specialCharCount = 0;

	        String vowels = "aeiouAEIOU";
	        String alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);

	            if (Character.isLetter(currentChar)) {
	                if (vowels.indexOf(currentChar) != -1) {
	                    vowelCount++;
	                } else if (alphabets.indexOf(currentChar) != -1) {
	                    consCount++;
	                }
	            } else {
	                specialCharCount++;
	            }
	        }

	        System.out.println("Total number of consonants present in the string: " + consCount);
	        System.out.println("Total number of vowels present in the string: " + vowelCount);
	        System.out.println("Total number of special characters present in the string: " + specialCharCount);
	    }
	}
