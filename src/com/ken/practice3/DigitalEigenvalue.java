package com.ken.practice3;

import java.util.Scanner;

public class DigitalEigenvalue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int position = 1;
		int digit = 0;
		int count = 0;
		int flag = 0;
		int result = 0;
		boolean digitFlag = false;
		boolean popsitionFlag = false;
		while(number > 0) {
			digit = number % 10;
			number = number / 10;
			digitFlag = (digit % 2 == 0);
			popsitionFlag = (position % 2 == 0);
			if( digitFlag ==  popsitionFlag) {
				flag = 1;
			} else {
				flag = 0;
			}
			position ++;
			result = result + (int) (flag * Math.pow(2, count));
			count ++;
		}
		
		System.out.println(result);
		
		scanner.close();
	}

}
