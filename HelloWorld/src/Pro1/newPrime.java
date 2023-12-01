package Pro1;

public class newPrime {
	    public static void main(String[] args) {
	        int s = 10; 
	        int e = 50; 

	        System.out.println("Prime numbers between " + s + " and " + e + " are: ");
	        for (int i = s; i <= e; i++) {
	            if (pr(i)) {
	                System.out.print(i + " ");
	            }
	        }
	        
	        
	    }

	
	  
	    public static boolean pr(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}



