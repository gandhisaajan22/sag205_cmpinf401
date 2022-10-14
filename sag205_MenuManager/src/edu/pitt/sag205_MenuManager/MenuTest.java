package edu.pitt.sag205_MenuManager;

/**
 * Class MenuTest
 * @author saajangandhi
 * 10/14/2022
 * Calorie values are estimated
 */

public class MenuTest {
	public static void main(String[] args) {
		Entree entreeFirst = new Entree("Roasted Chili Chicken: ", 250, "A beautifully roasted chicken breast in a savory and spicy chili lime sauce");
		Entree entreeSecond = new Entree("New York Strip Steak: ", 300, "A tender cut of fatty flavorful beef with a drizzling of chimichurri sauce");
		Side sideFirst = new Side("Mashed Potatoes: ", 350, "Creamy garlic and cheddar potatoes perfectly boiled and mashed");
		Salad saladFirst = new Salad("Caesar Salad: ", 175, "Classic butter lettuce mix topped with croutons, shaved parmesan, and freshly made caesar dressing");
		Salad saladSecond = new Salad("Cobb Salad: ", 235, "A mix of greens, fresh veggies, croutons, crispy bacon, and our house special red wine vinaigrette");
		Dessert dessertFirst = new Dessert("Brownie with Vanilla Ice Cream: ", 650, "A delicious rich chocolatey brownie with creamy vanilla ice cream on top");
		
		System.out.println("________________________________________________________________________________________________________________________________________");
		
		Menu menuFirst = new Menu("Professor Babichenko's Lunch", entreeFirst, saladFirst);
		System.out.println(menuFirst.description());
		System.out.println(menuFirst.totalCalories());
		
		System.out.println("________________________________________________________________________________________________________________________________________");
		
		Menu menuSecond = new Menu("Saajan's Dinner", entreeSecond, sideFirst, saladSecond, dessertFirst);
		System.out.println(menuSecond.description());
		System.out.println(menuSecond.totalCalories());
		
		System.out.println("________________________________________________________________________________________________________________________________________");
	}
}
