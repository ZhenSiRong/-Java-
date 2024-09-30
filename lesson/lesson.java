package lesson;

import java.util.Scanner;


public class lesson {

	public static void main(String[] args) {
		long n=999999999; 
		int week=0;
		int day=0;
		int times=0;
		Scanner inputScanner = new Scanner(System.in);
		int input = inputScanner.nextInt();
		
		//接收一个整数，取7的余，
//		day = input/7;
//		times=1;
//		while(day>7) {
//			day = input/7;
//			times++;
//			week = times;
//		}
		
		week= input/7 +1;
		day = input%7;
			
		System.out.println(week+"\t"+day);
		}
		
}
