package edu.pitt.sag205_Lab9;

public class Staff extends Person {
	private String school;
	private double pay;
	public Staff(String name, String address, double pay) {
		super(name, address);
		this.pay = pay;
	}
	public String getSchool() {
		return school;
	}
	public double getPay() {
		return pay;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Staff:\nName: " + super.getName() + "\nAddress: " + super.getAddress() + "\nSchool: " + school + "\nPay: " + pay;
	}
}
