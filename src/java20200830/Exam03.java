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
			System.out.printf("성적 = %f\n학점 = A\n평가 = excllent",sum);
		}
		else if(sum>=80) {
			System.out.printf("성적 = %f\n학점 = B\n평가 = 사람이네",sum);
		}
		else {
			System.out.printf("성적 = %f\n학점 = F\n평가 = 공부에 소질이 없다.",sum);
		}
	}

}
