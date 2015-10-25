package mixin;

public class Main {
	public static void main(String[] args) {
		printSalary(new GarbageCollector());
		printSalary(new Manager());
	}
	
	public static void printSalary(Employee employee){
		System.out.println(employee.getClass().getName());
		System.out.println(employee.getSalary());
		System.out.println(employee.getClearSalary());	
		System.out.println();
	}
}
