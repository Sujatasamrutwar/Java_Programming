package Day2;

import java.util.Scanner;

public class scannerClass1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Arithmetic Operator:- (+, -, *, /)");
        String operator = sc.next();
        
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        
        System.out.println(num1+num2);
	}

}
