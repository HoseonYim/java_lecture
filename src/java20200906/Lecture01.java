package java20200906;

public class Lecture01 {

	public static void main(String[] args) {
		String str = "ABCDEFGH";
		String str2 = "AAAAAA";
		
		System.out.println("���ڿ� str�� ���̴� " + str.length() +" �Դϴ�");
		
		int num1=10;
		int num2=20;
		
		if(num1 == num2) {
			System.out.println("num1�� num2�� �����ϴ�.");
		}
		
		if(str.equals(str2)) {
			System.out.println("str�� str2�� �����ϴ�.");
		}
		
		System.out.println(str.substring(1,5));
	}

}
