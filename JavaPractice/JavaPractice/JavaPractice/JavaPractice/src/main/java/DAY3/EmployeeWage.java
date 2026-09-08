package DAY3;

import java.util.Random;

public class EmployeeWage {
	  static final int WAGE_PER_HOUR = 20;
	    static final int FULL_TIME_HOURS = 8;
	    static final int PART_TIME_HOURS = 8;
	    static final int WORKING_DAYS = 20;
	    static final int MAX_WORKING_HOURS = 100;

	    public static void main(String[] args) {

	        Random random = new Random();

	        int attendance = random.nextInt(2);
     
	        if (attendance == 1) {
	            System.out.println("Employee is Present");
	        } else {
	            System.out.println("Employee is Absent");
	        }

	        int dailyWage = FULL_TIME_HOURS * WAGE_PER_HOUR;

	        if (attendance == 1) {
	            System.out.println("Daily Employee Wage: " + dailyWage);
	        } else {
	            System.out.println("Daily Employee Wage: 0");
	        }

	   
	        int partTimeWage = PART_TIME_HOURS * WAGE_PER_HOUR;
	        System.out.println("Part Time Employee Wage: " + partTimeWage);

	
	        int employeeType = random.nextInt(3);
	        int workingHours = 0;
	        switch (employeeType) {

	            case 0:
	                System.out.println("\nEmployee Type: Absent");
	                workingHours = 0;
	                break;

	            case 1:
	                System.out.println("\nEmployee Type: Full Time");
	                workingHours = FULL_TIME_HOURS;
	                break;

	            case 2:
	                System.out.println("\nEmployee Type: Part Time");
	                workingHours = PART_TIME_HOURS;
	                break;

	            default:
	                System.out.println("Invalid Employee Type");
	        }

	        int switchDailyWage = workingHours * WAGE_PER_HOUR;

	        System.out.println("Working Hours: " + workingHours);
	        System.out.println("Daily Wage using Switch Case: " + switchDailyWage);

	        int totalWorkingDays = 0;
	        int totalWorkingHours = 0;
	        int totalMonthlyWage = 0;

	        while (totalWorkingDays < WORKING_DAYS
	                && totalWorkingHours < MAX_WORKING_HOURS) {

	            int type = random.nextInt(3);

	            int dailyHours = 0;

	            switch (type) {

	                case 0:
	                    dailyHours = 0;
	                    break;

	                case 1:
	                    dailyHours = FULL_TIME_HOURS;
	                    break;

	                case 2:
	                    dailyHours = PART_TIME_HOURS;
	                    break;

	                default:
	                    dailyHours = 0;
	            }

	            totalWorkingDays++;

	            if (totalWorkingHours + dailyHours > MAX_WORKING_HOURS) {
	                dailyHours = MAX_WORKING_HOURS - totalWorkingHours;
	            }

	            totalWorkingHours += dailyHours;
	            totalMonthlyWage += dailyHours * WAGE_PER_HOUR;
	        }

	        System.out.println("\n----- Monthly Wage Details -----");
	        System.out.println("Total Working Days: " + totalWorkingDays);
	        System.out.println("Total Working Hours: " + totalWorkingHours);
	        System.out.println("Total Monthly Wage: " + totalMonthlyWage);

}
}
