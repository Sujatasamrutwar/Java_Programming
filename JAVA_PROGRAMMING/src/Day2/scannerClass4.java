package Day2;

import java.util.Scanner;

public class scannerClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("WELCOME");
        System.out.println("WHAT DO YOU PREFER?");
        System.out.println("1.veg");
        System.out.println("2.Nonveg");
        int menu = sc.nextInt();
        
        switch (menu){
            case 1:
                {
                    System.out.println("1.Pulao................50 rs");
                    System.out.println("2.Paneer...............150 rs");
                    System.out.println("3.Kaju Katli............190 rs");
                    int VegMenu =sc.nextInt();
                    switch(VegMenu)
                    {
                        case 1:
                            {
                                System.out.println("How many quantity you want?: ");
                                int qty = sc.nextInt();
                                System.out.println("Cost of dish is "+ 50 * qty + " rs");
                                break;
                            }
                        case 2:
                            {
                                System.out.println("How many quantity you want?: ");
                                int qty = sc.nextInt();
                                System.out.println("Cost of dish is "+ 150 * qty + " rs");
                                break;
                            }
                        case 3:
                            {
                                System.out.println("How many quantity you want?: ");
                                int qty = sc.nextInt();
                                System.out.println("Cost of dish is "+ 190 * qty + " rs");
                                break;
                            }
                        default:
                            {
                                System.out.println("Not available at the moment");
                            }
                    }
                    break;
                }
            case 2:
                {
                    System.out.println("1.Chicken 65..............180 rs");
                    System.out.println("2.Chicken Biryani.........170 rs");
                    System.out.println("3.Chicken Handi...........190 rs");
                    int nonVegMenu = sc.nextInt();
                    switch(nonVegMenu)
                    {
                        case 1:
                        {
                            System.out.println("How many quantity you want?: ");
                            int qty = sc.nextInt();
                            System.out.println("Cost of dish is "+ 180 * qty + " rs");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("How many quantity you want?: ");
                            int qty = sc.nextInt();
                            System.out.println("Cost of dish is "+ 170 * qty + " rs");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("How many quantity you want?: ");
                            int qty = sc.nextInt();
                            System.out.println("Cost of dish is "+ 190 * qty + " rs");
                            break;
                        }
                        default:
                        {
                            System.out.println("Not available at the moment");
                        }
                    }
                    break;
                }
        }
    }
}
