package java20200719;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.printf("가로를 입력하세요 : ");
		a = scan.nextInt();
		System.out.printf("세로를 입력하세요 : ");
		b = scan.nextInt();
		if(a==b) {
			System.out.printf("정사각형입니다.\n");
		}
		else {
			System.out.printf("직사각형입니다.\n");
		}
		for(int i=0;i<b;i++) {
			for(int j=0;j<a;j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}

}
