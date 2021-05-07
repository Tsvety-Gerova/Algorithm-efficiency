

import java.util.LinkedList;
import java.util.Scanner;

public class zadacha2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String string = sc.nextLine();
		
		LinkedList<Character> max = new LinkedList<>(); // empty list that 
										// will be filled with max list
		
		// creating a loop for every element so that we can compare the size and choose the biggest one
		for (int i = 0; i < string.length(); i ++) { // here we choose the first letter
			LinkedList<Character> list = new LinkedList<>();// keeps the current max
		    list.add(string.charAt(i)); // the first letter (that could be any of all elements depending on i) is being added to the list
		    for(int j = 0; j < string.length(); j ++) { // here we check each of the following letters
		    	if (string.charAt(j) > list.getLast()) { // we check if the letter's ascii code is more than the previous
		    		list.add(string.charAt(j));  // and if yes we add it to the list 
		    	}
		    }
		    
		    if (list.size() > max.size()) {
		    	max.clear(); // clear the max list
		    	max.addAll(list);// so that we can fill it with the new list
		    } // and then repeat again for the next 'first' letter
		    list.clear(); // move on to the next letter
		}
		
		System.out.println(max.toString());
		
	}

} // n*(n-1) + n*(n-2) + ... + n
//  = n*(n*n - n(n-1)/2)  
//  = n*n*(n - n/2 + 1/2) 
//  = n^2(n/2 + 1/2) 
//  = n^3 ?? weiss nicht lol 
