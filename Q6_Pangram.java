package Assignment_4;

import java.util.Scanner;

//WAP to implement Pangram Checking with least inbuilt methods being used.

/*A pangram is a sentence or phrase that contains every letter of the alphabet at least once. Pangrams are also known as holoalphabetic sentences or alphabet sentences. 
 *  The goal of a pangram is to showcase all the letters of the alphabet in a single sentence, making it a useful tool for testing fonts, keyboards, and other text-related applications.

    "The quick brown fox jumps over a lazy dog."
    "Pack my box with five dozen liquor jugs."
    "Mr Jock, TV quiz PhD, bags few lynx." */




public class Q6_Pangram {

static int size = 26;  
	
	static boolean isLetter(char ch)  
	{  
		if (!Character.isLetter(ch))  
			
			return false;  
	
	    return true;  
	}  
	
	static boolean containsAllLetters(String s1, int len)  
	{
		s1 = s1.toLowerCase();  
		
		boolean[] present = new boolean[size];  
		
		for (int i = 0; i < len; i++)   
	    {  
			if (isLetter(s1.charAt(i)))   
	        {  
				int letter = s1.charAt(i) - 'a';  
				present[letter] = true;  
	        }  
	    }  
		
		for (int i = 0; i < size; i++)  
		{  
			if (!present[i])  
				
				return false;  
	    }  
		return true;  
	}  
	
	public static void main(String args[])  
	{  
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = scan.nextLine();
		
		int len = s1.length();  
	 
	    if (containsAllLetters(s1, len))
	    {
	    	System.out.println("The given string is a pangram string.");  
	    }
	    
	    else  
	    {	
	    	System.out.println("The given string is not a pangram string.");  
	    }
	} 

}
