package testpackage;

	public class Dog {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int largest = arr[0];

	        for (int num : arr) {
	            if (num > largest) {
	                largest = num;
	            }
	        }

	        System.out.println("Largest number: " + largest);
	    }
	}