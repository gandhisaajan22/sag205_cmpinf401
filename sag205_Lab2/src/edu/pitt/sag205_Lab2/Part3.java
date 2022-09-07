package edu.pitt.sag205_Lab2;

import javax.swing.JOptionPane;

public class Part3 {

	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("Enter the amount of money between 1 and 9999 dollars");
		int numb = Integer.parseInt(number);
		int grands = numb/1000;
		int benjamins = (numb%1000)/100;
		int sawbucks = ((numb%1000)%100)/10;
		int bucks = (((numb%1000)%100)%10);
		String messageG = grands + " grands";
		String messageB = benjamins + " benjamins";
		String messageS = sawbucks + " sawbucks";
		String messageBucks = bucks + " bucks";
		System.out.println(messageG);
		System.out.println(messageB);
		System.out.println(messageS);
		System.out.println(messageBucks);
		

	}

}
