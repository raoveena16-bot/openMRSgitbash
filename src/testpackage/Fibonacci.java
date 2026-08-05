package testpackage;

import org.openqa.selenium.*;
import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 10;  int firstNum = 0;  int secondNum = 1;
		int nextNum;
		
		for(int i= 0; i<=n; i++) {
			System.out.print(firstNum + ", ");
			nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
			
		}
		
		
	}

}
