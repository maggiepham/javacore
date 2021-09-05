package java_basic;

public class Java_Math {

	public static void main(String[] args) {
		
		System.out.println("Math.max(x, y) : " + Math.max(5, 10)); // 10
		System.out.println("Math min(x, y) : " + Math.min(5, 10)); // 5
		System.out.println("Math sqrt(x) : " + Math.sqrt(30));
		System.out.println("Math abs(x) : " + Math.abs(-4.7));
		
		int randomNum = (int)(Math.random() * 101); // 0 to 100
		System.out.println("Random number : " + randomNum);
	}

}
