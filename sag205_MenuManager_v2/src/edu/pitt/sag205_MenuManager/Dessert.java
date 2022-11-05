package edu.pitt.sag205_MenuManager;

/**
 * Class Dessert
 * @author saajangandhi
 * 10/14/2022
 */

public class Dessert {
	private String name;
	private double calorie;
	private String desc;
	public Dessert(String name, String desc, double calorie) {
		this.name = name;
		this.desc = desc;
		this.calorie = calorie;
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
