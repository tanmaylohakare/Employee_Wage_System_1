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
		int day =0;
		int totalWagesForMonth =0;
		
		
//		int workingHrs=0;
		while (day < working_days_per_mounth && totalWagesForHrs < max_working_Hrs) {
            day++;
		int workingHrs=0;
        int empType=(int) (Math.random()*100)%3;

		
		 
		switch (empType)
		{
		
		case Full_Time : 
            System.out.println("Day " + day + ": Employee is Present (Full-Time)");
	           workingHrs=8;
	           break;
	            
	        
		case Part_Time :
            System.out.println("Day " + day + ": Employee is Part-Time");
			 workingHrs=4;
			 break;
			 
		default:
	        
            System.out.println("Day " + day + ": Employee is Absent");
	            workingHrs =0;
	            break;
	            
		}
		
		 if (totalWagesForHrs + workingHrs > max_working_Hrs) {
             workingHrs = max_working_Hrs - totalWagesForHrs; // Adjust hours to cap at the max
         }
	            
		 int wage=workingHrs *Wage_Per_Hr;
		 
		 totalWagesForMonth +=wage;
		 totalWagesForHrs += workingHrs;

         System.out.println("Daily Wage: " + wage + " | Total Working Hours: " + totalWagesForHrs);

         if (totalWagesForHrs >= max_working_Hrs) {
             break;
         }
		 
		 System.out.println("Day " +day +": Employee Type =" +empType + ", Daily Wage = "+ wage);
		}
		System.out.println("Total Wage For the Month  "+ totalWagesForMonth);
        System.out.println("Total Working Hours:  " + totalWagesForHrs + " out of " + max_working_Hrs);
        System.out.println("Total Working Days:  " + day + " out of " + working_days_per_mounth);

        
	}

}

