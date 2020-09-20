package java20200802;

import java.util.Scanner;

public class Exam01 {

	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static int min(int a, int b) {
		return a-b;
	}
	
	public static int mul(int a, int b) {
		return a*b;
	}
	
	public static int div(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.printf("%d+%d=%d\n%d-%d=%d\n%d*%d=%d\n%d/%d=%d",a,b,plus(a,b),a,b,min(a,b),a,b,mul(a,b),a,b,div(a,b));
	}
}
