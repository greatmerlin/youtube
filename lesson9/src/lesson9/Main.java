package lesson9;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 0 hello
		 * 1 hello
		 * 2 hello 
		 * 3
		 * */
		
		
		
		int count = 0;
		
		while(count != 3) {
			
			System.out.println("hello!");
			count++;
		} 

		
		boolean KeysInTheKitchen = true;
		
		boolean searchingMyKeys = true;
		
		
		while(searchingMyKeys) {
			
			if(KeysInTheKitchen) {
				searchingMyKeys = false;
				
			}
			System.out.println("keys Found!");
			
			
		}
		
		/*
		 * 0 at least once
		 * 1 at least once
		 * 2
		 * */
		
		
		count = 0;
		
		do {
			System.out.println("at least once!");
			count++;
		}while(count != 2);

	}

}
