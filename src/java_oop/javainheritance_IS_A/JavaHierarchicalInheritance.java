package java_oop.javainheritance_IS_A;

public class JavaHierarchicalInheritance {
	
	/*
	 * When two or more classes inherits a single class, it's known as hierarchical inheritance
	 * Dog and Cat classes inherits the Animal class
	 */

	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		c.eat();
//		c.bark(); // Error
		
	}

}
