package Assignment_4;

import java.util.Scanner;

//WAP to implement Anagram Checking least inbuilt methods being used.


/*if two words or phrases are anagrams of each other, they have the same characters but in a different order.

For example:

    "listen" and "silent" are anagrams of each other.
    "debit card" and "bad credit" are anagrams of each other.
    "astronomer" and "moon starer" are anagrams of each other.*/




public class Q5_AnagramChecking {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the First String : ");
		String s1 = scanner.nextLine();
		System.out.print("Enter the Second String : ");
		String s2 = scanner.nextLine();

		if (checkAnagram(s1, s2))
			System.out.println(s1 + " and " + s2 + " is an Anagrams");
		else
			System.out.println(s1 + " and " + s2 + " is not an Anagrams");
	}

	public static boolean checkAnagram(String s1, String s2)
	{
		
		if (s1.length() != s2.length())
			return false;
		else
		{
			for (int i = 0; i < s1.length(); i++)
			{
				for (int j = 0; j < s2.length(); j++)
				{
					if (s1.charAt(i) == s2.charAt(j))
					{
						s2 = s2.substring(0, j) + s2.substring(j + 1);
						break;
					}
				}
			}

			if (s2.length() == 0)
			{
				return true;
			} 
			else
			{
				return false;
			}
		}
		

	}

}