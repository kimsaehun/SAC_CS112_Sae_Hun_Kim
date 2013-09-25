/** Sae Hun Kim
 * CS 112 Java Programming
 * Week 5 Lab 2
 */
package gitHubCodes.labWork.week5labs;

import java.util.Scanner;

public class labTwo {
	public static void main(String[] args) {
		int x = (int) (Math.random() * 10);
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess a single digit number: ");
		int y = scan.nextInt();
		if (x == y) {
			System.out.println("You guessed it!");
		} else if (x > y) {
			System.out.println("Too low!");
		} else if (x < y) {
			System.out.println("Too high!");
		}
	}
}
