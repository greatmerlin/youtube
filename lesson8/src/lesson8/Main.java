package lesson8;

public class Main {

	public static void main(String[] args) {
		
		int month;
		
		month = 8;
		
		String monthString;  
		
		switch(month) {
		case 1: monthString = "January";
				break;
		case 2: monthString = "February";
				break;
		case 3: monthString = "Marz";
				break;
		case 4: monthString = "April";
				break;
		default: monthString = "other month, not one of the first four!";		
		}
		System.out.println(monthString);
		

	}

}
