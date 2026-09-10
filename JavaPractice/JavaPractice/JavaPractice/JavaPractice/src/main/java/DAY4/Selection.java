package DAY4;

public class Selection {
	public static void main(String[] args) {
	int age = 20;
	if (age >= 18) {
	    System.out.println("Eligible to vote");
	}
	
	int number = 7;

	if (number % 2 == 0) {
	    System.out.println("Even");
	} else {
	    System.out.println("Odd");
	}
	
	int marks = 75;

	if (marks >= 90) {
	    System.out.println("A Grade");
	} else if (marks >= 75) {
	    System.out.println("B Grade");
	} else if (marks >= 50) {
	    System.out.println("C Grade");
	} else {
	    System.out.println("Fail");
	}
	
	int day = 2;

	switch (day) {
	    case 1:
	        System.out.println("Monday");
	        break;
	    case 2:
	        System.out.println("Tuesday");
	        break;
	    case 3:
	        System.out.println("Wednesday");
	        break;
	    default:
	        System.out.println("Invalid day");
	}
	
	}
}
