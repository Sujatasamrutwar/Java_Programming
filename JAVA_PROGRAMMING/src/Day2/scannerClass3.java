package Day2;

import java.util.Scanner;

public class scannerClass3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("WELCOME");
	System.out.println("What do you want?");
	System.out.println("Veg or Non-veg");
	int menu = sc.nextInt();
	
	switch(menu) {
	case 1 : {
		System.out.println("Paneer");
		System.out.println("Mushroom");
		int vegMenu  = sc.nextInt();
		{
			switch(vegMenu) {
			case 1 :
			{
				System.out.println("quantity");
				int quantity = sc.nextInt(); 
				System.out.println("cost = 200");
				break;
			}
			case 2 :
			{
				System.out.println("quantity");
				int quantity = sc.nextInt(); 
				System.out.println("cost = 400");
				break;
			}
			
			}
		}
		break;
	}
	case 2 : {
		System.out.println("Chicken");
		System.out.println("Fish");
		break;
	}
	default : {
		System.out.println("will try new dish");
	}
	
	}
}
}
