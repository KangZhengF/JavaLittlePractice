package com.ken.practice1;

import java.util.Scanner;

public class TemperatureChange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int huashi = in.nextInt();
        System.out.println((int)((huashi - 32)*5/9));
        in.close();
	}

}
