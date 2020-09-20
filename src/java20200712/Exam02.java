package java20200712;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		int a, b, sum=0;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		while(a<=b) {
			sum=sum+a;
			a++;
		}
		System.out.print(sum);
	}

}
