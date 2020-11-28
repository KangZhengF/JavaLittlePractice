package com.ken.practice7;

import java.util.Scanner;

public class FactorizationPrimeFactor {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(!isPrime(number)) {
			System.out.print(number + "=");
			int[] array = new int[20];
			int count = 0;
			int factor;
			while(number != 1) {
				factor = devide(number);
				array[count++] = factor;
				number = number / factor;
			}
			for(int i = 0; i < count - 1; i++ ) {
				System.out.print(array[i]+"x");
			}
			System.out.println(array[count-1]);
		} else {
			System.out.println(number + "=" + number);
		}		
		scanner.close();
	}
	
	
	public static int devide(int a) {
		int remainder;
		int result = a;
		for(int factor = 2; factor <= Math.sqrt(a); factor++) {
			remainder = a % factor;
			if(remainder == 0) {
				result = factor;
				break;
			}
		}
		return result;
	}
	
	public static boolean isPrime(int n) {
		boolean flag = true;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
}
