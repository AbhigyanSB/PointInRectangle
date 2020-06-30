/* This program will determine if the point that the user entered
 * is inside the rectangle with 10 unit breadth and 5 unit height
 * and having the center at the (0,0). */

//Import the Scanner class in Java.
import java.util.Scanner;

//Class to determine whether the given point is inside the rectangle or not.
public class PointInRectangle {
	
	//Main method.
	public static void main(String[] args) {
		
		//Create a Scanner object.
		Scanner input = new Scanner(System.in);
		
		//Ask the user to input the values of x and y coordinates.
		System.out.println("Please enter a value for x- and y-coordinate: ");
		
		//Storing the inputs for the x and y coordinates.
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		//Condition for the point to check whether it is inside the rectangle or not.
		//If the point is inside the rectangle.
		if (  x >= -5 && x <= 5 && y >= (-2.5) && y <= 2.5) { 
			System.out.println("The coordinate that you entered (" + x + "," + y + ") is inside the rectangle, centered at (0, 0) with width 10 and height 5.");
		}	//If statement.
		
		//If the point is not inside the rectangle.
		else { 
			System.out.println("The coordinate that you entered (" + x + "," + y + ") is outside the rectangle, centered at (0, 0) with width 10 and height 5.");
		}	//Else statement
		
		//Close the input.
		input.close();
	
	}	//Main() method.

}	//PointInRectangle class.
