package testpackage;

public class Swapnumbers {
	
	public static void main (String[] args) {
		int n1 = 10;
		int n2 = 20;
		int temp;
		
		System.out.println("Before swap "+ n1 + "," + n2);
		
		temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("After swap "+ n1 + "," + n2);
		
	}

}
