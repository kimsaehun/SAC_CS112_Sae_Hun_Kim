/** Sae Hun Kim
 * CS 112 Java Programming
 * Week 5 Lab 5
 */
package gitHubCodes.labWork.week5labs;

import java.util.Scanner;

public class labFive {
	public static void main(String[] args) {
		int x = (int) (Math.random() * 10);
		Scanner scan = new Scanner(System.in);
		int i = 2;
		while (i >= 0) {
			if (i == 2) {
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
			if (i == 0) {
				System.out.println("You Lose!");
			} else {
				System.out.println("You have " + i + " more tries! ");
			}
			i--;
		}
	}
}
