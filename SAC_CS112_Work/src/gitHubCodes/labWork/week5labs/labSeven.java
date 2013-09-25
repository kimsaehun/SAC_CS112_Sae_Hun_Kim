/** Sae Hun Kim
 * CS 112 Java Programming
 * Week 5 Lab 7
 */
package gitHubCodes.labWork.week5labs;

import java.util.Scanner;

public class labSeven {
	public static void main(String[] args) {
		int x = (int) (Math.random() * 10);
		Scanner scan = new Scanner(System.in);
		int i = 121;
		while (i == 121) {
			if (i == 121) {
				System.out.print("Guess a single digit number: ");
			} else {
				System.out.print("Guess again: ");
			}
			int y = scan.nextInt();
			if (x == y) {
				System.out.println("You guessed it!");
				break;
			} else {
				System.out.printf("%s\n", (x > y) ? "Too low!" : "Too high!");
			}
			System.out.println("Try again? y/n");
			i = (int) (scan.next().charAt(0));
			while (!(i == 121 || i == (int) 'n')) {
				System.out.println("Invalid answer. Enter 'y' or 'n'.");
				i = (int) (scan.next().charAt(0));
			}
		}
		if (!(i == (int) 'y')) {
			System.out.println("You Lose!");
		}
	}
}