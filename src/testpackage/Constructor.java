package testpackage;

public class Constructor {
	String name;
	
	Constructor() {
		name = "Vishnu";
		
		
	}
	
	public static void main (String[] args) {
		Constructor c = new Constructor();
		System.out.println(c.name);
	}

}


