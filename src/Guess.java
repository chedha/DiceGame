import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {

		int num;
		int sum = 0;
		int turns = 0;

		Die die1 = new Die();
		Die die2 = new Die();

		Scanner scnr = new Scanner(System.in);

		System.out.print("Choose a number between 2 and 12: ");
		num = scnr.nextInt();

		while (turns < 3) {

			turns++;
			die1.roll();
			die2.roll();

			sum = die1.getDieNum() + die1.getDieNum();
			System.out.println("Sum on "+ turns + " turn: " + sum);

			if (sum == num) {
				System.out.println("You win!");

				break;
			}

		}
		if (turns >= 3) {
			System.out.println("Computer Wins!");

		}

	}

}
