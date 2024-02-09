package java8_predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	String username;
	String pwd;
	
	public User(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", pwd=" + pwd + "]";
	}
	
	
	
}

public class User_Authentication_Predicate {
 public static void main(String[] args) {
		Predicate<User> p = u->u.username.equals("durga") && u.pwd.equals("java");
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the usrr name");
		String username=s.next();
		System.out.println("Enter the pwd");
		String pwd = s.next();
		User user = new User(username,pwd);
		if(p.test(user)) {
			System.out.println("Valid User");
		}else {
			System.out.println("Invalid User");
		}
		
	}

}
