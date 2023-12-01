package office;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("1 for red");
	System.out.println("2 for green");

	System.out.println("3 for yellow");
	System.out.println("ENTER");
	String n =sc.next();
	
	{
	switch(n){
	case "Red":System.out.println("stop");
	break;
	case "YEllow":System.out.println("ready");
	break;
	case "Green":System.out.println("go");
	default :
		System.out.println("byr");
	
	}
		
	}
	
	
			


  
	}

}
