package parameterized_constructor;

public class Test {
	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1);

		Person p2 = new Person(111, "vilas");
		System.out.println(p2);
	}
}
