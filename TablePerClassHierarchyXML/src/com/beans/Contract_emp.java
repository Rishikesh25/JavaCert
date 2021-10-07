package com.beans;

public class Contract_emp extends Employee
{

	private float pay_per_hour;
	private float contract_duration;


public Contract_emp() {}
public Contract_emp(String name,float pay_per_hour,float contract_duration) 
{
	super(name);
	this.pay_per_hour=pay_per_hour;
	this.contract_duration=contract_duration;
}
public float getPay_per_hour() {
	return pay_per_hour;
}
public void setPay_per_hour(float pay_per_hour) {
	this.pay_per_hour = pay_per_hour;
}
public float getContract_duration() {
	return contract_duration;
}
public void setContract_duration(float Contract_duration) {
	this.contract_duration =Contract_duration ;
}

public String toString()
{
	return "Contract_emp[pay_per_hour="+pay_per_hour+" , contract_duration="+contract_duration+" , "+super.toString()+" ]";
}




}