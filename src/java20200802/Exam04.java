package java20200802;

import java.util.Scanner;

public class Exam04 {
	
	public static double kcal(int a) {
		return (double)a*0.02;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		a=scan.nextInt();
		System.out.printf("%d걸음을 걸었을때 %fkcal가 소모된다.",a,kcal(a));
		
	}

}
