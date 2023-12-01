package Pro1;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.next();

	        if (a(str)) {
	            System.out.println("pallindrome");
	        } else {
	            System.out.println("not a palindrome.");
	        }
	    }

	public static boolean a(String str) {
        int a1 = 0;
        int a2 = str.length() - 1;
        while (a1 < a2) {
            if (str.charAt(a1) != str.charAt(a2)) {
                return false;
            }
            a1++;
            a2--;
        }
        return true;
    
	}
	}


