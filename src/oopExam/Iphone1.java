package oopExam;

/*
 * Regular class is a blueprint from which individual objects are created. 
 * It can be instantiated.  In regular class, method only implemented, not declared. It contains
 * only non abstract method. Two keywords are used for the inheritance in
 * regular class which are "extends" and "implements".
 * A regular class can inherit only one abstract class or one regular class by extends keyword. 
 * A regular class can inherit more than one interface by implements keyword but it cannot inherit any regular class or abstract 
 * class by implements keyword. 
 * Yes, we can make a relation of Iphone1 with Phone Interface by "implements" keyword. 
 * And Iphone1 with AppleWatch Abstract Class by "extends" Keyword.
 */

public class Iphone1 extends AppleWatch implements Phone {

	public void regularClassInfo() {
		System.out.println(" RegularClassInfo method is from Iphone1 Regular Class." + "\nAbstract class & Interface cannot be instantiated "
				+ "They need help of concreate class(regular class) to instantiated"
				+ "\nContains only non-abstract methods"
				+ "\nextends and implements keywords are used for inheritance");
	}

	public static void youTube() {
		System.out.println("Youtube static method is from Iphone1 Regular Class");
	}

	private int price;
	private String Info;
	private char user;
	private boolean madeInUSA;
	public int price2;

	public Iphone1() {
		System.out.println("IPhone1 constructor is from Iphone1 Regular Class");
	}

	public Iphone1(int price, String info, char user, boolean madeInUSA) {
		super();
		this.price = price;
		Info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
		System.out.println("\nI bought this phone in " + info + "\nThe price was " + price + "$" + "\nUser's sex: "
				+ user + "\nMade in USA is: " + madeInUSA);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return Info;
	}

	public void setInfo(String info) {
		Info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	@Override
	public void data() {
		System.out.println("This data method is from Pager Interface Class");
	}

	@Override
	public void wakitokiInfo() {
		System.out.println("This WakitokiInfo method is from Wakitoki Interface class");
	}

	@Override
	public void watchInfo() {
		System.out.println("This watchInfo method is from Watch Interface class");
	}

	@Override
	public void digitalWatchInfo() {
		System.out.println("This digitalwatchInfo method is from DigitalWatch Interface class");

	}

	@Override
	public void interfaceInfo() {
		System.out.println("This interfaceInfo method is from Phone Interface class");
	}

	@Override
	public void call() {
		System.out.println("This call method is from Phone Interface class");

	}

	@Override
	public String message() {
		System.out.println("This message method is from Phone Interface class");
		return null;
	}

	@Override
	public void camera() {
		System.out.println("This camera method is from Phone Interface class");

	}

	@Override
	public void appleWatchInfo() {
		System.out.println("This appleWatchInfo method is from AppleWatch Abstract class");

	}

}
