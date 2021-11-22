package Assignment2;

public class Cylinder {

	   public double lateral_surface_area(double radius, double height) {
			try {
	            return 2 * Math.PI * radius * height; //Return Lateral Surface Area of the Cylinder
	        }
	        catch (ArithmeticException ae) {
	        	ae.getMessage();
	            return (0.0);
	        }
	    }
		public double surface_area(double radius, double height) {

	        try {
	            return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * 2); //Return Surface Area of the Cylinder
	        }
	        catch (ArithmeticException ae) {
	        	ae.getMessage();
	            return (0.0);
	        }
		}
	     public double volume(double radius, double height) {

	            try {
	                return Math.PI * Math.pow(radius, 2) * height; //Return Volume of the Cylinder
	            }
	            catch (ArithmeticException ae) {
	            	ae.getMessage();
	            	return (0.0);
	            }
	    }
	}

