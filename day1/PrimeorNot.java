package week1.day1;

import java.util.Scanner;

public class PrimeorNot {
	public static boolean isPrime(int num) {

		// Write your code here
      int n ;
      n = num;
     for (int i = 2; i < n / 2; i++) {
		if (n % i == 0)
		{
			return false;
			
		}
		
	}
     return true;
	}
     
     public static void  showifPrime() {
    	 System.out.println( "The num is a prime number");
     }
     public static void  showNotPrime() {
    	 System.out.println(" The num is NOT a prime number");
     }
     
        

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		if (isPrime(num)) {
			showifPrime();
		
	}
		else {
			showNotPrime();
		}

}
	}
