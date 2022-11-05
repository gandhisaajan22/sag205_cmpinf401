package edu.pitt.sag205_MenuManager;

/**
 * Class MenuTest
 * @author saajangandhi
 * 10/14/2022
 * Calorie values are estimated
 */

public class MenuTest {
	public static void main(String[] args) {
		Entree entreeFirst = new Entree("Roasted Chili Chicken: ", "A beautifully roasted chicken breast in a savory and spicy chili lime sauce", 250);
		Entree entreeSecond = new Entree("New York Strip Steak: ", "A tender cut of fatty flavorful beef with a drizzling of chimichurri sauce", 300);
		Side sideFirst = new Side("Mashed Potatoes: ", "Creamy garlic and cheddar potatoes perfectly boiled and mashed", 350);
		Salad saladFirst = new Salad("Caesar Salad: ", "Classic butter lettuce mix topped with croutons, shaved parmesan, and freshly made caesar dressing", 175);
		Dessert dessertFirst = new Dessert("Brownie with Vanilla Ice Cream: ", "A delicious rich chocolatey brownie with creamy vanilla ice cream on top", 650);
		
		System.out.println("________________________________________________________________________________________________________________________________________");
		
		Menu menuFirst = new Menu("Professor Babichenko's Lunch", entreeFirst, sideFirst);
		System.out.println(menuFirst.description());
		System.out.println(menuFirst.totalCalories());
		
		System.out.println("________________________________________________________________________________________________________________________________________");
		
		Menu menuSecond = new Menu("Saajan's Dinner", entreeSecond, sideFirst, saladFirst, dessertFirst);
		System.out.println(menuSecond.description());
		System.out.println(menuSecond.totalCalories());
		
		System.out.println("________________________________________________________________________________________________________________________________________");
	}
}
