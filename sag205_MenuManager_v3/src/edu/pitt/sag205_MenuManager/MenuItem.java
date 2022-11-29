package edu.pitt.sag205_MenuManager;

public class MenuItem {
	private String name;
	private String desc;
	private int calorie;
	private double price;
	public MenuItem() {
	}
	public MenuItem(String name, String desc, int calorie, double price) {
		setName(name);
		setDesc(desc);
		setCalorie(calorie);
		setPrice(price);
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getCalorie() {
		return this.calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return this.name;
	}
}

