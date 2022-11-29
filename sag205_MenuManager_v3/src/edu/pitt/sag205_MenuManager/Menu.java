package edu.pitt.sag205_MenuManager;

/**
 * Class Menu
 * @author saajangandhi
 * 10/14/2022
 */

public class Menu {
	private String name;
	private Entree entree;
	private Side side;
	private Salad salad;
	private Dessert dessert;
	public Menu(String name) {
		this.name = name;
		this.entree = null;
		this.side = null;
		this.salad = null;
		this.dessert = null;
	}
	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = null;
		this.dessert = null;
	}
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	public String getName() {
		return this.name;
	}
	public Entree getEntree() {
		return this.entree;
	}
	public Side getSide() {
		return this.side;
	}
	public Salad getSalad() {
		return this.salad;
	}
	public Dessert getDessert() {
		return this.dessert;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEntree(Entree entree) {
		this.entree = entree;
	}
	public void setSide(Side side) {
		this.side = side;
	}
	public void setSalad(Salad salad) {
		this.salad = salad;
	}
	public void setDessert(Dessert dessert) {
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
	public double totalPrice() {
		double totalPrice = 0;
		if (this.entree != null) {
			totalPrice += this.entree.getPrice();
		}
		if (this.side != null) {
			totalPrice += this.side.getPrice();
		}
		if (this.salad != null) {
			totalPrice += this.salad.getPrice();
		}
		if (this.dessert != null) {
			totalPrice += this.dessert.getPrice();
		}
		return totalPrice;
	}
	public String description() {
		String description = "";
		description += this.name;
		description += "\n";
		if (this.entree != null) {
			description += "Entree: " + this.entree.getName() + this.entree.getDesc() + this.entree.getPrice();
		}else {
			description += "Entree: N/A";
		}
		description += "\n";
		if (this.side != null) {
			description += "Side: " + this.side.getName() + this.side.getDesc() + this.side.getPrice();
		}else {
			description += "Side: N/A";
		}
		description += "\n";
		if (this.salad != null) {
			description += "Salad: " + this.salad.getName() + this.salad.getDesc() + this.salad.getPrice();
		}else {
			description += "Salad: N/A";
		}
		description += "\n";
		if (this.dessert != null) {
			description += "Dessert: " + this.dessert.getName() + this.dessert.getDesc() + this.dessert.getPrice();
		}else {
			description += "Dessert: N/A";
		}
		description += "\n";
		return description;
	}
	@Override
	public String toString() {
		return name;
	}
}
