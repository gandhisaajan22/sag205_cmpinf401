package edu.pitt.sag205_MenuManager;

/**
 * Class Salad
 * @author saajangandhi
 * 10/14/2022
 */

public class Salad {
	String name;
	double calorie;
	String desc;
	public Salad(String name, double calorie, String desc) {
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
	