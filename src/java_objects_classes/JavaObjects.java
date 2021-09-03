package java_objects_classes;

public class JavaObjects{
	/*
	 * Java is an OOP language
	 * Everything in Java is associated with classed and objects, along with attributes and methods.
	 * 
	 * Object is an instance(result) of a class
	 * Characteristsics of Object: 
	 * - State: represents the data of an object
	 * - Behavior: represent of the behavior of an object
	 * - Identity: it's used internally by the JVM to identify each object uniquely.
	 * Ex: Object Pen has name mypen, state = color is white || behavior : write
	 */
	
	/*
	 * Initialize object:
	 * - By reference variable
	 * - By method
	 * - By constructor
	 */
	
	public static void main(String[] args) {
		JavaClassOne myObj = new JavaClassOne();
		System.out.println(myObj.x);
		myObj.myMethod();
		
	}

}
