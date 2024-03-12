package Task12;

public class Ans1_01 {

	private String name;
	private int id;
	private double salary;

	public Ans1_01(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void printName() {
		System.out.println("Employee name is : " + name);
	}

	public void printSalary() {
		System.out.println("Employee salary is : " + salary);
	}

	public void printid() {
		System.out.println("Employee id is : " + id);
	}

	}


