//Mary Jantalert

import java.util.Scanner;
public class Week4Assignment {

	public static void main(String[] args) {
		displayMenu();
	
		
	}

	private static void displayMenu() {

		double Length = 0;
        double Width =0;
        double Height= 0;
       	
     
        
        Scanner input = new Scanner(System.in);
        System.out.println("This program will accept a length, width and height of a box");
        System.out.println("and then it will report the surface area and volume of it.");
        System.out.printf("Enter the box length: ");
        Length = input.nextDouble();
        System.out.printf("Enter the box height:" );
        Height = input.nextDouble();
        System.out.printf("Enter the box width:" );
        Width = input.nextDouble();
        System.out.printf("Your Surface Area is : %,.2f%n",+ SurfaceArea(Length, Width, Height));
    	System.out.printf("Your Volume is : %,.2f%n", +Volume(Length,Width,Height));
    	}
    	private static double SurfaceArea (double W, double L, double H) {
    		return (2*L*W+2*W*H+2*H*L);
    	}
    	private static double Volume (double W, double L, double H) {
    		return (L*W*H);
    	}
}
        
	
