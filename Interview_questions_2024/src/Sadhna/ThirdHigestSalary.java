package Sadhna;

//get the third highest salary

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private String department;
	private int salary;

	public Employee(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

public class ThirdHigestSalary {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Name1", "D1", 500));
		employees.add(new Employee(2, "Name2", "D2", 1000));
		employees.add(new Employee(3, "Name3", "D1", 1500));
		employees.add(new Employee(6, "Name6", "D4", 3000));
		employees.add(new Employee(7, "Name7", "D1", 3500));
		employees.add(new Employee(4, "Name4", "D3", 2000));
		employees.add(new Employee(5, "Name5", "D2", 2500));
		
		
		List<Integer> listEmp=employees.stream().map(Employee::getSalary).collect(Collectors.toList());
		
		
		System.out.println(listEmp);
		
		   int[] arr = new int[listEmp.size()]; 
		   
	        // Converting ArrayList to Array 
	        // using get() method 
	        for (int i = 0; i < listEmp.size(); i++) 
	            arr[i] = listEmp.get(i); 
	  
	        // Printing elements of array on console 
	        for (int x : arr) 
	            System.out.print(x + " "); 
	        
	        
	       int thirdHigestSalary= Arrays.stream(arr)
	        .boxed()
	        .sorted(Comparator.reverseOrder())
	        .skip(2)
	        .findFirst()
	        .get();
	       System.out.println("Hello");
	       System.out.println(thirdHigestSalary);
	        
	    } 
		

		
		
	}

