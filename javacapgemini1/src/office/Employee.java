package office;

public class Employee {
	private int empId;
	private String empName;
	private double salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee() {
		this(0, "rr", 0.0);
	}

	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;

	}

	void displayEmp() {
		System.out.println("Emp Id:" + empId);
		System.out.println("Emp Name:" + empName);
		System.out.println("Emp Salary:" + salary);
	}
}
