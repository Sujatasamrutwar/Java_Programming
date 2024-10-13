package Day1;

public class java13_switchcase4 {
	public static void main(String [] args){
        int operator = 2;
        int num1 = 150;
        int num2 = 110;
  
        switch(operator)
        {
            case 0+1:
                    System.out.println(num1+num2);
                    break;
                    
            case 1+1:
                   System.out.println(num1-num2);
                   break; 
                
            case 2+1:
                    System.out.println(num1*num2);
                    break;
            case 2+2:
            	System.out.println(num1/num2);
            break;
    default:
        System.out.println("Out of Range");
}
	}

}
