package Basic_Program;
			//Find the max salary in the input arrays {30,50,60,90,10, 100,999}

public class Ex018 {

	 public static void main(String[] args) {
	        // Input array of salaries
	        int[] salaries = {30, 50, 60, 90, 10, 100, 999};
	        
	        // Find the maximum salary
	        int maxSalary = findMaxSalary(salaries);
	        
	        // Print the maximum salary
	        System.out.println("Maximum salary: " + maxSalary);
	    }
	    
	    // Function to find the maximum salary in an array
	    public static int findMaxSalary(int[] salaries) {
	        int maxSalary = Integer.MIN_VALUE;
	        for (int salary : salaries) {
	            if (salary > maxSalary) {
	                maxSalary = salary;
	            }
	        }
	        return maxSalary;
	    }
}
