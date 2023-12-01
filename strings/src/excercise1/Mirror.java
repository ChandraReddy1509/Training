 package excercise1;

public class Mirror {
	
	
	public static void main(String[] args) {
		String s="EARTH";
		String res="";
		for (int i=s.length()-1;i>=0;i--) {
		res=res + s.charAt(i);
	}
		System.out.println(res+"|"+s);
		
//		StringBuffer s1 =new StringBuffer(s);
//		
//		System.out.println("the mirror image :"+ s + "|" + s1.reverse());
//	}}
		
	}
}

