//Mary_Jantalert
package maryjantalertassignment6part2;
import java.util.Scanner;
public class Mary_Jantalert_Week6Assignment_part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PART 2: Mary_Part 2_ WHILE LOOP
		
		Scanner input = new Scanner(System.in);
		// initialize variables
		int userNumber;
		int counter = 0;
		int total = 0;
		
		System.out.println("Part 2 The 'While Loop': The Average of users Numbers via a While loop");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Enter the integers to average; Enter -1 to FINISH");
		System.out.println("------------------------------------------------------------------");
		System.out.print("Entry 1: ");
		userNumber = input.nextInt();

		
		while( userNumber != -1) {
			total += userNumber;
			counter++;
			System.out.printf("Entry %d: ", counter + 1);
			userNumber = input.nextInt();
		}
		System.out.printf("Total Numbers You Entered: %d\n", counter);
		System.out.printf("The Average of Your Numbers is: %d", total/counter);
	}




	}


