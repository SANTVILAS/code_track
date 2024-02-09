package java8_predicate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}

public class Test {

	public static void main(String[] args) {

		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("santvilas", 5000));
		l.add(new Employee("Hanvilas", 3000));
		l.add(new Employee("Premvilas", 7000));
		l.add(new Employee("Monu", 1000));

		Predicate<Employee> p1 = e -> e.salary > 3000;
		for (Employee e1 : l) {
			if (p1.test(e1)) {
				System.out.println(e1.name + " " + e1.salary);
			}
		 }

	}

}
