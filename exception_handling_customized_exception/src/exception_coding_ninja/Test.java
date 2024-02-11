package exception_coding_ninja;

public class Test {
	public static void main(String[] args) {
           int age = Integer.parseInt(args[0]);
           if(age>60) {
        	   throw new TooYoungException("You have crossed your age less chance of getting marry");
           }else if(age<18){
        	   throw new TooOldException("Please wait");
           }else {
        	   System.out.println("No chance of getting marry");
           }

	}

}
