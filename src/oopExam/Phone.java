package oopExam;

/*
 * Interface is a Blueprint of Class. It starts with upper case.
 * Interface cannot be instantiated. Method can be declared in Interface which called Abstract method 
 * and it's not mandatory to use Abstract keyword in Abstract method. 
 * One keyword is used for the inheritance in Interface which is "extends".
 * Interface can inherit an other Interface but It cannot inherit a Regular
 * Class or an Abstract Class. Interface can inherit more than one Interface.
 * Implements keyword can't be used for inheritance inside Interface
 * By Default and static, method can be implemented in Interface. Here default and static are not access modifier. 
 * In Interface, variables are final and static in nature.  
 */

public interface Phone extends Pager, Wakitoki {

	public static final int bornYear = 1820;

	/*
	 * public Phone() {}. In Interface, we cannot create a Constructor.
	 */

	public void interfaceInfo();

	public void call();

	public abstract String message();

	public abstract void camera();

	public default void battery() {
		System.out.println("Battery is a default method from JAVA Phone Interface");
	}

	public static void wireless() {
		System.out.println("Wireless is a static method from JAVA Phone Interface");
	}

}
