package java_basic;

public class Java_Arrays {
	/*
	 * Arrays are used to store multiple values in a single variable
	 * To declare an array, define the variable type with square brackets
	 */
	/*
	 * for - each
	 * for(data_type variable : arrayname){ // body of the loop}
	 */
	
	/*
	 * syntax to declare an Array in Java
	 * dataType[] arr;
	 * dataType []arr;
	 * dataType arr[];
	 * Instantiation of an Array in Java: arrayRefVar = new datatype[size];
	 */
	
	/*
	 * Multidimensional Array in Java
	 * dataType[][] arrayRefVar;
	 * dataType [][]arrayRefVar;
	 * dataType arrayRefVar[][];
	 * dataType []arrayRefVar[];
	 */
	
	/*
	 * Copying a Java Array
	 * public static void arrayCopy(Object src, int srcPos, Object dest, int destPos, int length)
	 */

	public static void main(String args[]) {
		
		// Declaration, Instantiation and Initialization of array
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		cars[0] = "Opel"; // Change the value of specific element
		
		int[] myNum = {10, 20, 30, 40};
		
		System.out.println("Element 0 returns: " + cars[0]);
		System.out.println("The number of elements in array: " + cars.length); 
		
		// Loop Through an Array
		System.out.println("===Print elements in array by for loop===");
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("===Print elements in array by for - each loop===");
		for(String i : cars) {
			System.out.println(i);
		}
		
		System.out.println("===Multidimensional Arrays===");
		int[][] myNumbers = {{1, 2, 3, 4},{5, 6, 7}};
		System.out.println(myNumbers[0][2]); // [0] : index of array, [2] : the third element in the array
		
		System.out.println("===Get elements of a two-dimensional array by using for loop inside another for loop===");
		for(int i = 0; i < myNumbers.length; ++i) {
			for(int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println(myNumbers[i][j]);
			}
		}
		
		
		//declaration and instantiation
		int a[] = new int[5];
		a[0] = 10; // initialization
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		// traversing array
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("===Passing Array to a Method in Java===");
		int passingArr[] = {33, 3, 4, 5}; // declaring and initializing an array
		min(passingArr); // passing array to method
		
		System.out.println("===Anonymous Array to the method in Java===");
		printArray(new int[] {10, 22, 44, 66});
		
		System.out.println("===Returning Array from the method in Java===");
		int arr[] = get();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("===ArrayIndexOutOfBoundsException===");
		int arrIndex[] = {50, 60, 70, 80};
		for(int i = 0; i < arrIndex.length; i++) {
			System.out.println(arrIndex[i]);
		}
		
		System.out.println("===Multidimensional Array in Java===");
		int[][] arrMultiDemensional = new int[3][3]; // 3 rows and 3 columns
		
		// Initialize Multidimensional Array
		arrMultiDemensional[0][0] = 1;
		arrMultiDemensional[0][1] = 2;
		arrMultiDemensional[0][2] = 3;
		arrMultiDemensional[1][0] = 4;
		arrMultiDemensional[1][1] = 5;
		arrMultiDemensional[1][2] = 6;
		arrMultiDemensional[2][0] = 7;
		arrMultiDemensional[2][1] = 8;
		arrMultiDemensional[2][2] = 9;
		
		// Declaring and initializing 2D array
		int arr2D[][] = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};
		
		// Printing 2D array
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr2D[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("===Class name of java array===");
		int arrClassName[] = {4, 4, 5};
		Class c = arrClassName.getClass(); // get class name of array
		String name = c.getName();
		System.out.println(name);
		
		
		System.out.println("===Copying an array===");
		//declaring a source array
		char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
		
		// declaring a destination array
		char[] copyTo = new char[7];
		
		// copying array using System.arraycopy() method
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		
		// printing the destination array
		System.out.println(copyTo);
		
		
		System.out.println("===Clone an array===");
		int arrClone[] = {33, 3, 4, 5};
		System.out.println("Printing original array:");
		for(int i : arrClone) 
			System.out.println(i);
		
		System.out.println("Printing clone of the array");
		int carr[] = arrClone.clone();
		for(int j:carr)
			System.out.println(j);
		
		System.out.println("Are both equal?");
		System.out.println(arrClone == carr);
		
		
		System.out.println("===Addition of 2 Matrices in java===");
		// Create 2 matrices
		int aMatr[][] = {{1,3,4},{3,4,5}};
		int bMatr[][] = {{1,3,4},{3,4,5}};
		
		// Creatig another matrix to store the sum of two matrices
		int cMatr[][] = new int[2][3];
		
		// adding and printing addition of 2 matrices
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				cMatr[i][j] = aMatr[i][j] + bMatr[i][j];
				System.out.print(cMatr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("===Multiplication of 2 Matrices in java===");
		int aMulti[][] = {{1,1,1},{2,2,2}, {3, 3, 3}};
		int bMulti[][] = {{1,1,1},{2,2,2}, {3, 3, 3}};
		
		// creating another matric to store the multiplication of two matrices
		int cMulti[][] = new int[3][3];
		
		// multiplying and printing multiplication of 2 matrices
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				cMulti[i][j] = 0;
				for(int k = 0; k < 3; k++) {
					cMulti[i][j] += aMulti[i][k] * bMulti[k][j];
				} // end of k loop
				System.out.print(cMulti[i][j] + " "); // Printing matrix element
			} // end of j loop
			System.out.println();
		}
	}
	
	
	
	// Passing Array
	static void min(int arr[]) {
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
				System.out.println(min);
			}
		}
	}
	
	// Anonymous Array
	static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	// Returns array 
	static int[] get() {
		return new int[] {10, 20, 50, 90,60};
	}

}
