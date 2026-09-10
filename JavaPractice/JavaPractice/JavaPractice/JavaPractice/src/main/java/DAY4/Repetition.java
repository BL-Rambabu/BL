package DAY4;

public class Repetition {
public static void main(String[] args) {
	for (int i = 1; i <= 5; i++) {
	    System.out.println(i);
	}
	System.out.println("_______________");
	int i = 1;

	while (i <= 5) {
	    System.out.println(i);
	    i++;
	}
	System.out.println("_______________");
	do {
	    System.out.println(i);
	    i++;
	} while (i <= 5);
}
}
