package com.fanniemae.payroll;

public abstract class Employee {
	// Instance variable
	protected float yearlySalary = 0;	
	
	public float getYearlySalary(){
		return yearlySalary;
	}
	
	public Employee(float yearlySalary){
		this.yearlySalary = yearlySalary;
	}
	
	public float getWeeklySalary(){
		return yearlySalary/52;
	}
	
	/* the objective is to find the monthly
	 * salary
	 * create method call getMonthlySalary;
	 */
	
	public float getMonthlySalary(){
		return yearlySalary/12;
	}
	
	/* create a method for hourlyWage 
	   based on a 40 hour week 
	   method name: getHourlyWage */
	
	public float getHourlyWage(){
		return yearlySalary/52/40;
	}
	
	public float getOverTimeHourlyWage(){
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee";
	}
	
}
