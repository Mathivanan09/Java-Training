import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		int endRange = sc.nextInt(), initialRange = 1, a = 2;
		PrimeNumbers p = new PrimeNumbers();
		p.madPrimeNumber(endRange);

	}

	public void madPrimeNumber(int endRange) {
		int a = 0, c = 0;
		for (int i = 1; i <= endRange; i++) {
			if (i == 2 || i == 3 || i == 5) {
				System.out.print(i + " ");
				a++;
				c += i;
			}
			if (i > 3) {

				if (i % 2 != 0 & i % 3 != 0 && i % 5 != 0) {
					System.out.print(i + " ");
					a++;
					c += i;
				}
			}

		}
		System.out.println();
		System.out.println("Total Count is " + a);
		System.out.println("Grand Total is " + c);
	}
}
