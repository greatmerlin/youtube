package challenge3;

public class Main {

	public static void main(String[] args) {

        // Challenge isEven
        /*
        * An even number is an integer which is "evenly divisible" by two. like 2, 4, 6 , 8 and so on.
        * create a variable number of type int.
        * then write a code, which the moment we give a value to our variable and execute the code,
        * will tell us if the number is even or not(odd).
        * hint: use the if-else statement to do it.
        * hint: you can also use while-if statement to do it.
        * 
        * hint: use %
        * */
		
		int number;
		number = 3;
		
		//if statement
		
		if((number % 2) == 0) {
			System.out.println("if statement: the number is Even" );
		}else {
			System.out.println("if statement: the number is odd");
		}
		
		// while statement
		
		while((number % 2) == 0) {
			System.out.println("while/if statement: it is Even!");
			break;
		}
		if((number % 2) != 0) {
			System.out.println("while/if : it is odd!");
		}
		
		// number % 2 -> 9 % 2 -> 9 / 2 (integer)= 4 -> 8 -> 9 - 8 = 1
		//number % 2 -> 3 % 2 -> 1
		

	}

}
