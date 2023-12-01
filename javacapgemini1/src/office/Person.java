package office;

public class Person {
	private String name;
	private float age ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
		public Person(String name,float age){
			this.name=name;
			this.age=age;
		}
		void displayPerson() {
			System.out.println("person:"+name);
			System.out.println("age:"+age);
	
	
		
	}
	


}
