package Day3;

import java.util.Scanner;

public class prog_extractNumDoWhile {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value");
	int num = sc.nextInt();
	
	do {
		int res = num % 10;
		System.out.println(res);
		num=num/10;
	}
	while(num>0);
	}

}
