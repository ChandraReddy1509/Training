package Pro1;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Entetr a String:");
		String str=sc.next();
		String str1 = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			str1+=str.charAt(i);
			
			
			
		}
		System.out.println(str1);
		
		
	}

}
