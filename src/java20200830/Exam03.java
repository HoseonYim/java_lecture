package java20200830;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		double sum;
		sum = (double)((Math.round((a+b+c+d)/4)*100)/100);
		if(sum>=90) {
			System.out.printf("���� = %f\n���� = A\n�� = excllent",sum);
		}
		else if(sum>=80) {
			System.out.printf("���� = %f\n���� = B\n�� = ����̳�",sum);
		}
		else {
			System.out.printf("���� = %f\n���� = F\n�� = ���ο� ������ ����.",sum);
		}
	}

}
