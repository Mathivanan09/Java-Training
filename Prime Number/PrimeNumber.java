import java.util.Scanner;

public class PrimeNumber{

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		PrimeNumber p=new PrimeNumber();
		int number=sc.nextInt();
		p.findPrime(number);
	}

	public void findPrime(int number)
	{
		int a = 0;
		for (int i = 2; i<number;i++) {
			
			
			if(number%i==0)			
			{
				System.out.println("Not Prime Number "+number);
				a=1;
				break;
			}						

		}
		System.out.println();
		if(a==0)
		{
			System.out.println("Prime Number "+number);
		}	
	}

}