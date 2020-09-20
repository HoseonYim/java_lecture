package java20200919;

import java.util.Scanner;

public class Exam01 {
	public static int cube(int num) {
		int sum=1;
		for(int i=0;i<num;i++) {
			sum=sum*num;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		num = scan.nextInt();
		System.out.printf("%d",cube(num));
	}

}
