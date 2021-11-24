package Assignment2;

public class Triangle {

	public double area(double base, double height) {
				try {
		            return (base * height ) / 2; //Return Area of the Triangle
		        }
		        catch (ArithmeticException ae) {
		        	ae.getMessage();
		            return (0.0);
		        }
		    }
			public double perimeter(double height, double side, double base) {
				try {
		            return (height + side + base); //Return Perimeter of the Triangle
		        }
		        catch (ArithmeticException ae) {
		        	ae.getMessage();
		            return (0.0);
		        }
			}
}