package ExceptionDemo1;

public class Exception1 {
	public static void main(String[] args) {
		//System.out.println("Command line inputs");
		int[] arr = new int[args.length];
		for(int i=0;i<args.length;i++) {
			try {
				System.out.println("loop iteration:"+i);
				arr[i]= 10/ Integer.parseInt(args[i]);
				System.out.println("loop iteration:"+i);
			}catch(NumberFormatException ne) {
				System.out.println("Exception Occur");
				System.out.println(ne.getMessage());
			}catch(ArithmeticException ae) {
				System.out.println(ae.getMessage());
			}
		}
		
	}
}



