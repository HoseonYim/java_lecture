package java20200919;

import java.util.Scanner;

public class Exam02 {
	public static double cylinder(int r, int h){
		double sum;
		sum = r*r*3.1415*h;
		return sum;
	}
	
	public static void main(String[] args) {
		int r, h;
		Scanner scan = new Scanner(System.in);
		r = scan.nextInt();
		h = scan.nextInt();
		System.out.printf("%f",cylinder(r,h));
	}

}
