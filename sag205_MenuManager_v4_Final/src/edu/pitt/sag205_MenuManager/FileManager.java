package edu.pitt.sag205_MenuManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 * FileManager
 * @author saajangandhi
 * 11/4/2022
 */

public class FileManager {
	@SuppressWarnings("unchecked")
	public static ArrayList<MenuItem>readItems(String fileName){
		ArrayList<String>list = new ArrayList<String>();
		ArrayList<MenuItem>menuItems = new ArrayList<MenuItem>();
		String s = null;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			while((s = br.readLine()) != null) {
				list.add(s); 
			}
			for(String line : list) {
				String [] res = line.split("@@");
				if(res[1].equals("dessert")) {
					Dessert d=new Dessert(res[0],res[2], Integer.valueOf(res[3]), Double.valueOf(res[4]));
					menuItems.addAll((Collection<? extends MenuItem>) d);
				}else if(res[1].equals("entree")) {
					Entree e=new Entree(res[0],res[2], Integer.valueOf(res[3]), Double.valueOf(res[4]));
					menuItems.addAll((Collection<? extends MenuItem>) e);
				}else if(res[1].equals("salad")) {
					Salad sa=new Salad(res[0],res[2], Integer.valueOf(res[3]), Double.valueOf(res[4]));
					menuItems.addAll((Collection<? extends MenuItem>) sa);
				}else if(res[1].equals("side")) {
					Side si=new Side(res[0],res[2], Integer.valueOf(res[3]), Double.valueOf(res[4]));
					menuItems.addAll((Collection<? extends MenuItem>) si);
				}
			}
			br.close();
			fr.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return menuItems;
	}
	public static void writeMenus(String fileName, ArrayList<Menu>menus) {
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0; i < menus.size(); i++) {
				bw.write(menus.get(i).description() + "\n" + "Total calories: " + menus.get(i).totalCalories() + "\n" + "Total price: " + menus.get(i).totalPrice() + "\n");
				bw.newLine();
			}
			bw.close();
			fw.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
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
				entree = new Entree(name[0], name[1], Integer.parseInt(name[2]), Integer.parseInt(name[3]));
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
				side = new Side(name[0], name[1], Integer.parseInt(name[2]), Integer.parseInt(name[3]));
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
				salad = new Salad(name[0], name[1], Integer.parseInt(name[2]), Integer.parseInt(name[3]));
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
				dessert = new Dessert(name[0], name[1], Integer.parseInt(name[2]), Integer.parseInt(name[3]));
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
