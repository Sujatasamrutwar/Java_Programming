package Day2;

import java.util.Scanner;

public class whileLoop7_EvenOdd1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter starting number");
		int num1 = sc.nextInt();
		System.out.println("enter ending numer");
		int num2 = sc.nextInt();
		
	while(num1<=num2) {
		if(num1%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	
	num1++;
	}
	}
}
