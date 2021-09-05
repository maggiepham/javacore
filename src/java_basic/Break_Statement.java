package java_basic;

public class Break_Statement {

	/*
	 * break statement is used to break loop, while, do while or switch statement.
	 * It breaks the current flow of the condition
	 */
	public static void main(String[] args) {
		
		System.out.println("=======using for loop=======");
		for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		
		System.out.println("=======inside loop=======");
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				if(i == 1 && j == 2) {
					break;
				}
				System.out.println(i + " " + j);
			}
		}
		
		
		System.out.println("=============Labeled for loop ===========");
		aa:
			for(int i = 1; i <= 3; i++) {
				bb:
					for(int j = 1; j <= 3; j++) {
						if(i == 2 && j == 2) {
							break bb;
						}
						System.out.println(i + " " + j);
					}
			}
		
		System.out.println("=============break statement using while loop ===========");
		int i = 1;
		while(i <= 10) {
			if(i == 5) {
				i++;
				break; // will break the loop
			}
			System.out.println(i);
			i++;
		}
		
		System.out.println("=============break statement using while loop ===========");
		int j = 1;
		do {
			if(j == 5) {
				j++;
				break;
			}
			System.out.println(j);
			j++;
		}
		while(j <= 10);
	}

}
