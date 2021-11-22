package Assignment2;

public class Sphere {

	public double diameter(double radius) {
		try {
            return 2 * radius; //Return Diameter of the Sphere
        }
        catch (ArithmeticException ae) {
        	ae.getMessage();
            return (0.0);
        }
    }
	public double volume(double radius) {
		try {
            return 4/3 * Math.PI * (Math.pow(radius, 3)); //Return Volume of the Sphere
        }
        catch (ArithmeticException ae) {
        	ae.getMessage();
            return (0.0);
        }
    }
	public double surface_area(double radius) {
		try {
            return 4 * Math.PI * (Math.pow(radius, 2)); //Return Surface Area of the Sphere
        }
        catch (ArithmeticException ae) {
        	ae.getMessage();
            return (0.0);
        }
    }
}
