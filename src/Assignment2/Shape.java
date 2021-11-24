package Assignment2;
import java.util.Scanner;
import java.util.InputMismatchException;

		public class Shape {

			public static void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
		    
            try {
	            while(true) {
	            	 
		    System.out.println("Select shape to calculate Area, Circumference, Volume, Perimeter, Diagonal, Diameter:");
		    System.out.println("1.Circle");
		    System.out.println("2.Rectangle");
		    System.out.println("3.Triangle");
		    System.out.println("4.Square");
		    System.out.println("5.Cylinder");
		    System.out.println("6.Sphere");
		    System.out.println("7.Exit");
		    System.out.println("Please Enter Your Choice:");
		    int choice = sc.nextInt();
		    
		  
		    	switch(choice) {
		        case 1:
		        	double radius;
		           
		            System.out.println("Kindly Enter Radius of the Circle:");
		            radius = sc.nextDouble();
		            try {
                        if (radius < 0) {
                            throw new Exception("Radius you enter cannot be less than 0");
                        }
		            Circle circle = new Circle();
		            System.out.println("Diameter of the Circle is: " + circle.diameter(radius)); //Print Diameter of the Circle
		            System.out.println("Area of the Circle is: " + circle.area(radius)); //Print Area of the Circle
		    	    System.out.println("Circumference of the Circle is: " +circle.circumference(radius)); //Print Circumference of the Circle
		            } 
		            catch (InputMismatchException IME) {
                        System.out.println("Invalid Input");
                        System.out.println("Please enter Radius range between 0 to 9 only");

                    } catch (ArithmeticException ae) {
                    	ae.getMessage();
                    }
                        
		    	   break;
		    	    
		        case 2:
		        	double length, width;
		           
		            System.out.println("Kindly Enter length of the Rectangle:");
		            length = sc.nextDouble();
		            System.out.println("Kindly Enter width of the Rectangle:");
		            width = sc.nextDouble();
		            try {
                        if (length < 0) {
                            throw new Exception("Length you enter cannot be less than 0");
                        }
                        if (width < 0) {
                            throw new Exception("Width you enter cannot be less than 0");
                            }
		            Rectangle rectangle = new Rectangle();
		            System.out.println("Area of the Rectangle is: " + rectangle.area(length, width)); //Print Area of the Rectangle
		            System.out.println("Perimeter of the Rectangle is: " + rectangle.perimeter(length, width)); //Print Perimeter of the Rectangle
		            }
		            catch (InputMismatchException IME) {
                        System.out.println("Invalid Input");
                        System.out.println("Please enter Length and Width range between 0 to 9 only");

                    } catch (ArithmeticException ae) {
                    	ae.getMessage();
                    }
		            
		    	    break;
		    	    
		    	 case 3:
		    	    	double base, height, side;
		    	       
		    	        System.out.println("Kindly Enter Height of the Triangle:");
		    	        height = sc.nextDouble();
		    	        System.out.println("Kindly Enter Base of the Triangle");
		    	        base = sc.nextDouble();
		    	        System.out.println("Kindly Enter side of the Triangle");
		    	        side = sc.nextDouble();
		    	        try {
	                        if (base < 0) {
	                            throw new Exception("Base you enter cannot be less than 0");
	                        }
	                        if (height < 0) {
	                            throw new Exception("Height you enter cannot be less than 0");
	                            }
	                        if (side < 0) {
	                        	throw new Exception("Side you enter cannot be less than 0");
	                        }    	
		    	        Triangle triangle = new Triangle();
		    	        System.out.println("Area of the Triangle is: " + triangle.area(base, height)); //Print Area of the Triangle
		    	        System.out.println("Perimeter of the Triangle is: " + triangle.perimeter(height, base, side)); //Print Perimeter of the Triangle
		    	        }
		    	        catch (InputMismatchException IME) {
	                        System.out.println("Invalid Input");
	                        System.out.println("Please enter Base, Height and Side range between 0 to 9 only");

	                    } catch (ArithmeticException ae) {
	                    	ae.getMessage();
	                    }
		    	        
		    	        break;
		    	        
		    	 case 4:
		    		    double sideOfSquare;
		    	       
		    	        System.out.println("Kindly Enter Side of the Square:");
		    	        sideOfSquare = sc.nextDouble();
		    	        try {
	                        if (sideOfSquare < 0) {
	                            throw new Exception("Side of Square you enter cannot be less than 0");
	                        }
		    	        Square square = new Square();
		    	        System.out.println("Area of the Square is: " + square.area(sideOfSquare)); //Print Area of the Square
		    		    System.out.println("Perimeter of the Square is: " +square.perimeter(sideOfSquare)); //Print Perimeter of the Square
		    		    System.out.println("Diagonal of the Square is: " +square.diagonal(sideOfSquare)); //Print Diagonal of the Square
		    	        }
		    	        catch (InputMismatchException IME) {
	                        System.out.println("Invalid Input");
	                        System.out.println("Please enter Side of Square range between 0 to 9 only");

	                    } catch (ArithmeticException ae) {
	                    	ae.getMessage();
	                    }
		    	        
		    		    break;
		    		    
		    	 case 5: 
		    		  	double radiusOfCylinder, heightOfCylinder;
		    		  	
		    		  	System.out.println("Kindly Enter Radius of the Cylinder:");
		    		  	radiusOfCylinder = sc.nextDouble();
		    		  	System.out.println("Kindly Enter Height of the Cylinder:");
		    		  	heightOfCylinder = sc.nextDouble();
		    		  	try {
	                        if ( radiusOfCylinder < 0) {
	                            throw new Exception("Radius of Cylinder you enter cannot be less than 0");
	                        }
	                        if (heightOfCylinder < 0) {
	                        	throw new Exception("Height of Cylinder you enter cannot be less than 0");
		    		  	   }
		    		  	Cylinder cylinder = new Cylinder();
		    		  	System.out.println("Lateral Surface Area of the Cylinder is: " + cylinder.lateral_surface_area(radiusOfCylinder, heightOfCylinder )); //Print Lateral Surface Area of the Cylinder
		    		    System.out.println("Surface Area of the Cylinder is: " +cylinder.surface_area(radiusOfCylinder, heightOfCylinder)); //Print Surface Area of the Cylinder
		    		    System.out.println("Volume of the Cylinder is: " +cylinder.volume(radiusOfCylinder, heightOfCylinder)); //Print Volume of the Cylinder
		    		  	}
		    	        catch (InputMismatchException IME) {
	                        System.out.println("Invalid Input");
	                        System.out.println("Please enter Radius and Height of Cylinder range between 0 to 9 only");
		    	        } catch (ArithmeticException ae) {
	                    	ae.getMessage();
		    	        }
	                    
		    		    break;
		    		  	
		    	 case 6: 
		 		  	double radiusOfSphere;
		 		  	
		 		  	System.out.println("Kindly Enter Radius of the Sphere:");
		 		  	radiusOfSphere = sc.nextDouble();
		 		  	try {
                        if (radiusOfSphere < 0) {
                            throw new Exception("Radius of Sphere you enter cannot be less than 0");
                        }
		 		  	Sphere sphere = new Sphere();
		 		  	System.out.println("Diameter of the Sphere is: " + sphere.diameter(radiusOfSphere)); //Print Diameter of the Sphere 
		 		    System.out.println("Volume of the Sphere is: " + sphere.volume(radiusOfSphere)); //Print Volume of the Cylinder
		 		    System.out.println("Surface Area of the Sphere is: " +sphere.surface_area(radiusOfSphere)); //Print Surface Area of the Cylinder
	 		  	     }
	    	        catch (InputMismatchException IME) {
                        System.out.println("Invalid Input");
                        System.out.println("Please enter Radius of Sphere range between 0 to 9 only");
	    	        } catch (ArithmeticException ae) {
                    	ae.getMessage();
	    	        }
                    
		 		    break;
		    	 
		    	 case 7:
                     System.exit(0);

                 default:
                     System.out.println("The Choice you have enter is Invalid, Please enter valid Choice");
                 }
            }
        }
			catch (InputMismatchException IME) {
                 System.out.println("Enter number in the given range");
                   }
			}
		}