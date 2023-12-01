package Cubes;

import java.util.Scanner;

public class CubeSum {

	public static void main(String[] args) {
		System.out.println("enter the number ");
		try (Scanner sc = new Scanner(System.in)) {
			int a =sc.nextInt();
			int sum=0,n;
			while (a!=0)
			{
			n=a%10;
			sum=sum+(n*n*n);
			a=a/10;
			}
			System.out.println(sum);
		}

	}

}
