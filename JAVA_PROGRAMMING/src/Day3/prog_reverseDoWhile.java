package Day3;

import java.util.Scanner;

public class prog_reverseDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		int rev = 0;
		
		do {
			int rem = num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		while(num>0); 
			System.out.println(rev);
	}

}
