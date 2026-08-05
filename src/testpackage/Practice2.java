package testpackage;

public class Practice2 {
	public static void main (String [] args) {
		int[] numbers = {3, -1, 7, 0, 9};

		for (int n : numbers) {
		  if (n < 0) {
		    continue; // skip negative numbers
		  }
		  if (n == 0) {
		    break; // stop loop when zero is found
		  }
		  System.out.println(n);
		}
	}

	{

int[] numbers = {3,-6,8,10,3,-5,7};
for (int n : numbers) {
	if (n <0) {
		continue;
	}
	
	if (n == 0) {
		break;
	}
System.out.println(n);



}
}
}