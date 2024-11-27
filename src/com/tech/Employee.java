package com.tech;

public class Employee {
	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation ");
		
		final int Full_Time=1;
		final int Part_Time=2;
		final int Wage_Per_Hr=20;
		
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
		 
		 System.out.println("Employee Daily wage is " + wage);
		
	}

}

