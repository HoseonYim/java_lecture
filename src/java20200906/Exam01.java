package java20200906;

public class Exam01 {

	public static void main(String[] args) {
		int[] weeks = { 42, 66, 57, 54, 88 };
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + weeks[i];
		}
		System.out.printf("�޸��� �ð� ����:%d��\n�޸��� �ð� ���:%d��", sum, sum / weeks.length);
	}

}
