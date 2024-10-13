package Day3;

import java.util.Scanner;

public class prog_extractNumForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++)
		{int res = num%10;
		System.out.println(res);
		num=num/10;
		}
	}

}
