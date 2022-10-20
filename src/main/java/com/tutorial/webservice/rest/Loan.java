package com.tutorial.webservice.rest;

public class Loan {
// simple interest
	// create java variabels that represent each of json variable
	/*
	 {
	"customerName":"john",
	"principal":100000,
	"time":10,
	"rate":5
}
	 */
	int principal;
	int time;
	int rate;
	String customerName;
	public int getPrincipal() {
		return principal;
	}
	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
