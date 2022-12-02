package edu.pitt.sag205_Lab10;

import javax.swing.JOptionPane;

public class Task1 {
	static int sumOfDigits( int x, int sum) {
		if (x == 0) {
			return sum;
		}else {
			if (x < 0) {
				x = x * -1;
			}
			sum = sum + x % 10;
			x = x/10;
			return sumOfDigits(x, sum);
		}
	}
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer:"));
		int sum = 0;
		System.out.println(sumOfDigits(x, sum));
	}

}
