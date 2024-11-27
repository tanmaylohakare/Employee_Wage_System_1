package com.tech;

public class Employee {
	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation ");
		
		final int Full_Time=1;
		int Part_Time=2;
		final int Wage_Per_Hr=20;
		
		int workingHrs=0;
        int attendence=(int) (Math.random()*100)%3;

		
		 int IS_PRESENT=1;
	        if(attendence== IS_PRESENT)
	        {
	            System.out.println("Employee is Present ");
	            
	            int WAGE_PER_HOUR=20;
	            int FULL_DAY_HOURS=8;
	            int daily_wage= WAGE_PER_HOUR * FULL_DAY_HOURS;
	            System.out.println("Daily Employee Wage "+ daily_wage);

	            
	        }
	        else
	        {
	            System.out.println("Employee is Absent");
	            System.out.println("Daily Employee Wage :0");
	        }
		
	}

}
