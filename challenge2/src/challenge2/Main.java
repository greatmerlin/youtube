package challenge2;

public class Main {

	public static void main(String[] args) {

		/*
		 * your job, is to write a simple if else statement, that will inform the person
		 * who came to us if he is eligible to vote or not. Lets assume, that we are in
		 * Europe and everyone who is above the age of 18 (eighteen) has the right to
		 * vote.
		 */

		int age;

		age = 10;

		if (age > 18) {
			System.out.println("You have the right to vote as your age is above 18!");
		} else if (age == 18) {
			System.out.println("You are just at the right age to vote! Think carefully before you throw that vote!");
		} else {
			System.out.println("Sorry, you are not yet 18! Thus you cat't vote!");
		}

	}

}
