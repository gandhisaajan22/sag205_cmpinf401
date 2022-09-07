package edu.pitt.sag205_Lab2;

import javax.swing.JOptionPane;

public class Part2 {
	public static void main(String[] args) {
		String radius = JOptionPane.showInputDialog("Enter the radius");
		int rad = Integer.parseInt(radius);
		double r = rad;
		double perimeter = 2 * Math.PI * r;
		double area = Math.PI * r * r;
		perimeter = perimeter * 100;
		int p = (int) Math.round(perimeter);
		p = p/100;
		area = area * 100;
		int a = (int) Math.round(area);
		a = a/100;
		String message = "The cirle with radius " + r + " has an area of " + a + " and a perimeter of " + p;
		System.out.println(message);
	}

}
