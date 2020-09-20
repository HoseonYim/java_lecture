package java20200802;

import java.util.Scanner;

public class Exam02 {
	public static int cal(int a, int b, char type) {
		if(type=='p') {
			return a+b;
		}
		else if(type=='s') {
			return a-b;
		}
		else if(type=='m') {
			return a*b;
		}
		else {
			return a/b;
		}
	}

	public static void main(String[] args) {
		int a,b;
		char type;
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		type=scan.next().charAt(0);
		System.out.printf("%d",cal(a,b,type));
		
	}

}
