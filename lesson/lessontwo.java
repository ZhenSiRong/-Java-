package lesson;

import java.awt.HeadlessException;
import java.util.Scanner;

public class lessontwo {

	public static void main(String[] args) {
		Scanner	inScanner = new Scanner(System.in);
		int a = inScanner.nextInt();
		int g = a%10;
		int s = (a/10)%10;
		int b = (a/100)%10;
		int q = a/1000;
		int sum = g+s+b+q;
		System.out.println(sum);
	}

}
