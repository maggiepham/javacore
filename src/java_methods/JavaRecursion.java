package java_methods;

/*
 * Recursion (De quy)
 * Recursion is the technique of making a function call itself
 * It breaks complicated problems down into simple problems which are easier to solve
 * 10 + sum(9)
 * 10 + (9 + sum(8))
 * 10 + (8 + sum(7))
 * ....
 * 10 + (1 + sum(0)) 
 * 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
 */

/*
 * Halting Condition (Dieu kien dung)
 * Every recursive function should have a halting condition, which is the condition where the fuction stops calling itself
 * In sum() function, the halting condition is k = 0
 */

public class JavaRecursion {

	public static void main(String[] args) {
		// Recursion 
		int resultRecursion = sum(10);
		System.out.println("Recursion: " + resultRecursion);
		
		// Halting condition
		int resultHalting = sum(5, 10);
		System.out.println("Halting: " + resultHalting);
		
	}
	
	// Recursion 
	public static int sum(int k) {
		if (k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}
	
	// Halting condition
	// Add a range of numbers between a start and end. The halting condition for this recursive function is when end is not greater than start
	public static int sum(int start, int end) {
		if(end > start) {
			return end + sum(start, end - 1);
		}else {
			return end;
		}
		
	}

}

