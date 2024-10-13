package Day2;

import java.util.Scanner;

public class whileLoop8_EvenOdd2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter starting number");
		char ch1 = sc.next().charAt(0);
		System.out.println("enter ending numer");
		char ch2 = sc.next().charAt(0);
		
	while(ch1<=ch2) {
		if(ch1%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	
	ch1++;
	}
	}
}
