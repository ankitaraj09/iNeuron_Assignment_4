package Assignment_4;

import java.util.Scanner;

//WAP to find the maximum occurring character in a String.



public class Q8_MaxOccurringCharacter {

	 
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the String: ");
	        String input = scan.nextLine();

	        char maxChar = '\0';
	        int maxCount = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            int count = 1;

	            for (int j = i + 1; j < input.length(); j++) {
	                if (currentChar == input.charAt(j)) {
	                    count++;
	                }
	            }

	            if (count > maxCount) {
	                maxCount = count;
	                maxChar = currentChar;
	            }
	        }

	        System.out.println("Maximum occurring character in the string: " + maxChar);
	    }
	}
