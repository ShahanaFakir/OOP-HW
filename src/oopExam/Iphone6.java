package oopExam;

public class Iphone6 extends Iphone5 {

	public void compass() {
		System.out.println("This compass method from Iphone6.");
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

}
