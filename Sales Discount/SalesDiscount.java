import java.util.Scanner;

public class SalesDiscount {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		SalesDiscount sd = new SalesDiscount();
		System.out.println("Enter the Amount: ");
		int amount = sc.nextInt();
		System.out.println("Enter the Discount Percentage: ");
		int percent = sc.nextInt();
		sd.calculate(amount, percent);
	}

	private void calculate(int amount, int percent) {

		double a = amount, b, c;
		b = (a / 100);
		if (amount < 5000) {
			c = b * percent;
			System.out.println("Discount percentage is " + percent + "%");
			System.out.println("Discount Price is $" + (int) c);
			int price = (int) (amount - c);
			System.out.println("Price Value is $" + price);
		}
		if (amount >= 5000) {
			percent = percent + 5;
			c = b * percent;
			System.out.println("Discount percentage is " + percent + "%");
			System.out.println("Discount Price is $" + (int) c);
			int price = (int) (amount - c);
			System.out.println("Price Value is $" + price);
		}
	}
}
