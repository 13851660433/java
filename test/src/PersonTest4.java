package test;

import java.util.Vector;

class Person{
	private String name = "John";
	public String getName() {return name;}
	public void setName(String n) {name = n;}
}

class Employee extends Person{
	private int employeeNumber;
	public int getEmployeeNumber() {return employeeNumber;}
	public void setEmployeeNmuber(int number) {employeeNumber = number;}
}

class Manager extends Employee{
	public Vector<String> responsibilities;
	public Vector<String> getResponsibilities(){return responsibilities;}
}

public class PersonTest4 {
	public static void main(String[] args) {
//		Employee jim = new Manager();
//		jim.setName("jim");
//		Manager unknown = (Manager)jim;
		Manager unknown = new Manager();
		unknown.setName("zhoucong");
		unknown.setEmployeeNmuber(543469);
		unknown.responsibilities = new Vector <String>();
		unknown.responsibilities.add("Internet ");
		unknown.responsibilities.add("Internet 1");
//		System.out.println(jim.getName());
//		System.out.println(jim.getEmployeeNumber());
		System.out.println(unknown.getName());
		System.out.println(unknown.getEmployeeNumber());
		System.out.println(unknown.getResponsibilities());
	}

}
