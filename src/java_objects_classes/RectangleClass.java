package java_objects_classes;

public class RectangleClass {

	public static void main(String[] args) {
		
		JavaClassOne myRectangle1 = new JavaClassOne();
		JavaClassOne myRectangle2 = new JavaClassOne();
		
		myRectangle1.insertRectangle(11, 5);
		myRectangle2.insertRectangle(3, 15);
		
		myRectangle1.calculateArea();
		myRectangle2.calculateArea();
		
		// Calling a method with anonymous object
		new JavaClassOne().fact(5);
		
		
		// Creating multiple objects by one type only
		JavaClassOne multipleObjs1 = new JavaClassOne(),multipleObjs2 = new JavaClassOne();
		multipleObjs1.insertRectangle(11, 6);
		multipleObjs2.insertRectangle(3, 15);
		multipleObjs1.calculateArea();
		multipleObjs2.calculateArea();
	}

}
