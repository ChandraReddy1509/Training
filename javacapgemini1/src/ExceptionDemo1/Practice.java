package ExceptionDemo1;
import java.util.Arrays;
import java.util.List;

public class Practice {
	
	enum Color {
	    RED,
	    GREEN,
	    BLUE,
	    PURPLE;
	} 
	
	public static class Shoes{
		
		private String brand;
		private Color c;
		
		public Shoes(String brand,Color c) {
			this.brand = brand;
			this.c = c;
		}

		@Override
		public String toString() {
			return "Shoes [brand=" + brand + ", c=" + c + "]";
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shoes s1 = new Shoes("Puma",Color.BLUE);
		Shoes s2 = new Shoes("Addidas", Color.GREEN);
		
		List<Shoes> list = Arrays.asList(s1,s2,new Shoes("Campus",Color.BLUE));
		
		list.stream().filter(e -> e.c == Color.BLUE).forEach(System.out::println);

	}

}
