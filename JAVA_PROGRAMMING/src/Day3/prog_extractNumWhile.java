package Day3;

import java.util.Scanner;

public class prog_extractNumWhile {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in); 
       
        System.out.println("Enter number to extract: ");
        long extract = read.nextInt();
        
        while (extract >=0) {
                 
            long reminder = extract % 10;
                                 //5
            System.out.println(reminder);
            
            extract = extract/10;
        }
    }
}
