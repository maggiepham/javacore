package java_objects_classes;

public class InitializationThroughMethodClass {
	/*
	 * Stack memory: myClass1, myClass2
	 * Heap memory: id = 222; name = Aryan || id = 111; name = Karan
	 */

	public static void main(String[] args) {
		
		// Initialization through method
		JavaClassOne myClass1 = new JavaClassOne();
		JavaClassOne myClass2 = new JavaClassOne();
		
		myClass1.insertRecord(111, "Karan");
		myClass2.insertRecord(222, "Aryan");
		
		myClass1.displayInformation();
		myClass2.displayInformation();
	}

}
