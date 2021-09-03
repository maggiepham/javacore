package java_objects_classes;

public class InitializationThroughReferenceVariableClass {


	public static void main(String[] args) {
		JavaClassOne myObj = new JavaClassOne();
		
		// Initialization through reference variable
		myObj.id = 101;
		myObj.name = "Sonoo";
		System.out.println(myObj.id + " " + myObj.name);
	}

}
