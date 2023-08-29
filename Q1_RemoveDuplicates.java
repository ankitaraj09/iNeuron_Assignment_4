package Assignment_4;

import java.util.Arrays;
import java.util.Scanner;


// WAP to remove Duplicates from a String.(Take any String ex with duplicates echaracter)

public class Q1_RemoveDuplicates {
	
	
	
	  public static void main(String[] args)
	    {
	    	Scanner scan = new Scanner(System.in);
			System.out.println("Enter the string: ");
			String s1 = scan.nextLine();
	    	char s2[] = s1.toCharArray();
	        int n = s2.length;
	        System.out.println( "Without duplicate string is: "+ removeDuplicate(s2, n));
	    }

	static String removeDuplicate(char s2[], int n)
    {
        int index = 0;
    
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (s2[i] == s2[j])
                {
                    break;
                }
            }
            
            if (j == i)
            {
                s2[index++] = s2[i];
            }
        }
        
        return String.valueOf(Arrays.copyOf(s2, index));
        
    }
 
  

}
