package com.ken.practice6;

import java.util.Scanner;

public class GPSDataProcess {
	 
		public static boolean IsEffective(String str) {
			
			boolean retVal = false;
			String  substr =str.substring(str.indexOf('$')+1, str.indexOf('*'));
			String  StrCheckval =str.substring(str.indexOf('*')+1);	
			int CheckVal = Integer.parseInt(StrCheckval, 16);
			int CalcCheckval = substr.charAt(0)^substr.charAt(1);

			for(int i=2;i<substr.length();i++) {
				CalcCheckval = CalcCheckval^substr.charAt(i); 
			}
			
			CalcCheckval = CalcCheckval%65536;
			
			if(CheckVal == CalcCheckval)
				retVal = true;

			return retVal;
		}
	 
		public static void printTime(String str) {
			//024813.640

			if (!str.isEmpty()) {
				String strhh = str.substring(0, 2);
				String strmm = str.substring(2, 4);
				String strss = str.substring(4, 6);

				Integer bjhh = Integer.parseInt(strhh)+8 ;		
			   
			    if(bjhh > 24) 
			    	bjhh -= 24;
			   	
			    strhh = bjhh.toString();
			    
			    if (strhh.length() == 1)
			    	strhh = "0"+strhh;
				System.out.print(strhh + ":" + strmm + ":" + strss);
			}
		}
		
		public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
			
			String str = in.nextLine();
		
			String strTime = null;
			while(!str.equals("END")) {
				String  substr =str.substring(0, 6);
				if (substr.equals("$GPRMC")) {
					if (IsEffective(str)) {
						String[]  strs = str.split(",");
						strTime = strs[1];
					}
				}
				str = in.nextLine();
			}
		
			printTime(strTime);
			
			in.close();
		}
		
}
