package testpackage;

import java.util.Arrays;

import java.lang.reflect.Array;

public class ArreayLargest {
	public static void main(String[] args) {
		int i;
		int [] numbers = {3, 56, 12, -6, 89, 9};
		int largest =numbers[0];
		
		for (i=0; i<=5; i++) {
		if (numbers[i]>largest) largest = numbers[i];

	}
	System.out.println(largest);
}
}
		


		
		
	
	
	


