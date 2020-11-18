package com.ken.practice2;

import java.util.Scanner;

public class SignalReport {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int signal = scanner.nextInt();
		int signalR = signal / 10;
		int signalS = signal % 10;
		switch (signalS) {//注意先输出的S
		case 1:
			System.out.print("Faint signals, barely perceptible");
			break;
		case 2:
			System.out.print("Very weak signals");
			break;
		case 3:
			System.out.print("Weak signals");
			break;
		case 4:
			System.out.print("Fair signals");
			break;
		case 5:
			System.out.print("Fairly good signals");
			break;
		case 6:
			System.out.print("Good signals");
			break;
		case 7:
			System.out.print("Moderately strong signals");
			break;
		case 8:
			System.out.print("Strong signals");
			break;
		case 9:
			System.out.print("Extremely strong signals");
			break;
		default:
			break;
		}
		switch (signalR) {//然后才输出R
		case 1:
			System.out.println(", unreadable.");
			break;
		case 2:
			System.out.println(", barely readable, occasional words distinguishable.");
			break;
		case 3:
			System.out.println(", readable with considerable difficulty.");
			break;
		case 4:
			System.out.println(", readable with practically no difficulty.");
			break;
		case 5:
			System.out.println(", perfectly readable.");
		default:
			break;
		}
		scanner.close();
	}
}
