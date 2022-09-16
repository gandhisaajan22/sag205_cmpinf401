package edu.pitt.sag205_Lab3;

import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		String amount = JOptionPane.showInputDialog("Please enter a distance or weight with units:");
		String[] strSplit = amount.split(" ");
		String number = strSplit[0];
		String units = strSplit[1];
		double numb = Double.parseDouble(number);
		String in = "in";
		String cm = "cm";
		String m = "m";
		String yd = "yd";
		String oz = "oz";
		String gm = "gm";
		String kg = "kg";
		if (units.equalsIgnoreCase(in)) {  //inches to centimeters
			double newNumb = 2.54 * numb;
			System.out.println(numb + " in = " + newNumb + " cm");
		}else if (units.equalsIgnoreCase(cm)) {  //centimeters to inches
			double newNumb = .393701 * numb;
			System.out.println(numb + " cm = " + newNumb + " in");
		}else if (units.equalsIgnoreCase(m)) {  //meters to yards
			double newNumb = 1.09361 * numb;
			System.out.println(numb + " m = " + newNumb + " yd");
		}else if (units.equalsIgnoreCase(yd)) {  //yards to meters
			double newNumb = .9144 * numb;
			System.out.println(numb + " yd = " + newNumb + " m");
		}else if (units.equalsIgnoreCase(oz)) {  //ounces to grams
			double newNumb = 28.3495 * numb;
			System.out.println(numb + " oz = " + newNumb + " gm");
		}else if (units.equalsIgnoreCase(gm)) {  //grams to ounces
			double newNumb = .035274 * numb;
			System.out.println(numb + " gm = " + newNumb + " oz");
		}else if (units.equalsIgnoreCase(kg)) {  //kilograms to pounds
			double newNumb = 2.20462 * numb;
			System.out.println(numb + " kg = " + newNumb + " lb");
		}else {  //pounds to kilograms
			double newNumb = .453592 * numb;
			System.out.println(numb + " lb = " + newNumb + " kg");
		}
				
			
		
	}

}
