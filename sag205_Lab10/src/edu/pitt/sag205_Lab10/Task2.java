package edu.pitt.sag205_Lab10;

public class Task2 {
	static void printArrayElements(int a[], int index) {
		if(index == 1) {
			System.out.println(a[index - 1]);
		}else {
			printArrayElements(a, (index - 1));
			System.out.println(a[index - 1]);
		}
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		printArrayElements(a, 5);
	}

}
