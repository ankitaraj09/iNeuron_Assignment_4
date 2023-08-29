package Assignment_4;

import java.util.Scanner;

//WAP to find if String contains all unique characters.



public class Q7_UniqueCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = scan.nextLine();
		
		 int i = 0;
		 int j = s1.length()-1;
		 boolean flag = true;

		 while(true) 
		 {
			 if(i == s1.length()-1)
				 break;
			 if(i != j && s1.charAt(i) == s1.charAt(j)) 
			 {
				 flag = false;
		            break;
		     }
			 else 
			 {
				 j--;
				 
				 if(j == 0) 
				 {
					 j = s1.length()-1;
		              i= i + 1;
		         }
		     }           
		 }
		 
		 if(flag)
		 {
			 System.out.println("Given String is Unique");
		 }
		 else
		 {
		     System.out.println("Given String is Not-Unique");
		 }
	}

}
