package CollectionExam1;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.HashMap;


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
	
	public HashMap<String , Integer> groupByCollege(){
		HashMap<String, Integer> studentsCount = new HashMap<>();
		
		for(Student student:studentList) {
			String college=student.college;
			studentsCount.put(college, studentsCount.getOrDefault(college,0)+ 1);		
		}
		return studentsCount;
	}
	public ArrayList<String> studentsFromCollege(String collegeName){
		ArrayList<String> studentsInCollege =new ArrayList<>();
		
		for(Student student:studentList) {
			if(student.college.equals(collegeName)) {
				studentsInCollege.add(student.getName());
			}
		}
		Collections.sort(studentsInCollege);
		return studentsInCollege;
	}
	public static void main(String[] args) {
		Student data1=new Student("Amit","Stanford");
		Student data2=new Student("Bob","Stanford");
		Student data3=new Student("Steve","Harvard");
		Student data4=new Student("Alice","Harvey Mudd");
		
		University obj=new University();
		obj.studentList.add(data1);
		obj.studentList.add(data2);
		obj.studentList.add(data3);
		obj.studentList.add(data4);
		System.out.println(obj.groupByCollege());
		System.out.println(obj.studentsFromCollege("Stanford"));
	}
}


