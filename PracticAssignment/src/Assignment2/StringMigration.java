package Assignment2;

public class StringMigration 
{

	

	    public static void main(String[] args) 
	    {
	        // Given data
	        String a = "abcdef";
	        String b = "xyz1234";
	        String c = "abcxy";

	        // Task 1
	        if (a.length() > c.length() && a.length() < b.length()) 
	        {
	            System.out.println("Task 1: Length of 'a' is greater than 'c' and less than 'b'");
	        }

	        // Task 2
	        if (!a.equals(b) && !a.equals(c)) 
	        {
	            System.out.println("Task 2: 'a' is not the same as 'b' and 'c'");
	        }

	        // Task 3
	        if (c.equalsIgnoreCase(a)) 
	        {
	            System.out.println("Task 3: 'c' is the same as 'a' irrespective of case");
	        }

	        // Task 4
	        if (a.contains("cd") && !a.contains("xy")) 
	        {
	            System.out.println("Task 4: 'a' contains 'cd' and does not contain 'xy'");
	        }

	        // Task 5
	        String bUpperCase = b.toUpperCase();
	        if (bUpperCase.contains("Z") && !bUpperCase.contains("z")) 
	        {
	            System.out.println("Task 5: 'b' in uppercase contains 'Z' and does not contain 'z'");
	        }

	        // Task 6
	        if ((a + b).length() < c.length() || (a + b).length() > 5) 
	        {
	            System.out.println("Task 6: Length of concatenated 'a' and 'b' is less than 'c' or greater than 5");
	        }

	        // Task 7
	        if (a.startsWith("ab") && !b.endsWith("yz")) 
	        {
	            System.out.println("Task 7: 'a' starts with 'ab' and 'b' does not end with 'yz'");
	        }

	        
	    }
	}

	



