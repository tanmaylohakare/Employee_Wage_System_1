package com.tech;

public class Employee {
	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation ");
		
		final int Full_Time=1;
		final int Part_Time=2;
		final int Wage_Per_Hr=20;
		final int working_days_per_mounth=20;
		final int max_working_Hrs=100;
		
		
		int totalWagesForHrs =0;
		int totalWagesForDays =0;
		int totalWagesForMonth =0;
		
		
//		int workingHrs=0;
		
		for(int day=1; day<=working_days_per_mounth;day++) {
			
		int workingHrs=0;
        int empType=(int) (Math.random()*100)%3;

		
		 int IS_PRESENT=1;
		 
		switch (empType)
		{
		
		case Full_Time : 
	           System.out.println("Employee is Present ");
	           workingHrs=8;
	           break;
	            
	        
		case Part_Time :
			 System.out.println("Employee is Part Time");
			 workingHrs=4;
			 break;
			 
		default:
	        
	            System.out.println("Employee is Absent");
	            workingHrs =0;
	            break;
	            
		}
	            
		 int wage=workingHrs *Wage_Per_Hr;
		 
		 totalWagesForMonth +=wage;
		 
		 System.out.println("Day " +day +": Employee Type =" +empType + ", Daily Wage ="+ wage);
		}
		System.out.println("Total Wage For the Month "+ totalWagesForMonth);
	}

}

