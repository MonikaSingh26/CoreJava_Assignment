package Assignment2;

public class Square {
	
	public double perimeter(double side) {
		try {
            return 4 * (side); //Return Perimeter of the Square
        }
        catch (ArithmeticException ae) {
        	ae.getMessage();
            return (0.0);
        }
    }
	public double area(double side) {
		try {
            return (side * side); //Return Area of the Square
        }
        catch (ArithmeticException ae) {
        	ae.getMessage();
            return (0.0);
        }
	}
	public double diagonal(double side) {
		try {
            return Math.pow(side, 2); //Return Diagonal of the Square
        }
        catch (ArithmeticException ae) {
        	ae.getMessage();
            return (0.0);
        }
	}
}
