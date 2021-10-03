package java_basic;

import java.text.*;
import java.util.Date;

public class Java_DateTimeOne {

	/*
	 * Date() - this constructor initializes the object with the current date and time
	 * Date(long millisec) - accepts an argument that equals the number of milliseconds, have elapsed since midnight Jan 1st 1970
	 * boolean after (Date date) - returns TRUE if Date object contains a date is later than the one specified by date, otherwise returns false
	 * boolean before (Date date) - returns TRUE if Date object contains a date is earlier than the one specified by date, otherwise returns false
	 * Object clone() - duplicates the invoking Date object
	 * int compareTo(Date date) - if the value is equal , return 0. if object is earlier , return negative value. If object is later than date, return positive
	 * in compareTo(Date date) - operates identically to compareTo(Date) if obj is of class Date. Otherwise, it throws a ClassCastException
	 * boolean equals(Object date) - return TRUE if Date object contains same time and date as the one specified by date. Otherwise, it return FALSE
	 * long getTime() - returns the number of milliseconds that have elapsed since January 1, 1970
	 * int hashCode() - returns a hash code for the invoking object
	 * void setTime(long time) - set time and date as specified by time, represented an elapsed time in milliseconds from midnight, Jan 1 1970
	 * String toString() - converts Date object into a string and returns the result
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Instantiate a Date object
		Date date = new Date();
		
		// Getting current date & time
		System.out.println(date.toString());
		
		// Date formatting using simpleDateFormat
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date: " + ft.format(date));
		
		// Date Formatting Using printf
		String str = String.format("Current Date/Time : %tc", date);
		System.out.printf(str);
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "\nDue date:", date); // display time and date
		System.out.printf("%s %tB %<te, %<tY", "\nDue date:", date);
		
		// Parsing Strings into Dates
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String input = args.length == 0 ? "\n1818-11-11" : args[0];
		System.out.print(input + " Parses as ");
		Date t;
		try {
			t = sdf.parse(input);
			System.out.println(t);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + sdf);
		}
		
		// Sleeping for a While
		try {
			System.out.println(new Date( ) + "\n");
			Thread.sleep(5*60*10);
			System.out.println(new Date( ) + "\n");
			
		} catch (Exception e) {
			System.out.println("Got an exception!");
		}
		
		// Measuring Elapsed Time
		try {
			long start = System.currentTimeMillis( );
			System.out.println(new Date( ) + "\n");
			
			Thread.sleep(5*60*10);
			System.out.println(new Date( ) + "\n");
			
			long end = System.currentTimeMillis( );
			long diff = end - start;
			System.out.println("Difference is : " + diff);
		} catch (Exception e) {
			System.out.println("Got an exception!");
		}
	}

}
