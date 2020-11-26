package com.ken.practice5;

import java.util.Scanner;

public class PolynomialAddition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] polynomialA = new int[101];
		int n;
		int number;
		int count = 0;
		do {
			n = scanner.nextInt();
			number = scanner.nextInt();
			polynomialA[n] = number;
			count ++;
		}while(n != 0);

		do {
			n = scanner.nextInt();
			number = scanner.nextInt();
			if(polynomialA[n] == 0 && number != 0) {
				count ++;
			}
			polynomialA[n] = number + polynomialA[n];
		}while(n != 0);
		boolean flag = true;
		for(int i = 100; i >= 0 ; i--) {
			if(polynomialA[i] != 0) {
				//下面是自己写的用不了
//				if(count > 0 && flag == false) {
//					if(polynomialA[i] > 0) {
//						System.out.print("+");
//					}
//					count--;
//				}
//				if(polynomialA[i] != 1) {
//					System.out.print(polynomialA[i]);
//				}
//				if(i > 1) {
//					System.out.print("x" + i);
//				} else if (i == 1) {
//					System.out.print("x");
//				} else {
//					System.out.print(polynomialA[i]);
//				}
//				flag = false;
				//下面是网上的代码
				if (!flag && polynomialA[i] > 0)//第一次进入循环为true不带加号
					System.out.print("+");
				if (i == 0)//幂为零的情况
					System.out.print(polynomialA[i]);
				if(i > 1 && polynomialA[i] != 1)
					System.out.print(polynomialA[i] + "x" + i);
				if(i > 1 && polynomialA[i] == 1)//系数为1的情况
					System.out.print("x" + i);
				if(i == 1 && polynomialA[i] != 1)//幂数为1的情况下
					System.out.print(polynomialA[i] + "x");
				if(i == 1 && polynomialA[i] == 1)//幂数系数都为1的情况
					System.out.print("x");
				flag = false;//保证第一次循环后上面那个加号可以启用
			}
		}
		//这个也是网上找的自己没有想到
		if(flag) //如果没有输入输出0
			System.out.print(0);
		scanner.close();
	}
}