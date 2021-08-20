import java.util.Scanner;
import java.util.Random;

public class Matador {

	public static void main(String[] args) {
		int playerScore = 0;
		int compScore = 0;
		int playerNum;
		int compNum;
		Random rand = new Random();
		final int WIN = 150;

		Scanner scnr = new Scanner(System.in);

		
		Die playerDie1 = new Die();
		Die playerDie2 = new Die();
		Die compDie1 = new Die();
		Die compDie2 = new Die();

		while (playerScore < WIN && compScore < WIN) {

			for (int i = 0; playerScore < WIN; i++) {
				System.out.print("Choose a number 2 through 6: ");
				playerNum = scnr.nextInt();
				
				while(playerNum < 2 || playerNum > 6) {
					
					System.out.println("That number is invalid");
					System.out.print("Choose a number 2 through 6: ");
					playerNum = scnr.nextInt();
					
				}
				
				System.out.println();				
				System.out.print("Player choose number "+ playerNum);

				playerDie1.roll();
				playerDie2.roll();
				
				System.out.println(" and rolled " + playerDie1.getDieNum() + " and " + playerDie2.getDieNum());
				
				

				if (playerDie1.getDieNum() == 1 && playerDie2.getDieNum() == 1) {
					playerScore -= 20;
					break;
				} else if (playerDie1.getDieNum() == 1 || playerDie2.getDieNum() == 1) {

					break;
				} else if (!(playerDie1.getDieNum() == 1 || playerDie2.getDieNum() == 1)) {

					playerScore += playerDie1.getDieNum() + playerDie2.getDieNum();

				}

				if ((playerDie1.getDieNum() == playerNum && !(playerDie2.getDieNum() == playerNum))) {

					continue;

				} else if (!(playerDie1.getDieNum() == playerNum) && playerDie2.getDieNum() == playerNum) {

					continue;

				} else if (playerDie1.getDieNum() == playerNum && playerDie2.getDieNum() == playerNum) {

					playerScore = WIN;

				} else if (!(playerDie1.getDieNum() == playerNum) && !(playerDie2.getDieNum() == playerNum)) {

					break;

				}

			}

			if (playerScore >= WIN) {

				break;
			}
			
			System.out.println();

			for (int i = 0; compScore < WIN; i++) {
				compNum = rand.nextInt(5) + 2;
				
				
				System.out.print("Computer choose number "+ compNum);
				
				compDie1.roll();
				compDie2.roll();
				
				System.out.println(" and rolled " + compDie1.getDieNum() + " and " + compDie2.getDieNum());

				if (compDie1.getDieNum() == 1 && compDie2.getDieNum() == 1) {
					compScore -= 20;
					break;
				} else if (compDie1.getDieNum() == 1 || compDie2.getDieNum() == 1) {

					break;
				} else if (!(compDie1.getDieNum() == 1 || compDie2.getDieNum() == 1)) {

					compScore += compDie1.getDieNum() + compDie2.getDieNum();

				}

				if ((compDie1.getDieNum() == compNum && !(compDie2.getDieNum() == compNum))) {

					continue;

				} else if (!(compDie1.getDieNum() == compNum) && compDie2.getDieNum() == compNum) {

					continue;

				} else if (compDie1.getDieNum() == compNum && compDie2.getDieNum() == compNum) {

					compScore = WIN;

				} else if (!(compDie1.getDieNum() == compNum) && !(compDie2.getDieNum() == compNum)) {

					break;

				}

			}
			
			System.out.println();			
			System.out.println("Score so far: Player - " + playerScore + " Computer - " + compScore);
			System.out.println();

		}
		
		

		if (playerScore > compScore) {

			System.out.print("Player Wins! with a score of " + playerScore);
		} else {

			System.out.print("Computer Wins! with a score of " + compScore);
		}

	}

}
