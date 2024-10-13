package Day1;

public class java6_ifelseStatement2 {

	public static void main(String[] args) {
	        char ch = 'a';
	        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
	     
	           if(ch == 'a' || ch == 'A' || ch =='e' || ch =='E' || ch =='i' || ch == 'I' || ch == 'o' || ch =='O' || ch =='u' || ch == 'U'){
	                System.out.println("'"+ch +"'" + " is a vowel");
	            }
	            else{
	                System.out.println("'"+ ch + "'" + " is a Consonants");
	            }
	        }
	            else {
	            	System.out.println("Invalid");
	            }

	}

}
