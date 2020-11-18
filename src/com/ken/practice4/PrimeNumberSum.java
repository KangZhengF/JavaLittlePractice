package com.ken.practice4;

import java.util.Scanner;

public class PrimeNumberSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		boolean flag;
		int count = 0;
		int sum = 0;
		
		for(int i = 2; count <= m ; i++) {
			flag = true;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				count ++;
				if(count >= n && count <= m) {
					sum += i;
				}
			}
		}
		
		System.out.println(sum);
		
		scanner.close();

	}

}
