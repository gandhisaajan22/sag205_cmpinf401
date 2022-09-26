package edu.pitt.sag205_Lab4;

import javax.swing.JOptionPane;

public class Logarithm {

	public static void main(String[] args) {
		String base = JOptionPane.showInputDialog("Please enter the base value:");
		String value = JOptionPane.showInputDialog("Please enter the value you would like to calculate the log of:");
		int baseNumb = Integer.parseInt(base);
		int valueNumb = Integer.parseInt(value);
		while (baseNumb <= 1) {
			baseNumb = Integer.parseInt(JOptionPane.showInputDialog("Please enter the base value:"));
		}
		while (valueNumb <= 0) {
			valueNumb = Integer.parseInt(JOptionPane.showInputDialog("Please enter the value you would like to calculate the log of:"));
		}
		int count = 0;
		int quotient = valueNumb / baseNumb;
		while (quotient >= baseNumb) {
			quotient = quotient / baseNumb;
			count++;
		}
		count++;
		System.out.println("Your logarithm floor value is " + count);
		
	}

}
