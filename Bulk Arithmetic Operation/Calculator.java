import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("Please Select Your Choice: ");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			addtion();
			break;
		case 2:
			subtraction();
			break;
		case 3:
			multiplication();
			break;
		case 4:
			Division();
			break;
		default:
			System.out.println("Please Select Anyone from above Options");

		}
	}

	private static void Division() {
		System.out.println("This is the Division");
	}

	private static void multiplication() {
		System.out.println("This is the Multiplication");
	}

	private static void subtraction() {
		System.out.println("This is the Subtraction");		
	}

	private static void addtion() {

		System.out.println("Enter Your total Count");
		int count = sc.nextInt();
		int a[] = new int[count];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the " + (i + 1) + " value");
			a[i] = sc.nextInt();
		}

		System.out.println("Array List Data:");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
		int total = a[0];
		for (int k = 0; k < a.length - 1; k++) {
			total += a[k + 1];

		}
		System.out.println("Addition of " + a.length + " values is :");
		System.out.println(total);

	}
}
