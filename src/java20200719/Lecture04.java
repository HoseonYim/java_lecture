package java20200719;

public class Lecture04 {

	public static void main(String[] args) {
		int[] numberArr = new int [10];
		String[] strArr = new String [3];
		
		numberArr[3] = 14;
		for(int i=0;i<numberArr.length;i++) {
			System.out.println("numberArr�� " + i + " ��°  �ε��� ���� : " + numberArr[i]);
		}
		
		strArr[0] = "��ȣ��";
		for(int i=0;i<strArr.length;i++) {
			System.out.println("strArr�� " + i + " ��°  �ε��� ���� : " + strArr[i]);//�迭�� ���� ��� ����Ʈ
		}
	}

}
