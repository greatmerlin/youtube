package lessonExtraRevision;

public class Main {

	public static void main(String[] args) {
	
		
		// print a message
		
		System.out.println("Hello, there");
		
		// create and print a variable
		
		int myVariable = 5;
		
		System.out.println(myVariable);
		
		// do some math with variables
		
		int myCalculation = (10 + 8) + (5 * 4);
		
		System.out.println(myCalculation);
		
		// how can 2 variables interact with each other
		
		int myTotal = myCalculation + myVariable;
		
		System.out.println(myTotal);
		
		int myOtherTotal = myCalculation - myVariable;
		
		System.out.println(myOtherTotal);
		
		// how variables interact with numbers
		
		int myResult = 100 - myCalculation; // 100 - 38
		
		System.out.println(myResult);
		
		//working with doubles
		
		double myDouble = 5d;
		
		double mySecondDouble = 3d;
		
		double doubleTotal = myDouble / mySecondDouble;
		
		System.out.println(doubleTotal);
		
		double thisExample = 5/3;
		
		System.out.println(thisExample);
		
		double thisSecondExample = (double) 5/3;
		
		System.out.println(thisSecondExample);
		
		double thisThirdExample = 5.0/3.0 ;
		
		System.out.println(thisThirdExample);
		
		double thisForthExample = 5.0/3;
		
		System.out.println(thisForthExample);
		
		// unique code revision 
		
		char mySpecialChar = '\u00A9';
		
		System.out.println(mySpecialChar);
		
		// String! class!
		
		String myText = "This is happening";
		String mySecondText = "now";
		String myThirdText = " now";
		
		String firstAndSecond = myText + mySecondText;
		String firstAndThird = myText + myThirdText;
		
		System.out.println(firstAndSecond);
		System.out.println(firstAndThird);
		
		int myNumber = 5;
		int mySecondNumber = 10;
		String myString = "5";
		
		int normalCalculation = myNumber + mySecondNumber;
		String fakeCalculation = myNumber + myString;
		
		System.out.println(normalCalculation);
		System.out.println(fakeCalculation);            // 55
		
		
	}

}
