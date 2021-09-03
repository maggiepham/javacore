package java_objects_classes;

/*
 * Class is an object contractor / group of objects which have common properties, or "blueprint" for creating objects
 * A class in Java can contain: Fields, Methods, Constructors, Blocks, Nested class and interface
 * final class does not inherit by other classes 
 */


public class JavaClassOne {
	// instance variable
	int x;
	int rollno;
	
	int id;
	String name;
	float salary;
	
	int length;
	int width;
	
	
	void fact(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial is " + fact);
	}
	
	
	
	void insertRectangle(int l, int w) {
		length = l;
		width = w;
	}
	
	void calculateArea() {
		System.out.println(length * width);
	}
	
	void insert(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
	
	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}
	
	void displayInformation() {
		System.out.println(rollno + " " + name);
	}
	
	
	// Constructor for class
	public JavaClassOne() {
		x = 5;
	}

	public void myMethod() {
		System.out.println("Hello World!");
	}
	
	
}
