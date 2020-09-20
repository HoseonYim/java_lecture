package java20200920;

import java.util.Scanner;

public class Lecture03 {

	public static void main(String[] args) {
		int menuNumber = 0;
		Scanner scan = new Scanner(System.in);
		
		while(menuNumber!=100) {
			menuNumber = scan.nextInt();
			switch(menuNumber) {
			case 1:
				System.out.println("빅맥 세트입니다.");
				break;
			case 2:
				System.out.println("치즈 세트입니다.");
				break;
			case 3:
				System.out.println("멕너겟 세트입니다.");
				break;
			default:
				System.out.println("안녕하세요 맥도널드입니다.");
				break;
			}
		}
	}
}

