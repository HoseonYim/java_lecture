package java20200719;

public class Lecture02 {

	public static void main(String[] args) {
		int[] numberArr = {1,2,3,10,14,6};// ũ�Ⱑ 6�� numberArr
		System.out.println("numberArr�� �ּ� ���� : " + numberArr);
		System.out.println("numberArr�� 0 ��° �ε��� ���� : " + numberArr[0]);
		
		System.out.println("numberArr�� ũ�� : " + numberArr.length);//�迭.length�� �ϸ� �迭�� ���̸� �� �� �ִ�
		
		numberArr[5] = 100;//5��° �ε����� 100�� �߰�
		
		for(int i=0;i<numberArr.length;i++) {
			System.out.println("numberArr�� " + i + " ��°  �ε��� ���� : " + numberArr[i]);//�迭�� ���� ��� ����Ʈ
		}
		
	}

}
