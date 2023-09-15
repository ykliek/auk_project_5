package part_1;

public class Syntax {
	public static void main(String[] args) {
		// 1. Use of different arguments of different types, show different
		// count of arguments
		helloWorld("Hello World;");
		defineUser("Yurii", "Kliek", 20);

		// 2. Use methods without return
		greetings();

		// 3. Demonstrate use of different types for return
		int sum = sum(1, 2);
		System.out.println(sum);

		double averageValue = average(1, 2, 3, 4, 5);
		System.out.println(averageValue);

		// 4. Demonstrate decomposition of the program into methods
		decomposition();

	}

	public static void helloWorld(String str) {
		System.out.println(str);
	}

	public static void defineUser(String name, String surname, int age) {
		System.out.println(
				"Name: " + name + "\nSurname: " + surname + "\nAge: " + age);
	}

	public static void greetings() {
		System.out.println("Greetings my fellow reviewer!");
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static double average(int... numbers) {
		int sum = 0;
		for (int value : numbers) {
			sum += value;
		}
		return (double) sum / numbers.length;
	}

	public static void decomposition() {
		helloWorld("Hello World;");
		theEnd("Yurii");
	}

	public static void theEnd(String user) {
		System.out.println("The End,\nBest Regards,\n" + user);
	}
}
