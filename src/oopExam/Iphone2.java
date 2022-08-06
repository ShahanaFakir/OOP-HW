package oopExam;

/*
 NOW, Iphone1 came in 2000, but the new model Iphone2, Iphone3 came in 2001. 
 Assume Iphone1 is a superclass and Iphone2, Iphone3 is the child class of the Iphone1. Implement that here.
 */

public class Iphone2 extends Iphone1 {

	public char userOfIphone2 = 'F';

	public Iphone2() {
		super(500, "2000", 'F', false);
		super.regularClassInfo();
		super.price2 = 800;
		System.out.println("The price for Iphone1 is: " + price2);
		System.out.println("Iphone2 default constructor is from Iphone2 Regular Class");
	}

	public Iphone2(char userOfIphone2) {
		super(200, "2001", 'F', true);
		super.regularClassInfo();
		super.price2 = 900;
		System.out.println("The price for Iphone1 is: " + price2);
		this.userOfIphone2 = userOfIphone2;
		System.out.println("The user of Iphone2 is " + userOfIphone2);

	}

	public void iPhone2Info() {
		super.regularClassInfo();
		super.price2 = 650;
		System.out.println("The price for Iphone1 is: " + price2);
		System.out.println("Iphone2 void type method is from Iphone2 Regular Class");
	}

	public void iPhone2Info(char userOfIphone2) {
		super.regularClassInfo();
		super.price2 = 550;
		System.out.println("The price for Iphone1 is: " + price2);
		System.out.println("The user of Iphone2 is " + userOfIphone2);

	}

	public void dropBox() {
		System.out.println("We can share file in dropBox.");

	}

}
