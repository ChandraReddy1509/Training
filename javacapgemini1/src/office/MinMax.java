package office;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int arr[]=new int[5];

		int arr1[]= {10,20,30,40,50};

		System.out.println("Enter Array elements;");

		for(int i=0;i<arr.length;i++) {

			arr[i]=sc.nextInt();

		}

		int max = arr[0];

		int min = arr[0];

		for(int i:arr) {

			if(max<i) {

				max = i;

			}

			if(min>i) {

				min = i;

			}

		}

		System.out.println("Max:"+max);

		System.out.println("Min:"+min);

	}

}
