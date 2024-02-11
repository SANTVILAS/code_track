package java8_function;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Function;

class Employee {

	String name;
	int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class Total_Salary_Of_Employee {
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();

		Function<ArrayList<Employee>, Double> f = l1 -> {

			double total = 0;
			for (Employee e1 : l1) {
				total = total + e1.salary;

			}
			return total;
		};

		Employee[] emp = { new Employee("Sunny", 1000), new Employee("Bunny", 2000), new Employee("Chinny", 3000),
				new Employee("Vinny", 5000)

		};
		

	}
}
