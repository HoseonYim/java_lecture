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
				System.out.println("��� ��Ʈ�Դϴ�.");
				break;
			case 2:
				System.out.println("ġ�� ��Ʈ�Դϴ�.");
				break;
			case 3:
				System.out.println("�߳ʰ� ��Ʈ�Դϴ�.");
				break;
			default:
				System.out.println("�ȳ��ϼ��� �Ƶ��ε��Դϴ�.");
				break;
			}
		}
	}
}

