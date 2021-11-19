package Assignment2;

public class Rectangle {
	
	    double length, width;
		
		public double perimeter(double length, double width) {
			try {
	            return 2 * (length + width); //Return Perimeter of the Rectangle
	        }
	        catch (ArithmeticException ae) {
	        	ae.getMessage();
	            return (0.0);
	        }
	    }
		public double area(double length, double width) {
			try {
	            return (length * width); //Return Area of the Rectangle
	        }
	        catch (ArithmeticException ae) {
	        	ae.getMessage();
	            return (0.0);
	        }
		}
}