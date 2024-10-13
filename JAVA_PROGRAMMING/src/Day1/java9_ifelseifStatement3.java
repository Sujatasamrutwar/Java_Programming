package Day1;

public class java9_ifelseifStatement3 {
	public static void main (String[] args) {
	   	 
    	String Signal = "red";
    	if (Signal == "red") {
        	System.out.println("stop the Vehicle's");
    	}
    	else if (Signal == "yellow") {
        	System.out.println("Wait and Go");
    	}
    	else if (Signal == "green") {
        	System.out.println("GO");
    	}
    	else {
        	System.out.println("System under maintenance");
    	}
   }

}
