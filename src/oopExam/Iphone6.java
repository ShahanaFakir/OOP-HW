package oopExam;

public class Iphone6 extends Iphone5 {

	public void compass() {
		System.out.println("Compass is an instrument for drawing circles");
	}

	/*
	 * Method overloading is also known as Static Polymorphism or early binding or
	 * compile time polymorphism. when different methods same name different
	 * parameter or different combination of parameter called method overloading.
	 * method overloading occurs during compile time methods overriding is also
	 * known as Late binding, dynamic binding, or runtime polymorphism When
	 * different methods exist with the same method name with same parameters or
	 * signature but with different syntax or logic, it is called method overriding.
	 * methods overriding occurs during runtime.
	 */

	// return type parameterized method01 implemented
	public int iPhone6(int ramPrice, int camerPrice) {
		int total1 = ramPrice + camerPrice;
		System.out.println("The price is: " + total1);
		return total1;

	}

	// void type parameterized method implemented
	public void iPhone6(int cameraPrice, String ProcessorPrice) {
		int total2 = cameraPrice + Integer.parseInt(ProcessorPrice);
		System.out.println("The price is: " + total2);

	}

	// return type parameterized method02 implemented
	public int iPhone6(int ramPrice, int cameraPrice, String ProcessorPrice, int chargerPrice) {
		int total3 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice) + chargerPrice;
		System.out.println("The price is: " + total3);
		return total3;

	}

	// static type method implemented
	public static int iPhone6(int ramPrice, String ProcessorPrice, int cameraPrice, int chargerPrice) {
		int total4 = ramPrice + Integer.parseInt(ProcessorPrice) + cameraPrice + chargerPrice;
		System.out.println("The price is: " + total4);
		return total4;

	}

	// final type method implemented
	public final int iPhone6(String ProcessorPrice, int chargerPrice, int ramPrice, int cameraPrice) {
		int total5 = Integer.parseInt(ProcessorPrice) + chargerPrice + ramPrice + cameraPrice;
		System.out.println("The price is: " + total5);
		return total5;
	}

	/*
	 * Write a method inside them related to one of the features like compass and
	 * print out related info.
	 * 
	 * What kind of concept you can use to relate to Iphone1 to 6? Instantiate
	 * Iphone6 in TestPhone and show how many methods they can call in TestPhone.
	 * [points: 70] .
	 * 
	 */

	/*
	 * First write about method over loading and method overriding with multiple
	 * line comments here Now, Think about Iphone6. It also has 6 methods with the
	 * same name as materials(). For example -- They are return type parameterized
	 * method (int ramPrice, int cameraPrice), another one return type parameterized
	 * method (int ramPrice, int cameraPrice, String ProcessorPrice), etc. Can you
	 * use the void, parameterized(return type), final (return type), or static
	 * (return type) method here as the same method name? if yes, create them and
	 * take more int variable of your own. What kind of concept you can use?
	 * [points: 70]. Instantiate the class in TestPhone and initialize those
	 * methods. [points: 70]. Now think about a regular class Name ConfiguredIphone6
	 * which extends Iphone6. Override those methods of Iphone6 and change the logic
	 * at your own to show the changes. [points: 50]. Show the output in TestPhone
	 * (how many methods is possible to extends). [points: 50].
	 * 
	 * Please make sure you organize the code in every class
	 * 
	 * Paste the github link for the package below
	 * 
	 */
}
