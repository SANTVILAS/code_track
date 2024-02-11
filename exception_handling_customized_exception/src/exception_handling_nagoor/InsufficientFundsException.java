package exception_handling_nagoor;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String exception_Description){
		super(exception_Description);
	}
}
