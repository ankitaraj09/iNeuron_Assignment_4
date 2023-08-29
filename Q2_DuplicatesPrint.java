package Assignment_4;

import java.util.Scanner;

//WAP to print Duplicates characters from the String.



public class Q2_DuplicatesPrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = scan.nextLine();
		int n = s1.length();
		
		for(int i=0; i<s1.length()-1; i++)
		{
			for(int j=i+1; j<s1.length(); j++)
			{
				if(s1.charAt(i) == s1.charAt(j))
				{
					System.out.println("These are the duplicate charater in the string: " + s1.charAt(j));
					break;
				}
			}
		}

	}

}