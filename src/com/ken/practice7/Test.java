package com.ken.practice7;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n,i=0;
		n=in.nextInt();
		while(n>0) {
			n=n/2;
			i++;
		}
		if(n<0) {
			System.out.print(0);
		} else {
			System.out.print(32-i);
		}
		in.close();	
	}
}
