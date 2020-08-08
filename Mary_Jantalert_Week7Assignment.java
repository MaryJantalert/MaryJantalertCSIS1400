//Mary_Jantalert_Array

package MaryWeek7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;



public class Mary_Jantalert_Week7Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numteam = 0;
		int numgame = 0;
		int tot;
		int top_team = 0;
		int top_team_index = 0;
		
	
		 Scanner input = new Scanner(System.in);
		 System.out.println("----------------------------------");
		 System.out.println("Football Team Randomized Season Scores");
		 System.out.println("----------------------------------");
		 System.out.printf("Enter the number of teams : ", numteam);
		 numteam = input.nextInt();
		 System.out.printf("Enter the number of games : ", numgame);
		 numgame = input.nextInt();
		 System.out.println("----------------------------------");
		
		 // two-dimensional integer array
		 int[][] game_scores= new int[numteam][numgame];
		 
		 System.out.println("----------------------------------");
		 System.out.println("Football Scores Report");
		 System.out.println("---------------------------------------------------------");
		 System.out.println("Team \t Scores \t\t\t Tot\t Avg");
		 System.out.println("---------------------------------------------------------");
		 
//nested for-loop to populate the array with random scores within a range of 0-99
		 
		 for (int i = 0; i < numteam; i++) {
			 tot = 0;
			 System.out.printf("%d: \t", i+1);
			 for (int j = 0; j < numgame; j++) {
			 game_scores[i][j] = ThreadLocalRandom.current().nextInt(10, 100);
			 System.out.print(game_scores[i][j] + " ");
			 tot = tot + game_scores[i][j];


			 }
			 if (tot > top_team) {
			 top_team = tot;
			 top_team_index = i+1;
			 }
			 System.out.print("\t\t " + tot);
			 System.out.print("\t " + tot/numgame + " ");
			 System.out.println();
			 }
		     System.out.println("------------------------------------------------------------------");
			 System.out.printf("Top Team: Team %d", top_team_index);
			 System.out.println();
			 System.out.println("-----------------------------------------------------------------");
			 
		 
		 
		
		
			 
		 
	}

		
	}


