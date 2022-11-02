package edu.pitt.sag205_MenuManager;

/**
 * Class Entree
 * @author saajangandhi
 * created 10/14/2022
 */

public class Entree {
	private String name;
	private double calorie;
	private String desc;
	public Entree(String name, String desc, double calorie) {
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
