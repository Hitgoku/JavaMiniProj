import java.util.Scanner;

public class Course {
	public static void main(String[] args) {

		String[] Courses = { "BCA", "BCOM", "BBA", "BSC" };

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please select your Courses:");
		for (int i = 0; i < Courses.length; i++) {
			System.out.println((i + 1) + ". " + Courses[i]);
		}
		int selection = scanner.nextInt();
		String Course = Courses[selection - 1];
		System.out.println("You have selected: " + Course);

	}
}
