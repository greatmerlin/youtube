package challenge4;

public class Main {

	public static void main(String[] args) {
		
	       // challenge show even numbers
        /*
        * show all even numbers from 0(zero) to 30(thirty) using a while OR a do-while loop
        *
        * */
		
		// while 
		
		
		int index = 0;
		
		while(index <= 30) {
			
			System.out.println(index);
			index = index + 2;
		}
		
		// do-while
		
		System.out.println();
		
		index = 0;
		
		do {
			System.out.println(index);
			index += 2;
		}while(index <= 30);
		
		
		

	}

}
