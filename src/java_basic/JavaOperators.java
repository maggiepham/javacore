package java_basic;

public class JavaOperators {
	
	/*
	 * Operator Types:
	 * Unary : postfix is expr++ , expr--  ; prefix is ++expr , --expr , -expr , ~ , !
	 * Arithmetic : mutiplicative is * , / , %  ; additive is + , -
	 * Shift : shift is << >> >>>
	 * Relational : comparision is < > , <= , >= , instanceof  ; equality is == , !=
	 * Bitwise : bitwise AND is & ; bitwise exlusive OR is ^  ; bitwise inclusive OR is |
	 * Logical : logical AND is &&  ; logical OR is ||  
	 * Ternary : ternary is ? , :
	 * Assignment : assignment is = , += , -= , *= , %= , &= , ^= , |= , <<= , >>= , >>>=
	 */
	
	/*
	 * AND Operator: Logical && and Bitwise &
	 * The logical && operator doesn't check the second condition if the first condition is false. It checks the second condition only if the first one is true.
	 * The bitwise & operator always checks both conditions whether first condition is true or false.
	 */
	
	/*
	 * The logical || operator doesn't check the second condition if the first condition is true. It checks the second condition only if the first one is false.
	 * The bitwise | operator always checks both conditions whether first condition is true or false.
	 */

	public static void main(String[] args) {
		
		// Unary Operator
		int x = 10;
		
		int a = 10;
		int b = 10;
		
		int c = 10;
		int d = -10;
		boolean e = true;
		boolean f = false;
		
		System.out.println(x++); // 10
		System.out.println(++x); // 12
		System.out.println(x--); // 12
		System.out.println(--x); // 10
		
		System.out.println(a++ + ++a); // 10 + 12 = 22
		System.out.println(b++ + b++); // 10 + 11 = 21
		
		System.out.println(~c); // -11 (minus of total positive value which starts from 0
		System.out.println(~d); // 9 (positive of total minus, positive starts from 0
		System.out.println(!e); // false (opposite of boolean value
		System.out.println(!f); // true
		
		// Arithmetic Operator
		int g=10;  
		int h=5;  
		System.out.println(g+h);//15  
		System.out.println(g-h);//5  
		System.out.println(g*h);//50  
		System.out.println(g/h);//2  
		System.out.println(g%h);//0  
		
		// Arithmetic Operator Expression
		System.out.println(10*10/5+3-1*4/2); // 21
		
		// Left Shift Operator
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  
		//For positive number, >> and >>> works same  
	    System.out.println(20>>2);  // 5
	    System.out.println(20>>>2); // 5
	    //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2); // -5
	    System.out.println(-20>>>2); // 1073741819 
		
		// Right Shift Operator
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  
		
		// AND Operator: Logical && and Bitwise &
		int i=10;  
		int j=5;  
		int k=20;  
		System.out.println(i<j&&i<k);//false && true = false  
		System.out.println(i<j&i<k);//false & true = false  
		
		int l=10;  
		int m=5;  
		int n=20;  
		System.out.println(l<m&&l++<n);//false && true = false  
		System.out.println(l);//10 because second condition is not checked  
		System.out.println(l<m&l++<n);//false && true = false  
		System.out.println(l);//11 because second condition is checked 
		
		// OR Operator : Logical || and Bitwise |
		int a1=10;  
		int b1=5;  
		int c1=20;  
		System.out.println(a1>b1||a1<c1);//true || true = true  
		System.out.println(a1>b1|a1<c1);//true | true = true  
		//|| vs |  
		System.out.println(a1>b1||a1++<c1);//true || true = true  
		System.out.println(a1);//10 because second condition is not checked  
		System.out.println(a1>b1|a1++<c1);//true | true = true  
		System.out.println(a1);//11 because second condition is checked  
		
		// Ternary Operator: Java Ternary operator is used as one line replacement for if-then-else statement
		int a2=2;  
		int b2=5;  
		int min=(a2<b2)?a2:b2;  
//		int min=(a2>b2)?a2:b2;  
		System.out.println("Ternary operator: " + min);
		
		System.out.println("====Assignment Operator====");
		int assignOne=10;  
		int assignTwo=20;  
		int assignThree = 17;
		assignOne+=4;//assignOne=assignOne+4 (assignOne=10+4)  
		assignTwo-=4;//assignTwo=assignTwo-4 (assignTwo=20-4)  
		assignThree %= 3;
		System.out.println(assignOne);  
		System.out.println(assignTwo); 
		System.out.println("%= is " + assignThree);
		
		int aFirst=10;  
		aFirst+=3;//10+3  
		System.out.println(aFirst);  
		aFirst-=4;//13-4  
		System.out.println(aFirst);  
		aFirst*=2;//9*2  
		System.out.println(aFirst);  
		aFirst/=2;//18/2  
		System.out.println(aFirst);  
		
		// Assignment Operator : Adding short
		short addShortOne=10;  
		short addShortTwo=10;  
		//addShortOnea += addShortTwo;//addShortOne = addShortOne+addShortTwo internally so fine  
		//addShortOne=addShortOne+addShortTwo;//Compile time error because 10+10=20 now int  
		
		addShortOne=(short)(addShortOne + addShortTwo);//20 which is int now converted to short  
		System.out.println(addShortOne);  
	}

}
