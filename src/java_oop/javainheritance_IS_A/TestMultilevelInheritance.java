package java_oop.javainheritance_IS_A;

class TestMultilevelInheritance {
	/*
	 * When there is a chain (chuoi) of inheritance, it's known as mutilevel inheritance
	 * BabyDog class inherits the Dog class which again inherits the Animal class
	 */
	

	public static void main(String[] args) {
		BabyDog bd = new BabyDog();
		bd.weep();
		bd.bark();
		bd.eat();
	}

}
