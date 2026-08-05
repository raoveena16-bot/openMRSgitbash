package testpackage;

public class Sorting {
	public static void main(String[] args) {
		int arr[] = {46, 9, 77, 23, 12};
		System.out.println("Original array: ");
		 for(int i=0; i<arr.length; i++) 
			System.out.print(arr[i] +" ");
	
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if (arr[j] < arr[i]) {
						int temp =0;

				 temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
				 
				 
		 }
	}

}
			System.out.println("\nSorted array: ");
			 for(int i=0; i<arr.length; i++) 
				System.out.print(arr[i] +" ");
		 }
}
