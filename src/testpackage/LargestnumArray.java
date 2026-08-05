package testpackage;

import java.util.*;

public class LargestnumArray {
   
	public static void main (String[] args) {
	
	int number[] = {3,7,9,12,34};
	
	int largestnum = number[0];
	
	for (int i=0; i<=4; i++) {
		if(number[i] >largestnum) largestnum = number[i];
	}

System.out.println("Largets number is:" +largestnum);
}
}
