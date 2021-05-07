//to check if the first String contains the second one

import java.util.Scanner;

public class zadacha1 {

	public static void main(String[] args) {
				// index e -1 to make it invalid again  
		 int index = -1; // keeps the index of the first letter of s2 in s1
		 int count = 1; // keeps the number of matching letters between s1 and s2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter a string: ");
		String s2 = sc.nextLine(); 

		for (int i = 0; i < s1.length(); i++) {
			    if (s1.charAt(i) == s2.charAt(0) && count == 0) { // here we are at the beginning of s2
			    	index = i;
			    	count ++;  // checking until we find a match between the first of s2 and any letter of s1
			    } else if(s1.charAt(i) == s2.charAt(count)) {
			    	count ++; // if the current element of s1 matches the current element s2 aka the next one
			    } else if (count != 0) {
			    	count = 0;
			    	index = -1; // we start over
			    	i--; // check the element again in case there is a double letter /ss, ll, oo .../
			    }				// so that we don't miss it 
			    
			    if (count == s2.length()) {
			    	break; // we have gone through the whole s2 
			    }
		}
		
			    if (count != s2.length()) { // there is only part of s2 it there
			    	index = -1; 			// so it is still not valid
			    	count = 0; // here we check if it is the whole string
			    }
		
		
			    if (index > 1) 
			    	System.out.println("matched at index " + index);
			     else 
			     System.out.println("string2 is not a substring of string1");
			    
			   
	}
	}

		
	

// е On - for/red 18/ - linear
