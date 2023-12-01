package CollectoinStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
	String name;
	String college;

	public Student(String name,String college) {
		super();
		this.name=name;
		this.college=college;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
}
class University{
	ArrayList<Student> studentList=new ArrayList<>();
	
	public Map<String , Integer> groupByCollege(){
			
		return studentList.stream().collect(Collectors.toMap(Student::getCollege, Collectors.counting()));
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		

	}

}
