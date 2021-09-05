package java_basic;

public class Java_Switch_Statement {
	
	/*
	 * switch statement executes one statement from multiple conditions
	 * switch expression must be of byte, short, int, long, enums, string
	 * 
	 */

	public static void main(String[] args) {
		
		int number = 5;
		
		switch(number) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		default:
			System.out.println("Not in 10, 20 or 30");
		}
		
		//=============================
		
		// Printing month name of the given number
		int month = 9;
		String monthString = "";
		
		switch(month) {
			case 1: 
				monthString = "1 - January";
				break;
			case 2:
				monthString = "2 - February";
				break;
			case 3:
				monthString = "3 - March";
				break;
			case 4:
				monthString = "4 - April";
				break;
			case 5:
				monthString = "5 - May";
				break;
			case 6:
				monthString = "6 - June";
				break;
			case 7:
				monthString = "7 - July";
				break;
			case 8:
				monthString = "8 - August";
				break;
			case 9:
				monthString = "9 - September";
				break;
			case 10:
				monthString = "10 - October";
				break;
			case 11:
				monthString = "11 - November";
				break;
			case 12:
				monthString = "12 - December";
				break;
			default:
				System.out.println("Invalid Month!");
		}
		
		// Printing month of the given number
		System.out.println(monthString);
		
		//====================================
		
		// Check Vowel or Consonant. It is not case-sensitive
		char ch = 'U';
		switch(ch) {
			case 'a':
				System.out.println("Vowel a");
				break;
			case 'e':
				System.out.println("Vowel e");
				break;
			case 'i':
				System.out.println("Vowel i");
				break;
			case 'o':
				System.out.println("Vowel o");
				break;
			case 'u':
				System.out.println("Vowel u");
				break;
			case 'A':
				System.out.println("Vowel A");
				break;
			case 'E':
				System.out.println("Vowel E");
				break;
			case 'I':
				System.out.println("Vowel I");
				break;
			case 'O':
				System.out.println("Vowel O");
				break;
			case 'U':
				System.out.println("Vowel U");
				break;
			default:
				System.out.println("Consonant");
			
		}
		
		// Switch statement without break statement
		int numberNoBreak = 20;
		switch(numberNoBreak){
			case 10:
				System.out.println("10");
			case 20:
				System.out.println("20");
			case 30:
				System.out.println("30");
			default:
				System.out.println("Not in 10, 20 or 30");
		}
		
		// Switch statement with String
		String levelString = "Expert";
		int level = 0;
		
		switch(levelString) {
			case "Beginner":
				level = 1;
				break;
			case "Intermediate":
				level = 2;
				break;
			case "Expert":
				level = 3;
				break;
		}
		System.out.println("Your level is: " + level);
		
		
		// Nested Switch statement: use switch statement inside other switch statement
		char branch = 'C';
		int collegeYear = 4;
		switch(collegeYear) {
			case 1:
				System.out.println("English, Maths, Science");
				break;
			case 2:
				switch(branch) {
					case 'C':
						System.out.println("Operating System, Java, Data Structure");
						break;
					case 'E':
						System.out.println("Micro processors, Logic switching theory");
						break;
					case 'M':
						System.out.println("Drawing, Manufacturing Machines");
						break;
				}
				break;
			case 3:
				switch(branch) {
					case 'C':
						System.out.println("Computer Organization, MultiMedia");
						break;
					case 'E':
						System.out.println("Fundamentals of Logic Design, Microelectronics");
						break;
					case 'M':
						System.out.println("Internal Combustion Engines, Mechanical Vibration");
						break;
				}
				break;
			case 4:
				switch(branch) {
					case 'C':
						System.out.println("Data Communication and Networks, MultiMedia");
						break;
					case 'E':
						System.out.println("Embedded System, Image Processing");
						break;
					case 'M':
						System.out.println("Production Technology, Thermal Engineering");
						break;
				}
				break;
		}
		
		// Enum in switch statement
		Day[] DayNow = Day.values();
		
		for(Day Now : DayNow) {
			switch(Now) {
				case Sun:
					System.out.println("Sunday");
					break;
				case Mon:
					System.out.println("Monday");
					break;
				case Tue:
					System.out.println("Tuesday");
					break;
				case Wed:
					System.out.println("Wednesday");
					break;
				case Thu:
					System.out.println("Thursday");
					break;
				case Fri:
					System.out.println("Friday");
					break;
				case Sat:
					System.out.println("Saturday");
					break;
			}
		}
		
		// Wrapper classes: Byte, Short, Integer, Long in switch statement
	
		Integer age = 18;
		switch(age) {
			case(16):
				System.out.println("You are under 18");
				break;
			case(18):
				System.out.println("You are eligible for vote");
				break;
			case(65):
				System.out.println("You are senior citizen");
				break;
			default:
				System.out.println("Please give the valid age");
				break;
			
		}
		
		
	}
	
	public enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat}

}
