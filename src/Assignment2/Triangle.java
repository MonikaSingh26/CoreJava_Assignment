package Assignment2;

public class Triangle {

	public double area(double base, double height) {
				try {
		            return 1/2 * (base * height ); //Return Area of the Triangle
		        }
		        catch (ArithmeticException ae) {
		        	ae.getMessage();
		            return (0.0);
		        }
		    }
			public double perimeter(double height, double side, double base) {
				try {
		            return (side + side + side); //Return Perimeter of the Triangle
		        }
		        catch (ArithmeticException ae) {
		        	ae.getMessage();
		            return (0.0);
		        }
			}
}