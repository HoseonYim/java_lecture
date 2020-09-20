package java20200712;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		while(n>0) {
			sum = sum + n%10;
			n = n/10;
		}
		System.out.print(sum);
	}

}
