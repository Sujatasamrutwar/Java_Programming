package Day1;

public class java11_switchcase2 {

	public static void main(String[] args) {
		String welcome = "Hiiii";
		switch(welcome) {
		case "Hiiii" : {
			System.out.println("from case1");
	break;                                       //from case1
	                                             //without break statement - from case1
	                                             //                          from case2
	                                             //                           out of range
		}
		case "Helloo" : {
			System.out.println("from case2");
		}
	 default : {
			System.out.println("out of range");
		}
		
		}
	}

}
