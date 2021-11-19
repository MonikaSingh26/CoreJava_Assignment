package Assignment2;

import java.util.Scanner;

public class Shape {

	public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Select shape to calculate Area, Circumference, Volume, Perimeter, Diagonal:");
    System.out.println("1.Circle");
    System.out.println("2.Rectangle");
    System.out.println("3.Triangle");
    System.out.println("4.Square");
    System.out.println("5.Sphere");
    System.out.println("6.Cylinder");
    System.out.println("7.Exit");
    System.out.println("Please Enter Your Choice:");
    int choice = sc.nextInt();
    
  
    	switch(choice) {
        case 1:
        	double radius;
           
            System.out.println("Kindly Enter Radius of the Circle:");
            radius = sc.nextDouble();
            Circle circle = new Circle();
            System.out.println("Diameter of the Circle is: " + circle.diameter(radius)); //Print Diameter of the Circle
            System.out.println("Area of the Circle is: " + circle.area(radius)); //Print Area of the Circle
    	    System.out.println("Circumference of the Circle is: " +circle.circumference(radius)); //Print Circumference of the Circle
    	    break;
    	    
        case 2:
        	double length, width;
           
            System.out.println("Kindly Enter length of the Rectangle:");
            length = sc.nextDouble();
            System.out.println("Kindly Enter width of the Rectangle:");
            width = sc.nextDouble();
            Rectangle rectangle = new Rectangle();
            System.out.println("Area of the Rectangle is: " + rectangle.area(length, width)); //Print Area of the Rectangle
            System.out.println("Perimeter of the Rectangle is: " + rectangle.perimeter(length, width)); //Print Primeter of the Rectangle
            
    	    break;
    	    
    	    
    	 case 3:
    	    	double base, height, side;
    	       
    	        System.out.println("Kindly Enter Height of the Triangle:");
    	        height = sc.nextDouble();
    	        System.out.println("Kindly Enter Base of the Triangle");
    	        base = sc.nextDouble();
    	        System.out.println("Kindly Enter side of the Triangle");
    	        side = sc.nextDouble();
    	        Triangle triangle = new Triangle();
    	        System.out.println("Area of the Triangle is: " + triangle.area(base, height)); //Print Area of the Triangle
    	        System.out.println("Perimeter of the Triangle is: " + triangle.perimeter(height, base, side)); //Print Perimeter of the Triangle
    	        break;
    	        
    	 case 4:
    		    double SideOfSquare;
    	       
    	        System.out.println("Kindly Enter Side of the Square:");
    	        SideOfSquare = sc.nextDouble();
    	        Square square = new Square();
    	        sc.close();
    	        System.out.println("Area of the Square is: " + square.area(SideOfSquare)); //Print Area of the Square
    		    System.out.println("Perimeter of the Square is: " +square.perimeter(SideOfSquare)); //Print Primeter of the Square
    		    System.out.println("Diagonal of the Square is: " +square.diagonal(SideOfSquare)); //Print Diagonal of the Square
    		    break;
    	        

  
    }
    
	}    			
}
