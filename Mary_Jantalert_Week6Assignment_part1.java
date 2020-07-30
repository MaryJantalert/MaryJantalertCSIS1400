//Mary_Jantalert
//collaborated with Jai.B
package maryjantalertassignment6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
public class Mary_Jantalert_Week6Assignment_part1 {

	public static void main(String[] args) {
		// Week6Assignmnetpart1
		
		
				int minVal = 0;
				int maxVal = 0;
				int numbers = 0;
				Displaymenu ();
				
				
			     Scanner input = new Scanner(System.in);
						System.out.println("----------------------------------");
						System.out.println("Looping Part 1 'The for loop:' Average of Randomly generated Integers");
						System.out.println("----------------------------------");
						System.out.printf("Please Enter the lowest # of the set: ", minVal);
						minVal = input.nextInt();
						
						System.out.printf("Please Enter the top highest # of the set: ", maxVal);
						maxVal = input.nextInt();
						
						System.out.printf("Please Enter How Many Numbers to Generate: ", numbers);
						numbers = input.nextInt();
						
						randomNumbers(minVal, maxVal, numbers);
						System.out.println("----------------------------------");
						

					}
					
					private static void Displaymenu() {
		
	}

					private static List<Integer> randomNumbers(int minVal, int maxVal, int numbers) {
						List<Integer> list = new ArrayList<>();
						for (int i=1; i <= numbers; i++) {
							list.add(ThreadLocalRandom.current().nextInt(minVal, maxVal + 1));
							
						}
						
						int sum = 0;
						for (int i : list) {
							sum += i;
						}
						
						int totAvg = sum /numbers;
						System.out.printf("Your Random Numbers Are: %s\n", list);
						System.out.printf("Average of generated numbers: %d\n",totAvg);
						return list;
					

			}

		

	}


