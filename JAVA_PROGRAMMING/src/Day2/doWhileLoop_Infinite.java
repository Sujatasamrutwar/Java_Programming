package Day2;

import java.util.Scanner;

public class doWhileLoop_Infinite {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
     int num = sc.nextInt();
     
     do {
    	 System.out.println("infinite");
    	 num++;
     }
     while(true);
	}

}
