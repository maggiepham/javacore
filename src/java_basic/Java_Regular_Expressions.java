package java_basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
 * public boolean lookingAt() - Attempts to match the input sequence, starting at the begining of the region, against the pattern
 * public boolean find() - find the next subsequence of the input sequence that matches the pattern
 * public boolean find (int start) - reset the matcher and then attempts to find the next subsequence of the input sequence that matches the pattern, starting at the specified index
 * public boolean matches() - match the entire against the pattern
 * public Matcher appendReplacement(StringBuffer sb, String replacement) - implements a non-terminal append-and-replace step
 * public StringBuffer appendTail(StringBuffer sb) - implements a terminal append-and-replace step
 * public String replaeAll(String replacement) - replaces every subsequence of the input sequence that matches the patterns with the given replacement string
 * public String replaceFirst(String replacement) -  replaces the first subsequence of the input sequence that matches the pattern with the given replacement string
 * public static String quoteReplacement(String s) - returns a literal replacement String for the specified String. 
 * 
 * public String getDescription() - retrieves the description of the error
 * public int getIndex() - retrieves the error index
 * public String getPattern() - retrieves the erroneous regular expression pattern
 * public String getMessage() - returns a multi-line string containing the description of the syntax error and its index, the erroneous regular expression pattern, and a visual indication of the error index within the pattern
 * 
 */

public class Java_Regular_Expressions {
	
	private static final String REGEX = "\\bcat\\b";
	private static final String INPUT = "cat cat cat cattie cat";
	private static final String REGEX1 = "foo";
	private static final String INPUT1 = "fooooooooooo";
	private static Pattern pattern1;
	private static Matcher matcher1;
	
	private static String REGEX2 = "dog";
	private static String INPUT2 = "The dog says meow. " + "All dogs say meow.";
	private static String REPLACE = "cat";
	
	private static String REGEX3 = "a*b";
	private static String INPUT3 = "aabfooaabfooabfoob";
	private static String REPLACE3 = "-";
	

	public static void main(String[] args) {
		
		/* Find a digit string from the given alphanumeric string */
		
	// String to be scanned to find the pattern
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";
		
		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);
		
		// Create matcher object
		Matcher m = r.matcher(line);
		if(m.find()) {
			System.out.println("Found value: " + m.group(0));
			System.out.println("Found value: " + m.group(1));
			System.out.println("Found value: " + m.group(2));
		} else {
			System.out.println("NO MATCH");
		}
		
		
		/* Count the number of times the word "cat" appears in the input string*/
		Pattern p = Pattern.compile(REGEX);
		Matcher m2 = p.matcher(INPUT); // get a matcher object
		int count = 0;
		
		while(m2.find()) {
			count++;
			System.out.println("Match number " + count);
			System.out.println("start(): " + m2.start());
			System.out.println("end(): " + m2.end());
		}
		
		
		/* matches and lookingAt methods */
		pattern1 = Pattern.compile(REGEX1);
		matcher1 = pattern1.matcher(INPUT1);
		
		System.out.println("Current REGEX is: " + REGEX1);
		System.out.println("Current INPUT is: " + INPUT);
		
		System.out.println("lookingAt(): " + matcher1.lookingAt());
		System.out.println("matches(): " + matcher1.matches());
		
		
		/* replaceFirst and replaceAll methods*/
		Pattern p2 = Pattern.compile(REGEX2);
		
		// get a matcher object
		Matcher m3 = p2.matcher(INPUT2);
		INPUT2 = m3.replaceAll(REPLACE);
//		INPUT2 = m3.replaceFirst(REPLACE);
		System.out.println(INPUT2);
		
		/* appendReplacement and appendTail methods*/
		Pattern p3 = Pattern.compile(REGEX3);
		Matcher m4 = p3.matcher(INPUT3);
		StringBuffer sb = new StringBuffer();
		while(m4.find()) {
			m4.appendReplacement(sb, REPLACE3);
		}
		m4.appendTail(sb);
		System.out.println(sb.toString());
	}
	

}
