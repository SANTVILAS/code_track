package java8_lamda_expression_with_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	String name;
	int eno;
	public Employee(String name, int eno) {
		super();
		this.name = name;
		this.eno = eno;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eno=" + eno + "]";
	}
	
}
public class Sorting_Employee_With_Lamda {

	public static void main(String[] args) {
		ArrayList<Employee> l =new ArrayList<Employee>();
		l.add(new Employee("vilas", 40));
		l.add(new Employee("sant", 20));
		l.add(new Employee("keshari", 10));
		l.add(new Employee("Monu", 5));
		
		//sorting based on eno
		
		System.out.println(l);
		Comparator<Employee> c=(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0;
		Collections.sort(l,c);
		System.out.println(l);
		
		//sorting based on ename

		System.out.println(l);
		Comparator<Employee> c1=(e1,e2)->e1.name.compareTo(e2.name);
		Collections.sort(l,c1);
		System.out.println(l);
		
	}

}
