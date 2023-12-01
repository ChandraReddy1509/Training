package Pro1;

import java.util.Scanner;

public class primeNum {

	public static void main(String[] args) {
		boolean res = false;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter number :");
		int n=sc.nextInt();
		int b=n/2;
		if(n==0||n==1) {
			System.out.println("is not  prime");
		}else {
			for(int i=2;i<=b;i++) {
				if(n%i==0) {
				System.out.println("not a prime");
				res=false;
				break;
		}
			}
			if(res=true) {
				System.out.println("prime");
			}
			}

		
		
	}
		}
