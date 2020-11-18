package com.ken.practice2;

import java.util.Scanner;

public class TimeChange {//提交的时候类名改为Main
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bjt = scanner.nextInt();
		if(0 <= bjt && bjt <= 2359) {
			int condition = (bjt / 100) -8;//用来判断是否需要跨日期
			int utcMinute = bjt % 100; //用来判断分钟的位数
			int utcHour = condition;
			
			if(condition < 0) { //表示需要跨日期
				utcHour = condition +24;//补上小时
				if(utcMinute < 9) {//如果分钟只有一位数
					System.out.println(utcHour + "0" + utcMinute);
				} else {
					System.out.println(utcHour + "" + utcMinute);
				}
			} else if (condition == 0) { //如果刚好不需要跨日期
				System.out.println(utcMinute); //直接输出
			} else {
				if(utcMinute < 9) {
					System.out.println(utcHour + "0" + utcMinute);
				} else {
					System.out.println(utcHour + "" + utcMinute);
				}
			}
		}
		scanner.close();
	}
}
