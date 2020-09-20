package java20200830;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		int n_length;
		int m=0;
		while((int)(Math.log10(num)+1) > 0) {
			n_length = (int)(Math.log10(num)+1);
			m=0;
			while((int)(Math.log10(num)+1)>n_length-1) {
				num = num - (int)(Math.pow(10, n_length-1));
				m++;
			}
			System.out.printf("%d¿ø = %d\n",(int)(Math.pow(10, n_length-1)),m);
		}
	}

}
