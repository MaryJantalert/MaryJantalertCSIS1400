//Mary Jantalert

import java.util.Scanner;
public class Week4Assignment {

	public static void main(String[] args) {
		displayMenu();
	
		
	}

	private static void displayMenu() {

		double Length;
        double Width;
        double Height;
        double Area;
        double Volume;		
     
        
        Scanner input = new Scanner(System.in);
        System.out.println("This program will accept a length, width and height of a box");
        System.out.println("and then it will report the surface area and volume of it.");
        System.out.printf("Enter the box length: ");
        Length = input.nextDouble();
        System.out.printf("Enter the box height:" );
        Height = input.nextDouble();
        System.out.printf("Enter the box width:" );
        Width = input.nextDouble();
        Area = 2*Length*Width + 2 *Length * Height + 2*Height* Width;
        Volume = Length * Height * Width;
        System.out.printf("The area of your rectangle is :%.2f\n",  Area);
        System.out.printf("The volume of your rectangle is :%.2f\n", Volume);  
        input.close();
	}

}

