package Assignment2;

public class Circle {
	
	public double diameter(double radius) {
		try {
            return 2 * radius; //Return Radius of the Circle
        }
        catch (ArithmeticException ae) {
        	ae.getMessage();
            return (0.0);
        }
    }
	public double area(double radius) {
		try {
            return Math.PI * Math.pow(radius, 2); //Return Area of the Circle
        }
        catch (ArithmeticException ae) {
        	ae.getMessage();
            return (0.0);
        }
    }
	public double circumference(double radius) {
		try {
            return 2 * Math.PI * radius; //Return Circumference of the Circle
        }
        catch (ArithmeticException ae) {
        	ae.getMessage();
            return (0.0);
        }
    }
		
}