package office;

public class Vehicle {
	private String Name;
	private String brand;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Vehicle [Name=" + Name + ", brand=" + brand + "]";
	}
	public Vehicle(String name, String brand) {
		super();
		Name = name;
		this.brand = brand;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}