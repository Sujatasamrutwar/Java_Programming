package Day1;

public class java12_switchcase3 {

	public static void main(String[] args) {
		String operator = "*";
		int num1 = 10;
		int num2 = 5;
		
		switch(operator) {
		case "+" : {
			System.out.println(num1+num2);
			break;
		}
		
		case "-" :{
			System.out.println(num1-num2);
			break;
		}
		case"*" : {
			System.out.println(num1*num2);
			//break;
		}
		case"/" :{
			System.out.println(num1/num2);
			break;
		}
			default : {
				System.out.println("Out of range");
			}
			
		}
	}

}
