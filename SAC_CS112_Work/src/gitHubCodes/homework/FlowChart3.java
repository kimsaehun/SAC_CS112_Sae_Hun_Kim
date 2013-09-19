package gitHubCodes.homework;

import java.util.Scanner;

public class FlowChart3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ans;
		System.out.println("You are hungry.");
		System.out.println("You got in line.");
		System.out.println("You bought lunch.");
		System.out.println("Are you thirty? Yes/No");
		ans = scan.next();
		if (ans.equals("Yes")) {
			System.out.println("Did you eat breakfeast? Yes/No");
			ans = scan.next();
			if (ans.equals("Yes")) {
				System.out.println("You bought diet coke");
			} else if (ans.equals("No")) {
				System.out.println("You got coke");
			}
		} else if (ans.equals("No")) {
			System.out.println("You got water");
		}
		System.out.println("You ate lunch.");
		System.out.println("You returned the tray.");
		System.out.println("You left the building.");
	}
}