package java20200823;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		a=scan.nextInt();
		b=scan.nextInt();
		long answer = 0;
        int i=0;
        for(i=a;i<=b;i++){
            answer=answer+i;
        }
        System.out.printf("%d",answer);
	}

}
