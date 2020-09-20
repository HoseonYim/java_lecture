package java20200725;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.printf("점수입력:");
		a = scan.nextInt();
		if(a>0&&a<100) {
			System.out.printf("입력된값:%d",a);
		}
		else {
			System.out.printf("입력오류");
		}
	}

}
