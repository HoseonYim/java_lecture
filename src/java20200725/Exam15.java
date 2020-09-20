package java20200725;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int sum = 1;
		for(int i=1;i<=n;i++) {
			sum=sum*i;
		}
		System.out.printf("%d",sum);
	}

}
