package Day2;

import java.util.Scanner;

public class whileLoop9_pin {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your pin");
	int Pin = sc.nextInt();
	int attempt = 0;
	int count = 1;
	
	while(attempt<=3) {
		System.out.println("enter old pin");
		int oldPin = sc.nextInt();
		
		if(Pin==oldPin) {
			System.out.println("Login successful");
		}
		else{
        	System.out.println("Attempt "+ count + " of 3\n");
    	}
    	attempt++ ;
    	count++;
   	 
    	if (attempt == 3) {
    	//TODO-check 3 attempts and can't log in attempt reach message.
            System.out.println("LogIn Reached out please try again after 30 minutes. ");
    	}

	}
 
	}

}
