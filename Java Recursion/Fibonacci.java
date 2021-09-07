public class Fibonacci {

	public static void main(String[] args) {

		int a=-1,b=1,c=5;
		findFibo(a, b, c);
	}

	private static void findFibo(int a, int b, int c) {
		
		if(c>0)
		{
			b=a+b;a=b-a;
			System.out.println(b);
			findFibo(a,b,c-1);
		}
	
	}

}
