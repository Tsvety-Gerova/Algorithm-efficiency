// to check if there are two numbers in an array whose sum equals the given number

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class zadacha1 {

	public static void main(String[] args) {
     
		int[] list = {-8, 1, 2, 3, 5, 7} ;
		int sum = -9;
		
		System.out.println(hasPair_HashSet(list, sum));
	}

	// checks every single pair
	public static boolean hasPair_BruteForce(int[] list, int sum) {
		// O(n^2)
		for (int i = 0; i < list.length; i++) { // goes through all of the elements
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] + list[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean hasPair_BinarySearch(int[] list, int sum) {
		// O(nlog(n))
		for (int i = 0; i < list.length; i++) {
			if (BinarySearch.binarySearch(list, sum - list[i]) > 0) {// returns -1 if false
		return true;
			}
		}
		return false;
		
	}
	
	
	// must be a sorted array
	public static boolean hasPair_FromBothEnds(int[] list, int sum) {
		// O(n)
		int lastIndex = list.length - 1;
		int firstIndex = 0;
		while (lastIndex > firstIndex) { // ne sa se razminali 
			int currentSum = list[lastIndex] + list[firstIndex];
			if (currentSum > sum) { // we compare the current Sum and the sum we are looking for
				lastIndex --;      // and decide where to 'cut' the list
			}else if(currentSum < sum) {
				firstIndex++;
			} else {
				return true;
			}
		}
		return false;
		
	}
	
	
	//works both with sorted and non-sorted arrays
	public static boolean hasPair_HashSet(int[] list, int sum) {
		// O(n)
		Set<Integer> rests = new HashSet<Integer> ();
		for (int i = 0; i < list.length; i++) { // does through every element
			if (rests.contains(list[i])) {  // and check if rests contains it
				return true;
			}
			
			rests.add(sum - list[i]); // add the other number of the pair that adds up to the sum
			// that way if later i find the other element i'll know that it can be paired 
		}
		return false;
		
	}
	
}
