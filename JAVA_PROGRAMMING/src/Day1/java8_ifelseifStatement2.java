package Day1;

public class java8_ifelseifStatement2 {

	public static void main(String[] args) {
		 int age = 22;;
	       
	        if (age >0 && age <= 1){
	            System.out.println("Your age is "+ age +" you are Infant.");
	        }
	        else if(age >=1 && age <= 3){
	            System.out.println("Your age is "+ age +" you are Toddler.");
	        }
	        else if(age >= 3 && age <= 5){
	            System.out.println("Your age is "+ age +" you are Preschool");
	        }
	        else if(age >= 5 && age <= 12){
	            System.out.println("Your age is"+ age +" you are boy/girl");
	        }
	        else if(age >= 12 && age <= 19){
	            System.out.println("Your age is "+ age +" you are Adolescent/Teenager");
	        }
	        else if(age >= 19 && age <= 36){
	            System.out.println("Your age is "+ age +", you are adult");
	        }
	        else if(age >= 36 && age <= 85){
	            System.out.println("Your age is "+ age +" you are old person");
	        }
	        else{
	            System.out.println("You're too old because human life expectancy is 85 years old! Or "+ age +"years is Invalid age group");
	        }


	}

}
