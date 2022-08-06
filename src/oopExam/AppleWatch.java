package oopExam;

/*
 * Abstract Class is a super class. It starts with upper case. 
 * Abstract class cannot be instantiated. Two keywords are used for the inheritance in and then follows either camel case or snake case feature.
 * Abstract Class which is "extends" and "implements" in Java. An abstract class can inherit only
 * one abstract class or one regular class by extends key word. An abstract class
 * can't inherit an Interface by extends key word.
 * Implements keyword is used to inherit Interface in Abstract Class
 * An abstract class can inherit more than one Interface
 * An Abstract class can not inherit a regular class or abstract class by implements keyword.
 * Abstract class can contain abstract and non abstract method. 
 * We must have to put abstract keyword with the abstract method inside Abstract Class
 * We should write at least one abstract method inside Abstract Class.
 * Method can be declared as well as implemented in Abstract class.
 * Yes, we can make a relation of AppleWatch with Watch, DigitalWatch Interface by "implements" keyword. 
 * Yes, we can make a relation of AppleWatch with AppleWatchSeries Regular Class by "extends" keyword. 
 */

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	public int price = 300;

	public AppleWatch() {
		System.out.println("This is a default constructor of AppleWatch abstract class.");

		/*
		 * AppleWatch appleWatch = new AppleWatch. We cannot instantiate Abstract Class.
		 */
	}

	/*
	 * yes, we can create a variable and constructor inside Abstract class. No, we
	 * can not instantiate it.
	 */

	public void abstractClassInfo() {
		System.out.println("AbstractClassInfo non abstract method is from AppleWatch Abstract Class");
	}

	public abstract void appleWatchInfo();

}
