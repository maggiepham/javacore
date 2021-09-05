package java_basic;

public class Java_Casting {

	public static void main(String[] args) {
		int myInt = 9;
		double myDouble = myInt; // automatic casting from int to double
		
		System.out.println(myInt);
		System.out.println(myDouble);
		
		System.out.println("======Narrowing casting");
		double myDoubleN = 9.78d;
		int myIntN = (int) myDoubleN; // manual casting from double to int
		
		System.out.println(myDoubleN);
		System.out.println(myIntN);
	}

}
