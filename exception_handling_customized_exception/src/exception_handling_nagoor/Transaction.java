package exception_handling_nagoor;

public class Transaction {

	public void withdraw(Account acc, int wd_Amt) {
		try {
			System.out.println("Transaction Details");
			System.out.println("==============================");
			System.out.println("Transaction id  :T-111");
			System.out.println("Account Number" + acc.accNo);
			System.out.println("Account Name" + acc.accName);
			System.out.println("Account Type" + acc.accType);
			System.out.println("Transaction Type" + wd_Amt);
			if (acc.balance > wd_Amt) {
				acc.balance = acc.balance - wd_Amt;
				System.out.println("Total Balance " + acc.balance);
				System.out.println("Transaction Status SUCCESSFUL");

			} else {
				System.out.println("Total Balance " + acc.balance);
				System.out.println("Transaction Status FAILED");
				throw new InsufficientFundsException("My Own Exception Message==>Funds are not sufficient");
			}

		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("*********************Than Q , Visit again*****************");
		}
	}

}
