package com.beans;

public class Regular_emp extends Employee
{
	private float salary;
	private float bonus;
	

	public  Regular_emp() {}
	public  Regular_emp (String name,float salary,float bonus) {
	       super(name);
	       this.salary= salary;
	       this.bonus= bonus;
	}
	
	
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return "Regular_emp [salary ="+salary+ ", bonus= "+bonus+" , "+ super.toString() +" ]";
}}
