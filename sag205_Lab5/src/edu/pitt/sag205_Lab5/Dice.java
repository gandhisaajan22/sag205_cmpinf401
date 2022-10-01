package edu.pitt.sag205_Lab5;

import java.util.Random;
import java.util.Scanner;

public class Dice {
	private static int[] counter;
	
	public Dice() {
		counter = new int[11];
	}
	
	public static void rollDice(int times, Random rand) {
		for (int index = 0; counter.length > index; index++) {
			counter[index] = 0;
		}
		int oneDie = 0;
		int twoDie = 0;
		for (int count = 1; times >= count; count++) {
			oneDie = rand.nextInt(6) + 1;
			twoDie = rand.nextInt(6) + 1;
			int sum = oneDie + twoDie;
			counter[sum - 2] += 1;
		}
		System.out.println(String.format("%-4s%10s", "#", "Probability"));
		for (int index = 0; counter.length > index; index++) {
			System.out.println(String.format("%-4d%-10.4f", index + 2, 1.0 * counter[index] / times));
		}
	}

	public static void main(String[] args) {
		
		java.util.Scanner scan = new Scanner(System.in);
		Dice numb = new Dice();
		Random rand = new Random();
		while (true) {
			System.out.print("Please enter how many times you would like to roll the dice: ");
			int times = scan.nextInt();
			numb.rollDice(times, rand);
			System.out.print("Would you like to continue rolling the dice? Please enter yes or no: ");
			scan.nextLine();
			if (scan.nextLine().equalsIgnoreCase("yes")) {
				continue;
			}else {
				break;
			}
		}

	}

}
