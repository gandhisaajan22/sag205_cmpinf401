package edu.pitt.sag205_MenuManager;

/**
 * Class Salad
 * @author saajangandhi
 * 10/14/2022
 */

public class Salad extends MenuItem {
	private String name;
	private double calorie;
	private String desc;
	private double price;
	public Salad(String name, String desc, double calorie, double price) {
		this.name = name;
		this.desc = desc;
		this.calorie = calorie;
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	public int getCalorie() {
		return (int) this.calorie;
	}
	public String getDesc() {
		return this.desc;
	}
	public double getPrice() {
		return this.price;
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
	public void setPrice(double price) {
		this.price = price;
	}
}
	