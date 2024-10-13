package Day2;

import java.util.Scanner;

public class doWhileLoop5_Pin {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("generate pin");
    int pin = sc.nextInt();
    
    int attempt =0;
    
    do {
    	System.out.println("enter pin");
        int newPin = sc.nextInt();
    	if(pin==newPin) {
    	System.out.println("login successful");
    	break;
    }
    else {
    	System.out.println("incorrect pin");
    }
    	attempt++;
	}
    while(attempt<3);
    {
    	if(attempt==3) {
    		System.out.println("try it later");
    	}
    }
	}

}
