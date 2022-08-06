package oopExam;

public class TestPhone {

	public static void main(String[] args) {
		System.out.println("\n.....................Regular class Iphone1...................");
		Iphone1 iphone1 = new Iphone1();
		iphone1.setInfo("2000");
		iphone1.setPrice(750);
		iphone1.setUser('F');
		iphone1.setMadeInUSA(false);
		System.out.print("I bought this phone in " + iphone1.getInfo() + ", the price was " + iphone1.getPrice() + "$"
				+ ", user's sex: " + iphone1.getUser() + " and made in USA is: " + iphone1.isMadeInUSA());

		iphone1.regularClassInfo();
		Iphone1.youTube();
		iphone1.data();
		iphone1.wakitokiInfo();
		iphone1.watchInfo();
		iphone1.digitalWatchInfo();
		iphone1.interfaceInfo();
		iphone1.call();
		iphone1.message();
		iphone1.camera();
		iphone1.appleWatchInfo();
		iphone1.abstractClassInfo();
		iphone1.battery();

		System.out.println("\n....................Abstract Class AppleWatch..............");
		AppleWatch appleWatch = new Iphone1();
		appleWatch.abstractClassInfo();
		appleWatch.appleWatchInfo();
		appleWatch.appleWatchSeriesInfo();
		appleWatch.watchInfo();
		appleWatch.digitalWatchInfo();

		System.out.println("\n....................Interface class Phone...................");
		Phone phone = new Iphone1();
		phone.interfaceInfo();
		phone.call();
		phone.message();
		phone.camera();
		phone.battery();
		phone.data();
		phone.wakitokiInfo();

		System.out.println("----Default constructor initialized from Iphone2 class----");
		Iphone2 iphone2 = new Iphone2();
		System.out.println("\n----Parameterized constructor initialized from Iphone2 class----");
		Iphone2 iphone3 = new Iphone2('F');
		System.out.println("\n---- void type method initialized from Iphone2 class----");
		Iphone2 iphone4 = new Iphone2();
		System.out.println("\n----Parametherized method initialized from Iphone2 class----");
		Iphone2 iphone5 = new Iphone2('F');
		System.out.println("\n----Default constructor initialized from Iphone1 class----");
		Iphone1 iphone01 = new Iphone1();
		System.out.println("\n----Parameterized constructor initialized from Iphone1 class----");
		Iphone1 iphone02 = new Iphone1(450, "2002", 'F', true);
		System.out.println("\n----void type method initialized from Iphone1 class----");
		Iphone1 iphone03 = new Iphone1();
		
		System.out.println("\n........Iphone6 instantiated and call all possible methods.........");
		Iphone6 iphone6 = new Iphone6();
		iphone6.setInfo(null);
		iphone6.setMadeInUSA(false);
		iphone6.getPrice();
		iphone6.getInfo();
		iphone6.isMadeInUSA();
		iphone6.regularClassInfo();
		Iphone6.youTube();
		iphone6.data();
		iphone6.wakitokiInfo();
		iphone6.watchInfo();
		iphone6.digitalWatchInfo();
		iphone6.interfaceInfo();
		iphone6.call();
		iphone6.message();
		iphone6.camera();
		iphone6.appleWatchInfo();
		iphone6.abstractClassInfo();
		iphone6.battery();
		iphone6.iPhone2Info();
		iphone6.photos();
		iphone6.email();
		iphone6.getUser();
		iphone6.dropBox();

		/*
		 * Instantiate Iphone6 in TestPhone and show how many methods they can call in
		 * TestPhone. [points: 70] . Comment out at the end of TestPhone to inform me
		 * which is hierarchical inheritance, multilevel inheritance, and single
		 * inheritance. [points: 50].
		 */

	}

}
