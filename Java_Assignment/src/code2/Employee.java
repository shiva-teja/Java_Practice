package code2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {


	int age;
	String name;
	int id;
	private static final AtomicInteger count = new AtomicInteger(0); 

	// 1) create a constructor with the argument as Name and Age, and Id should be auto-increment  
	public  Employee(String name, int age){
		this.id=count.incrementAndGet();
		this.name=name;
		this.age=age;

	}
	public static Comparator<Employee> EmployeeComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee e, Employee t) {
			return e.name.compareTo(t.name);
		}
	};

	public static void main(String[] args) {

		// 2) Create two objects, and check if they are equal by Age
		Employee emp=new Employee("Geet",26);
		Employee emp1=new Employee("Geet",2);
		System.out.println(emp.id);
		System.out.println(emp1.id);
		if(emp.age==emp1.age)
		{
			System.out.println("Ages are Equal");
		}
		else {
			System.out.println("Ages are Not Equal");
		}

		// 3) Create an Arraylist of Employee and add 7-8 records in it and sort that Arraylist collection by Name.
		ArrayList<Employee> arraylist = new ArrayList<Employee>();
		arraylist.add(new Employee("zharon",24));
		arraylist.add(new Employee("aam",23));
		arraylist.add(new Employee("weorge",25));
		arraylist.add(new Employee("haris",25));
		arraylist.add(new Employee("james",25));
		arraylist.add(new Employee("alan",25));
		arraylist.add(new Employee("walker",25));
		arraylist.add(new Employee("louis",25));
		arraylist.add(new Employee("specter",25));


		System.out.println("-------------Unsorted-------------");
		for(Employee s : arraylist) {
			System.out.println(s.name);
			System.out.println(s.id+" "+s.name);
		}

		Collections.sort(arraylist, Employee.EmployeeComparator);

		System.out.println("--------------Sorted---------------");
		for(Employee s : arraylist) {
			System.out.println(s.name);
			System.out.println(s.id+" "+s.name);
		}


		// 4) Convert above ArrayList to HashMap with Employee.Id as a Key.

		HashMap<Integer, String> empmap = new HashMap<Integer, String>();
		for (Employee e : arraylist) {
			empmap.put(e.id, e.name);
		}
		System.out.println(empmap);

		// 5) Remove all records from the Hashmap with below particular Age.
		for (Employee e : arraylist) {
			if(e.age==25)
			{
				empmap.remove(e.id);
			}
		}
		System.out.println(empmap);


	}
}