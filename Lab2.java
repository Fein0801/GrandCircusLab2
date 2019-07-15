import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	double roomWidth = 0.0;
	double roomLength = 0.0;

	double roomArea;
	double roomPerimeter;

	boolean userHasQuit = false;

	do {
	    // Get room length
	    System.out.println("Enter Length:");
	    System.out.print("> ");
	    roomLength = scan.nextDouble();

	    // Get room width
	    System.out.println("Enter Width:");
	    System.out.print("> ");
	    roomWidth = scan.nextDouble();

	    // Calculate area and perimeter
	    roomArea = roomWidth * roomLength;
	    roomPerimeter = (2 * roomWidth) + (2 * roomLength);

	    System.out.println("Area: " + roomArea);
	    System.out.println("Perimeter: " + roomPerimeter);

	    // Continue if user types the letter "y", quit in any other case
	    System.out.println("Continue? (Y/N)");
	    if (!scan.next().equalsIgnoreCase("Y")) {
		userHasQuit = true;
	    }

	} while (!userHasQuit);

	scan.close();

    }

}
