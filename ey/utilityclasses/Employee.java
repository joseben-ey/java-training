package ey.utilityclasses;

public class Employee {
	
	Integer empNo;
	String empName;
	Double empSalary;
	
	public Employee(Integer empNo, String empName, Double empSalary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp= new Employee(234,"Jose",25000.0);
		System.out.println(emp);
	}
	
}