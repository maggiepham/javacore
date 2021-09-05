package java_basic;

public class Java_String {

	public static void main(String[] args) {
		
		String txt = "Maggie String";
		System.out.println("The length of the txt string is: " + txt.length());
		System.out.println("The upper case of txt string is: " + txt.toUpperCase());
		System.out.println("The lower case of txt string is: " + txt.toLowerCase());
		System.out.println("The indexOf the text 'Maggie' in txt string is: " + txt.indexOf("Maggie"));
		
		String firstName = "Maggie ";
		String lastName = "Pham";
		System.out.println("The String Concatenation is: " + firstName + " " + lastName);
		System.out.println("Using concat() method to concatenate tweo string: " + firstName.concat(lastName));
		
		System.out.println("===Special Characters - using backslash===");
		String singleQuote = "It\'s alright.";
		String doubleQuote = "We are the so-called \"Vikings\" from the north";
		String singleBackslash = "The character \\ is called backslash.";
		String newLine = "New\nLine";
		String carriageReturn = "Carriage\rReturn";
		String tab = "Hello\tWorld!";
		String backSpace = "Ba\bck Space";
		String formFeed = "form\fFeed";
		
		System.out.println("Single quote in a String: " + singleQuote);
		System.out.println("Double quote in a String: " + doubleQuote);  
		System.out.println("Single backslash in a String: " + singleBackslash);
		System.out.println(newLine);
		System.out.println(carriageReturn);
		System.out.println(tab);
		System.out.println(backSpace);
		System.out.println(formFeed);
		
		int x = 10;
		int y = 20;
		System.out.println(x + y); // 30
		
		String xText = "10";
		String yText = "20";
		System.out.println(xText + yText); // 1020
		
		
	}

}
