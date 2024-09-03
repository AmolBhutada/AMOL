package Basic;

public class InheritanceActivity 
     {
	
	
	    public static void main(String[] args) {
	        // Create an instance of Employee
	        Employee employee = new Employee(101, "Vivek sharma", " 11,Main Street Pune", 8956849256L, 45000);

	        // Display employee details
	        System.out.println("Details for Employee:");
	        employee.displayDetails();
	        System.out.println();

	        // Create an instance of Boss
	        Boss boss = new Boss(201, "Anand Roy", "22,Paradize road Bangluru", 9876543210L,95000);

	        // Display boss details
	        System.out.println("Details for Boss:");
	        boss.displayDetails();
	        System.out.println();

	        // Create an instance of Trainee
	        Trainee trainee = new Trainee(301, "Anil Vishwas", "33, New Park City",8899557744L, 25000);

	        // Display trainee details
	        System.out.println("Details for Trainee:");
	        trainee.displayDetails();
	        System.out.println();

	        // Calculate salary for the employee
	        System.out.println("Calculating salary for Employee:");
	        employee.calculateSalary();
	    }
	}



