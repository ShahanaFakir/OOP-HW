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
		
		System.out.println("\n----------Iphone2----------\n");

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
		iphone6.setPrice(0);
		iphone6.setUser('0');
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
		iphone6.compass();
		iphone6.appleWatchSeriesInfo();
		iphone6.iPhone2Info('M');
		iphone6.iPhone6(200, 250);
		iphone6.iPhone6(250, "350");
		iphone6.iPhone6(200, 2500, "350", 400);
		iphone6.iPhone6("350", 400, 200, 250);

		System.out.println("\n----Regular Class ConfiguredIphone6----\n");

		ConfiguredIphone6 cIphone6 = new ConfiguredIphone6();
		cIphone6.compass();
		cIphone6.email();
		cIphone6.photos();
		cIphone6.iPhone2Info();
		cIphone6.iPhone2Info('M');
		cIphone6.dropBox();
		cIphone6.regularClassInfo();
		cIphone6.wakitokiInfo();
		cIphone6.watchInfo();
		ConfiguredIphone6.youTube();
		cIphone6.interfaceInfo();
		cIphone6.call();
		cIphone6.message();
		cIphone6.camera();
		cIphone6.battery();
		cIphone6.abstractClassInfo();
		cIphone6.appleWatchInfo();
		cIphone6.digitalWatchInfo();
		cIphone6.appleWatchSeriesInfo();
		cIphone6.data();
		cIphone6.iPhone6(200, 250);
		cIphone6.iPhone6(250, "350");
		cIphone6.iPhone6(200, 250, "350", 400);
		cIphone6.iPhone6("350", 400, 200, 250);

		/*
		 * The relation between Iphone1, Iphone2, Iphone3, Iphone4, Iphone5 and Iphone6
		 * is an example of multilevel inheritance. like Iphone6 extends Iphone5,
		 * Iphone5 extends iphone4, Iphone4 extends Iphone2, Iphone3 extends Iphone1.
		 */

		/*
		 * The relation between Iphone1, Iphone2, Iphone3 is an example of hierarchical
		 * inheritance. Like both Iphone2 and Iphone3 are derived from the parent class
		 * Iphone1.
		 */

		/*
		 * The relation between Iphone1 and Iphone2 is an example of single inheritance.
		 * Like Iphone2 extends Iphone1.
		 */

	}

}
