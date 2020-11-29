package com.ken.practice7;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] array = new int[1000];
		int count = 0;
		for(int i = n; i <= m; i++) {
			if(isPerfectNumber(i)) {
				array[count++] = i;
			}
		}
		
		if(count == 0) {
			System.out.println();
		} else {
			for(int j = 0; j < count - 1; j++) {
				System.out.print(array[j] + " ");
			}
			System.out.println(array[count-1]);
			
		}
		
		scanner.close();
	}

	public static boolean isPerfectNumber(int a) {
		boolean flag = false;
		int[] arr = new int[1000];
		int count = 0;
		for (int i = 1; i < a; i++) {
			if(a % i == 0) {
				arr[count++] = i;
			}
		}
		int sum = 0;
		for(int i = 0; i < count; i++) {
			sum += arr[i];
		}
		if(sum == a) {
			flag = true;
		}
		return flag;
	}
}
