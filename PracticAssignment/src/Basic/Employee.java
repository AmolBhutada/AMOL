package Basic;

public class Employee {
	
	
	
	    // Instance variables
	    private long employeeId;
	    private String employeeName;
	    private String employeeAddress;
	    private long employeePhone;
	    private double basicSalary;
	    private double specialAllowance = -250.80; // Default value
	    private double HRA = -1000.50; // Default value

	    // Constructors
	    public Employee(long employeeId, String employeeName, String employeeAddress,long employeePhone, double basicSalary) {
	        this.employeeId = employeeId;
	        this.employeeName = employeeName;
	        this.employeeAddress = employeeAddress;
	        this.employeePhone = employeePhone;
	        this.basicSalary = basicSalary;
	    }

	    // Overloaded constructor 
	    public Employee(String name, String address, long phone) {
	        this.employeeName = name;
	        this.employeeAddress = address;
	        this.employeePhone = phone;
	    }

	    // Method to calculate salary 
	    public void calculateSalary() {
	        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * HRA / 100);
	        System.out.println("Calculated Salary: $" + salary);
	    }

	    public void displayDetails() {
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Employee Name: " + employeeName);
	        System.out.println("Employee Address: " + employeeAddress);
	        System.out.println("Employee Phone: " + employeePhone);
	        System.out.println("Basic Salary: $" + basicSalary);
	        System.out.println("Special Allowance: $" + specialAllowance);
	        System.out.println("HRA: $" + HRA);
	    }
	    
	}



