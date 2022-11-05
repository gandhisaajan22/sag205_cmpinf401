package edu.pitt.sag205_MenuManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * FileManager
 * @author saajangandhi
 * 11/4/2022
 */

public class FileManager {
	public static ArrayList<Entree>readEntrees(String fileName){
		/**
		 * Method readEntrees
		 * @param a a String fileName
		 * Returns an ArrayList from reading the file
		 */
		ArrayList<Entree>entrees = new ArrayList<Entree>();
		try {
			FileReader fileRead = new FileReader(fileName);
			BufferedReader buffRead = new BufferedReader(fileRead);
			Entree entree = null;
			String str;
			while((str = buffRead.readLine()) != null) {
				String[] name = str.split("@@");
				entree = new Entree(name[0], name[1], Integer.parseInt(name[2]));
				entrees.add(entree);
			}
			buffRead.close();
			fileRead.close();
		}catch(Exception e) {
			System.out.println("errora");
		}
		return entrees;
	}
	public static ArrayList<Side>readSides(String fileName){
		/**
		 * Method readSides
		 * @param a a String fileName
		 * Returns an ArrayList from reading the file
		 */
		ArrayList<Side>sides = new ArrayList<Side>();
		try {
			FileReader fileRead = new FileReader(fileName);
			BufferedReader buffRead = new BufferedReader(fileRead);
			Side side = null;
			String str;
			while((str = buffRead.readLine()) != null) {
				String[] name = str.split("@@");
				side = new Side(name[0], name[1], Integer.parseInt(name[2]));
				sides.add(side);
			}
			buffRead.close();
			fileRead.close();
		}catch(Exception e) {
			System.out.println("errorb"); 
		}
		return sides;
	}
	public static ArrayList<Salad>readSalads(String fileName){
		/**
		 * Method readSalads
		 * @param a a String fileName
		 * Returns an ArrayList from reading the file
		 */
		ArrayList<Salad>salads = new ArrayList<Salad>();
		try {
			FileReader fileRead = new FileReader(fileName);
			BufferedReader buffRead = new BufferedReader(fileRead);
			Salad salad = null;
			String str;
			while((str = buffRead.readLine()) != null) {
				String[] name = str.split("@@");
				salad = new Salad(name[0], name[1], Integer.parseInt(name[2]));
				salads.add(salad);
			}
			buffRead.close();
			fileRead.close();
		}catch(Exception n) {
			System.out.println("errorc");
		}
		return salads;
	}
	public static ArrayList<Dessert>readDesserts(String fileName){
		/**
		 * Method readDesserts
		 * @param a a String fileName
		 * Returns an ArrayList from reading the file
		 */
		ArrayList<Dessert>desserts = new ArrayList<Dessert>();
		try {
			FileReader fileRead = new FileReader(fileName);
			BufferedReader buffRead = new BufferedReader(fileRead);
			Dessert dessert = null;
			String str;
			while((str = buffRead.readLine()) != null) {
				String[] name = str.split("@@");
				dessert = new Dessert(name[0], name[1], Integer.parseInt(name[2]));
				desserts.add(dessert);
			}
			buffRead.close();
			fileRead.close();
		}catch(Exception n) {
			System.out.println("errord");
		}
		return desserts;
	}
}
