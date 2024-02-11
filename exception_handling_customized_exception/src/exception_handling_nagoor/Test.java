package exception_handling_nagoor;

public class Test {

	public static void main(String[] args) {
		Account acc1 = new Account("abc111", "Durga", "Saving", 10000);
		Transaction tx1 = new Transaction();
		tx1.withdraw(acc1, 5000);
		
		Account acc2 = new Account("abc222", "Durga", "Saving", 10000);
		Transaction tx2 = new Transaction();
		tx1.withdraw(acc1, 15000);
	}
	
}
