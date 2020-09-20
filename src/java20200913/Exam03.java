package java20200913;

import java.util.Scanner;

public class Exam03 {

	public static char calculateMethod(int num) {
		char grade;
		if (num >= 100) {
			grade = 'S';
		} else if (num >= 95) {
			grade = 'A';
		} else if (num >= 90) {
			grade = 'B';
		} else if (num >= 85) {
			grade = 'C';
		} else if (num >= 80) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		return grade;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.printf("%c", calculateMethod(num));
	}

}
