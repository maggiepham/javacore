package java_basic;

public class Continue_Statement {

	public static void main(String[] args) {
		
		System.out.println("=====Continue inside loop=======");
		for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				continue; // skip the rest statement
			}
			System.out.println(i);
		}
		
		System.out.println("=====Continue inside an inner loop=======");
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				if(i == 2 && j == 2) {
					continue;
				}
				System.out.println(i + " " + j);
			}
		}
		
		System.out.println("=====with label inside an inner loop to Continue outer loop=======");
		aa:
			for(int i = 1; i <= 3; i++) {
				bb:
					for(int j = 1; j <= 3; j++) {
						if(i == 2 && j == 2) {
							continue aa;
						}
						System.out.println(i + " " + j);
					}
			}
		
		System.out.println("=====Continue statement in while loop=======");
		int k = 1;
		while(k <= 10) {
			if(k == 5) {
				k++;
				continue;
			}
			System.out.println(k);
			k++;
		}
		
		
		System.out.println("=====Continue statement in do while loop=======");
		int dw = 1;
		do {
			if(dw == 5) {
				dw++;
				continue;
			}
			System.out.println(dw);
			dw++;;
		} while(dw <= 10);
		
	}

}
