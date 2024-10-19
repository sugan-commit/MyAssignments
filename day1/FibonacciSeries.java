package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("FIBONACCI SERIES");
		int N1 = 0;
		int N2 = 1;
		int sum = 0;
		System.out.println(N1);
		System.out.println(N2);
		for (int i = 2; i < 20; i++) {
			sum = N1+N2;
			System.out.println(sum);
			
			N1 = N2;
			N2 = sum;
			
		}
		
		
		
	}

}
