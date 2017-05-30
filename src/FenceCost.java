import java.util.Scanner;

public class FenceCost {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String type = "";
		int perimeter = 0;
		int gates = 0;
		int fenceCost = 0;
		while (!type.equals("wood") && !type.equals("chain")) {
			System.out.println("what type of fence would you like? (w for wooden and c for chain-link): ");
			char temp;
			temp = scan.next().toLowerCase().charAt(0);
			if (temp == 'w')
				type = "wood";
			if (temp == 'c')
				type = "chain";
		}
		System.out.println("you have picked " + type);

		System.out.println("how many feet of fencing do you need?: ");
		while (!scan.hasNextInt()) {
			System.out.println("A positive integer please!!!");
			scan.next();
		}
		perimeter = scan.nextInt();
		System.out.println("you have picked " + perimeter + " feet of fence");

		System.out.println("How many gates would you like? (1 to 3): ");
		do {
			while (!scan.hasNextInt()) {
				System.out.println("An integer between 1 and 3 please");
				scan.next();
			} 
			gates = scan.nextInt();
		} while (gates < 1 || gates > 3);
		
		System.out.println("you have picked " + gates + " gate(s)");
		scan.close();

		if (type.equals("wood"))
			fenceCost = 25 * perimeter;
		else if (type.equals("chain"))
			fenceCost = 15 * perimeter;
		double total = fenceCost * 1.06;
		total += gates * 150 * 1.06;
		total += 500;

		System.out.println("Your total cost will be $" + total + " this includes labor, building permit and tax");
	}
}

/*
 * 
 * Objective Define the problem by constructing an algorithm using pseudocode
 * 
 * 
 * How much should a fence cost?
 * 
 * You've just been hired by Alton's Hardware Store. Your job is to develop a
 * tool which will allow his customers to calculate the cost for installing a
 * fence. Start by determining the algorithm to calculate the cost of installing
 * the fence.
 * 
 * Create a program that will calculate the cost with tax of fencing a
 * rectangular yard. The cost of the fencing will depend on the amount of
 * fencing required (the perimeter of the yard), and the type of fencing used.
 * Gates can are available for an additional cost.At least one gate is required.
 * 
 * Prices (including installation) Wooden fencing costs $25 per foot Chain-link
 * fencing costs $15 per foot Gates cost $150 each. You must install at least
 * one gate and can install up to 3 A building permit is required. It costs
 * $50.00. The tax rate is 6.0% but it doesn't apply to the building permit Your
 * algorithm should allow any other person to achieve the same result by
 * following your steps. They should not have to think about what they are
 * doing.
 * 
 * Can you (or someone else) write a Java program that follows the same steps?
 * If not, change your algorithm.
 * 
 * 
 * 
 */