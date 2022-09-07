package edu.pitt.sag205_Lab2;

import javax.swing.JOptionPane;

public class Part1 {
	public static void main(String[] args) {
		String sideAStr = JOptionPane.showInputDialog("Enter length of side A");
		String sideBStr = JOptionPane.showInputDialog("Enter length of side B");
		int sideA = Integer.parseInt(sideAStr);
		int sideB = Integer.parseInt(sideBStr);
		double sideASqr = Math.pow(sideA, 2);
		double sideBSqr = Math.pow(sideB, 2);
		double sideCSqr = sideASqr + sideBSqr;
		double sideC = Math.sqrt(sideCSqr);
		sideC = sideC*100;
		int c = (int) Math.round(sideC);
		c = c/100;
		String message = "The hypotenuse is " + c;
		System.out.println(message);
	}

}
