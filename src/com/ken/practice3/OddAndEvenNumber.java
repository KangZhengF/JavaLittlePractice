package com.ken.practice3;

import java.util.Scanner;

public class OddAndEvenNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int oddNumber = 0;//奇数个数
		int evenNumber = 0;//偶数个数
		
		while(true) {
			i = scanner.nextInt();
			if(i != -1) { 
				if(i % 2 != 0) { 
					oddNumber ++; 
				} else { 
					evenNumber ++; 
				} 
			} else {
				break; 
			}
	   }
		 
			
		System.out.print(oddNumber + " " + evenNumber);
		scanner.close();
	}
}
