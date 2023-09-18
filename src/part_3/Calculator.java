/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   Calculator.java                              :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/18 21:33:22 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/18 21:33:25 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_3;

import java.util.Scanner;

/**
 * This class demonstrates interface for simple calculator.
 */
public class Calculator {
	private static Scanner scanner = new Scanner(System.in);
	private static double result = 0.0;

	public static void main(String[] args) {
		print("Calculator");

		do {
			double a = getUserDouble("Enter the first param: ");
			String operation = getUserString(
					"Enter the operation (e.g. +, -, *, /): ");
			double b = getUserDouble("Enter the second param: ");

			result = mainLogic(a, operation, b);

			print("Result: " + result);

		} while (isDone().equalsIgnoreCase("Y"));

		print("Goodbye! Have a froody day.");
	}

	private static double getUserDouble(String prompt) {
		print(prompt);
		while (!scanner.hasNextDouble()) {
			print("InputError: Please enter a valid number: ");
			scanner.next();
		}
		return scanner.nextDouble();
	}

	private static String getUserString(String prompt) {
		print(prompt);
		return scanner.next();
	}

	private static String isDone() {
		return getUserString("Do you want to continue? " +
				"(Y to continue, any other key to quit)");
	}

	private static void print(String message) {
		System.out.println(message);
	}

	private static double mainLogic(
			double a, String operation, double b) {
		switch (operation) {
			case "+":
				return add(a, b);
			case "-":
				return subtract(a, b);
			case "*":
				return multiply(a, b);
			case "/":
				if (b == 0) {
					print("InputError: Division by zero.");
					return a;
				}
				return divide(a, b);
			default:
				print("InputError: Invalid operation. Try again.");
				operation = getUserString(
						"Enter the operation (e.g. +, -, *, /): ");
				return mainLogic(a, operation, b);
		}
	}

	private static double add(double a, double b) {
		return a + b;
	}

	private static double subtract(double a, double b) {
		return a - b;
	}

	private static double multiply(double a, double b) {
		return a * b;
	}

	private static double divide(double a, double b) {
		return a / b;
	}
}
