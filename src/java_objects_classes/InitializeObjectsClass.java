package java_objects_classes;

public class InitializeObjectsClass {

	public static void main(String[] args) {
		// Create multiple objects and store information in it through reference variable
		
		// Create objects
		JavaClassOne myClass1 = new JavaClassOne();
		JavaClassOne myClass2 = new JavaClassOne();
		
		// Initialize Objects
		myClass1.id = 101;
		myClass1.name = "Maggie";
		myClass2.id = 102;
		myClass2.name = "Tony";
		
		System.out.println(myClass1.id + " " + myClass1.name);
		System.out.println(myClass2.id + " " + myClass2.name);
	}

}
