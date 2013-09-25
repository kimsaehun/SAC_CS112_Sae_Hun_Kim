/** Sae Hun Kim
 * CS 112 Java Programming
 * Week 5 Lab 4
 */
package gitHubCodes.labWork.week5labs;

import java.util.Scanner;

public class labFour {
	public static void main(String[] args) {
		int x = (int) (Math.random() * 10);
		Scanner scan = new Scanner(System.in);
		for (int i = 2; i >= 0; i--) {
			if (i == 2) {
				System.out.print("Guess a single digit number: ");
			} else {
				System.out.print("Guess again: ");
			}
			int y = scan.nextInt();
			if (x == y) {
				System.out.println("You guessed it!");
				break;
			} else if (x > y) {
				System.out.println("Too low!");
			} else {
				System.out.println("Too high!");
			}
			if (i == 0) {
				System.out.println("You Lose!");
			} else {
				System.out.println("You have " + i + " more tries! ");
			}
		}
	}
}
