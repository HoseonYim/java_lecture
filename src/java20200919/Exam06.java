package java20200919;

import java.util.Scanner;

public class Exam06 {
	public static double method(double a, double b) {
		return b/a;
	}

	public static void main(String[] args) {
		double a,b;
		Scanner scan = new Scanner(System.in);
		a = scan.nextDouble();
		b = scan.nextDouble();
		System.out.printf("%f",method(a,b));
	}

}
