package Day2;

import java.util.Scanner;

public class doWhileLoop_EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int first = sc.nextInt();
		
		System.out.println("Enter the last number");
        int last = sc.nextInt();
        
        
        do {
        	if(first%2==0)
        	System.out.println("Even number "+ first);
        	first++;
        }
        while(first<=last);
	}
}
