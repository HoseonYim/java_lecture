package java20200913;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
		int sum = a + b + c;
		if (sum >= 29) {
			System.out.printf("S");
		} else if (sum >= 20) {
			System.out.printf("A");
		} else if (sum >= 15) {
			System.out.printf("B");
		} else {
			System.out.printf("ЦѓБо");
		}
	}

}
