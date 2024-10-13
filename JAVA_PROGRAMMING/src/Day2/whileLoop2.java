package Day2;

import java.util.Scanner;

public class whileLoop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something");
		String sentence = sc.next();
		System.out.println("How many time loop will be iterate");
		int times = sc.nextInt();
		
		int start = 0;
		while(start < times) {
			System.out.print(start + 1 + " ");
			//System.out.println(" ");
            System.out.println(sentence);
            start++;

		}
		
	}

}
