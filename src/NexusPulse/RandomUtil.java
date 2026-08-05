package NexusPulse;

import java.util.Random;

public class RandomUtil {

	public static void main(String[] args) {
		
		 randomString("To Meet Doctor");
		 randomString("To Meet Doctor");
		 randomString("To Meet Doctor");
		 randomString("To Meet Doctor");
		 randomString("To Meet Doctor");
		 randomString("To Meet Doctor");
		 randomString("To Meet Doctor");
		
		
	}
	
	
	public static String randomString(String fixedString)
	{
		
		Random rand = new Random();
		int randomDigit = 100+rand.nextInt(100)+1;
		
		int lBound = 65,uBound=90;
		char randomUCase = (char)(lBound+rand.nextInt(uBound-lBound)+1) ;
	 
		
		lBound = 97;uBound=122;
		char randomLCase = (char)(lBound+rand.nextInt(uBound-lBound)+1) ;
		
		String uniqueReason = fixedString +randomDigit +randomUCase+randomLCase;
		System.out.println(uniqueReason);
		
		return uniqueReason;
	}
}

