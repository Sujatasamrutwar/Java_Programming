package Day2;

import java.util.Scanner;

public class scannerClass2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter +,-,*,/");
		String operator = sc.next();
		
		System.out.println("Enter 1st no");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd no");
		int num2 = sc.nextInt();
		
		System.out.println("===========");
         switch(operator) {
         case "+" : {
        	 System.out.println(num1+num2);
        	 break;
         }
         case "-": {
        	 System.out.println(num1-num2);
        	 break;
         }
         case "*" : {
        	 System.out.println(num1*num2);
        	 break;
         }
         case "/" : {
        	 System.out.println(num1/num2);
        	 break;
         }
         default :
         {
        	 System.out.println("ignore, leave it");
         }
         }
	}

}
