package oopExam;

public class ConfiguredIphone6 extends Iphone6 {
	@Override
	// void type method implemented
	public void compass() {
		System.out.println("Compass is an instrument containing a magnetized pointer.");

	}

	@Override
	// return type parameterized method01 implemented
	public int iPhone6(int ramPrice, int camerPrice) {
		int total1 = ramPrice + camerPrice;
		System.out.println("The price is: " + total1);
		return total1;
	}

	@Override
	// void type parameterized method implemented
	public void iPhone6(int cameraPrice, String ProcessorPrice) {
		int total2 = cameraPrice + Integer.parseInt(ProcessorPrice);
		System.out.println("The price is: " + total2);

	}

	@Override
	// return type parameterized method02 implemented
	public int iPhone6(int ramPrice, int cameraPrice, String ProcessorPrice, int chargerPrice) {
		int total3 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice) + chargerPrice;
		System.out.println("The price is: " + total3);
		return total3;

	}

	// @Override
	// static type method implemented
	// public static int iPhone6(int ramPrice, String ProcessorPrice, int
	// cameraPrice, int chargerPrice) {
	// int total4 = ramPrice + Integer.parseInt(ProcessorPrice) + cameraPrice +
	// chargerPrice;
	// System.out.println("The price is: " + total4);
	// return total4;

	// }

	/*
	 * Static method iPhone6 can not be override or implemented because static is a
	 * local method of class. So, static method can't be override, if we
	 * remove @override it will not work as static method of this ConfiguredIphone
	 * class.
	 */

	// @Override
	// final type method implemented
	// public final int iPhone6(String ProcessorPrice, int chargerPrice, int
	// ramPrice, int cameraPrice) {
	// int total5 = Integer.parseInt(ProcessorPrice) + chargerPrice + ramPrice +
	// cameraPrice;
	// System.out.println("The price is: " + total5);
	// return total5;
	// }

	/*
	 * Final type method can not overridden. We can not override the final method
	 * from Iphone6 class.
	 */

}
