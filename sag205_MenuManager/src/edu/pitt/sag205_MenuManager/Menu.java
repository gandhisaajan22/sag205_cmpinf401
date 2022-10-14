package edu.pitt.sag205_MenuManager;

/**
 * Class Menu
 * @author saajangandhi
 * 10/14/2022
 */

public class Menu {
	String name;
	Entree entree;
	Side side;
	Salad salad;
	Dessert dessert;
	public Menu(String name, Entree entree, Salad salad) {
		this.name = name;
		this.entree = entree;
		this.side = null;
		this.salad = salad;
		this.dessert = null;
	}
	public Menu(String name, Side side, Salad salad) {
		this.name = name;
		this.entree = null;
		this.side = side;
		this.salad = salad;
		this.dessert = null;
	}
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	public double totalCalories() {
		double totalCalories = 0.0;
		if (this.entree != null) {
			totalCalories += this.entree.getCalorie();
		}
		if (this.side != null) {
			totalCalories += this.side.getCalorie();
		}
		if (this.salad != null) {
			totalCalories += this.salad.getCalorie();
		}
		if (this.dessert != null) {
			totalCalories += this.dessert.getCalorie();
		}
		return totalCalories;
	}
	public String description() {
		String description = "";
		description += this.name;
		description += "\n";
		if (this.entree != null) {
			description += "Entree: " + this.entree.getName() + this.entree.getDesc();
		}else {
			description += "Entree: N/A";
		}
		description += "\n";
		if (this.side != null) {
			description += "Side: " + this.side.getName() + this.side.getDesc();
		}else {
			description += "Side: N/A";
		}
		description += "\n";
		if (this.salad != null) {
			description += "Salad: " + this.salad.getName() + this.salad.getDesc();
		}else {
			description += "Salad: N/A";
		}
		description += "\n";
		if (this.dessert != null) {
			description += "Dessert: " + this.dessert.getName() + this.dessert.getDesc();
		}else {
			description += "Dessert: N/A";
		}
		description += "\n";
		return description;
	}
}
