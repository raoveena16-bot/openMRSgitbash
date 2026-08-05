package testpackage;

public class Duplicate {
	public static void main (String[] args) {
	
	String s = "malayalam";
	int count = 0; 

	char[] c = s.toCharArray();
	
	
	for(int i=0; i<s.length(); i++ ) {
		for(int j=i+1; j<s.length(); j++) {
			if(c[i]==c[j]) {
				
				System.out.print(c[j]);
				count++;
				//System.out.println("The count is :" +count);
				break;
			}
		}
	}
			

}
}

