package office;

public class EvenOdd {
	public static void main(String[] args) {
		int arr[] = {1,20,13,5,6,7,8,9};
		int n=arr.length;
		int countEven=0, countOdd=0;
		for(int i=0;i<n;i++) {
			if(arr[i] % 2 == 0)
				countEven ++;
			System.out.println(arr[i]);
		}
			for(int i=0;i<n;i++) {
				if(arr[i]% 2 != 0)
			
				countOdd ++;
				System.out.println(arr[i]);
			
		}
		System.out.println("even:"+countEven);
		System.out.println("odd:"+countOdd);
		//Segragte both in differnt arrays
		
		
	}

}