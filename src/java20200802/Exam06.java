package java20200802;

import java.util.Scanner;

public class Exam06 {
	
	public static String grade(int s) {
		if(s>=95) {
			return "A+";
		}
		else if(s>=90) {
			return "A0";
		}
		else if(s>=80) {
			return "B";
		}
		else if(s>=70) {
			return "B0";
		}
		else {
			return "C";
		}
	}

	public static void main(String[] args) {
		int score;
		Scanner scan = new Scanner(System.in);
		score=scan.nextInt();
		System.out.printf("%s",grade(score));
	}

}
