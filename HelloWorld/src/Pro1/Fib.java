package Pro1;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		 Scanner sc =new Scanner (System.in);
		 System.out.println("Enter number:");
		 int n=sc.nextInt(); 
		 int a = 0;
		 int b = 1;

		System.out.println("Fib series " + n );

		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");

			int c = a + b;
			a = b;
			b = c;
		}
	}
}
