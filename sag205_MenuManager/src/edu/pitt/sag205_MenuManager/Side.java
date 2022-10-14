package edu.pitt.sag205_MenuManager;

/**
 * Class Side
 * @author saajangandhi
 * 10/14/2022
 */

public class Side {
	String name;
	double calorie;
	String desc;
	public Side(String name, double calorie, String desc) {
		this.name = name;
		this.calorie = calorie;
		this.desc = desc;
	}
	public String getName() {
		return this.name;
	}
	public double getCalorie() {
		return this.calorie;
	}
	public String getDesc() {
		return this.desc;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
