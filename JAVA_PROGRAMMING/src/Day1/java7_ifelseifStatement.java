package Day1;

public class java7_ifelseifStatement {

	public static void main(String[] args) {
double per = 67.64;
        
        if (per == 35){
            System.out.println("Failed but Don’t Lose hopes");
        }
        else if(per > 0 && per < 35){
            System.out.println("Failed! Also I in 1st programming.");
        }
        else if(per > 35 && per <= 60){
            System.out.println("Second class");
        }
        else if(per > 60 && per <= 75){
            System.out.println("First class");
        }
        else if(per > 75 && per <= 100){
            System.out.println("Congratulations! First class with Distinction!");
        }
        else{
            System.out.println("Invalid Character!");
        }
    }


	}

