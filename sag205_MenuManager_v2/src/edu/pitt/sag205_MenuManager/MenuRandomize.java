package edu.pitt.sag205_MenuManager;

import java.util.ArrayList;

/**
 * MenuRandomize
 * @author saajangandhi
 * 11/4/2022
 */

public class MenuRandomize {
	private ArrayList<Entree>entrees;
	private ArrayList<Side>sides;
	private ArrayList<Salad>salads;
	private ArrayList<Dessert>desserts;
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		/**
		 * Method MenuRandomize
		 * @param a a String entreeFile
		 * @param b a String sideFile
		 * @param c a String saladFile
		 * @param d a String dessertFile
		 * Reads the file to a new array list using FileManager
		 */
		entrees = FileManager.readEntrees(entreeFile);
		sides = FileManager.readSides(sideFile);
		salads = FileManager.readSalads(saladFile);
		desserts = FileManager.readDesserts(dessertFile);
	}
	public Menu randomMenu() {
		/**
		 * Method randomMenu
		 * @param a an ArrayList
		 * @param b an ArrayList
		 * @param c an ArrayList
		 * @param d an ArrayList
		 * Returns a random selection of Entree, Side, Salad, Dessert
		 */
		Menu rand = new Menu("Random Menu");
		rand.setEntree(entrees.get((int)(5 * Math.random())));
		rand.setSide(sides.get((int)(5 * Math.random())));
		rand.setSalad(salads.get((int)(5 * Math.random())));
		rand.setDessert(desserts.get((int)(5 * Math.random())));
		return rand;
	}
}
