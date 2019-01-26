package lesson5revisionOperators;

public class Main {

	public static void main(String[] args) {
		
		// imagine that we create a game
		
		int winningScore = 20;
		
		int currentScore = 25;
		
		if(currentScore == winningScore) {
			System.out.println("Congratulations! You won the game!");
		}
		
		if(currentScore < winningScore) {
			System.out.println("Sorry you lost, please try again!");
		}
		
		if(currentScore > winningScore){
			System.out.println("You nailed it! gz!");
		}
		
		int speedCar1 = 150;
		int speedCar2 = 150;
		int speedlimit = 130;
		
		if((speedCar1 > speedlimit) && (speedCar2 == speedlimit)){
			System.out.println("both drivers will lose their driving licence!");
		}
		
		if((speedCar1 > speedlimit) || (speedCar2 == speedlimit)) {
			System.out.println("at least one of the drivers will lose his driving licence!");
		}
		
		if((speedCar1 < speedlimit) && (speedCar2 < speedlimit)) {
			System.out.println("both drivers will keep their driving licence!");
		}
		
		// boolean practice
		
		boolean theSkyIsBlack = false;
		
		if(theSkyIsBlack) {
			System.out.println("Is is late, we should go to sleep!");
		}
		
		boolean theSkyWasBlack = theSkyIsBlack ? true : false;
		
		System.out.println(theSkyWasBlack);
		
		
		

	}

}
