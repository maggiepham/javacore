package java_objects_classes;

public class InitializationThroughAConstructorClass {
	
	//Initialization Through A Constructor Class

	public static void main(String[] args) {
		
		JavaClassOne myClassOne = new JavaClassOne();
		JavaClassOne myClassTwo = new JavaClassOne();
		JavaClassOne myClassThree = new JavaClassOne();
		
		myClassOne.insert(101, "Tommy", 45000);
		myClassTwo.insert(102, "Jeff", 25000);
		myClassThree.insert(103, "David", 55000);
		
		myClassOne.display();
		myClassTwo.display();
		myClassThree.display();
	}

}
