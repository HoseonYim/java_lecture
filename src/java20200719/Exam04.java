package java20200719;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.printf("���θ� �Է��ϼ��� : ");
		a = scan.nextInt();
		System.out.printf("���θ� �Է��ϼ��� : ");
		b = scan.nextInt();
		if(a==b) {
			System.out.printf("���簢���Դϴ�.\n");
		}
		else {
			System.out.printf("���簢���Դϴ�.\n");
		}
		for(int i=0;i<b;i++) {
			for(int j=0;j<a;j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}

}
