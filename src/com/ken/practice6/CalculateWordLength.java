package com.ken.practice6;

import java.util.Scanner;

public class CalculateWordLength {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String[] subStrings = string.split("[\\s.]+");
		for(int i = 0; i < subStrings.length - 1; i++) {
			System.out.print(subStrings[i].length() + " ");
		}
		System.out.print(subStrings[subStrings.length - 1].length());
		scanner.close();
	}

}
