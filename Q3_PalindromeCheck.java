package Assignment_4;

import java.util.Scanner;

//WAP to check if “2552” is palindrome or not.

public class Q3_PalindromeCheck {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String s1 = scan.nextLine();
		String s2 = "";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
		
		if(s1.equals(s2))
		{
			System.out.println("Yes, it is an palindrome...");
		}
		else
		{
			System.out.println("Nope, it is not an palindrome...");
		}


	}

}
