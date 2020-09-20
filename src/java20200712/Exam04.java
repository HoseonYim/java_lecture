package java20200712;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		for(int i=0;i<b;i++) {
			for(int j=0;j<a;j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}

}
