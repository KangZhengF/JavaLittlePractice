package com.ken.practice4;

import java.util.Scanner;

public class ReadInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int originNumber = number;
		int mode = 1;
		while(Math.abs(number) > 9) {
			mode *= 10;
			number /= 10;
		}
		int absNumber = Math.abs(originNumber);
		if (originNumber < 0) {
			System.out.print("fu ");
		}
		while(mode > 0) {
			readAInt(absNumber / mode);
			absNumber = absNumber % mode;
			
			if(mode == 1) {
				System.out.print("");
			} else {
				System.out.print(" ");
			}
			mode /= 10;
		}
		
		scanner.close();
	}
	
	public static void readAInt(int num) {
		switch (num) {
		case 1:
			System.out.print("yi");
			break;
		case 2:
			System.out.print("er");
			break;
		case 3:
			System.out.print("san");
			break;
		case 4:
			System.out.print("si");
			break;
		case 5:
			System.out.print("wu");
			break;
		case 6:
			System.out.print("liu");
			break;
		case 7:
			System.out.print("qi");
			break;
		case 8:
			System.out.print("ba");
			break;
		case 9:
			System.out.print("jiu");
			break;
		case 0:
			System.out.print("ling");
			break;
		default:
			break;
		}
	}

}
