package testpackage;

public class Reverse {

	public static void main(String[] args) {
		String name = "geek";
		String reversed = "";
		char ch;
		
		for(int i=0; i<name.length(); i++){
			ch = name.charAt(i);
			reversed = ch + reversed; 
		}
			
			System.out.println(reversed);     

		}
		
	}


	
	
	
