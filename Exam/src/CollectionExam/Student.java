package CollectionExam;

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
		HashMap<String, Integer> res = new HashMap<>();
		
		for (int i=0;i<studentList.size();i++) {
			if(res.containsKey(studentList.get(i).getCollege())){
				int j=res.get(studentList.get(i).getCollege());
			}
			else
			{
				res.put(studentList.get(i).getCollege(), 1);
			}
		}
		return res;
	}
	public ArrayList<String> studentsFromCollege(String collegeName){
		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<studentList.size();i++) {
			if(studentList.get(i).getCollege().equals(collegeName)){
			list.add(studentList.get(i).getName());	
			}
		}
		Collections.sort(list);
		return list;
	}

}
class source{
	public static void main(String[] args) {
		Student data1=new Student("Amit","Stanford");
		Student data2=new Student("Bob","Stanford");
		Student data3=new Student("Steve","harvard");
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
