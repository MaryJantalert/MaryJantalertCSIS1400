//Mary_Jantalert

package maryjantalertweek6assignment_part3;

import java.util.Scanner;

public class Mary_Jantalert_Week6Assignment_part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int userInput = 0;
Scanner input = new Scanner(System.in);
System.out.println("Part 3: do-while loop: Display menu until user chooses to exit");
System.out.println("----------------------------------------------");
do {
System.out.println("==============================");
System.out.println("MENU");
System.out.println("==============================");
System.out.println("1: Choice 1");
System.out.println("2: Choice 2");
System.out.println("3: Choice 3");
System.out.println("4: Exit");
System.out.println("==============================");
System.out.println("Enter 1, 2, 3 or 4 to Exit: ");
userInput = input.nextInt();
} while (userInput !=4);
System.out.println("Goodbye!");

}
}