package java20200906;

public class Lecture03 {

	public static void main(String[] args) {
		int[] odd = {1,3,5,7,9};
		
		int[] even = {2,4,6,8};
		
		System.out.println(odd);
		
		System.out.println(odd[1]);
		System.out.println(odd[0]);
		
		for(int i=0;i<5;i++) {
			System.out.println("odd �ε��� "+i+"�� ����: "+ odd[i]);
		}
		
		System.out.println("odd �迭�� ũ�� : "+ odd.length);
		
		for(int i=0;i<4;i++) {
			System.out.println("even �ε��� "+i+"�� ����: "+ even[i]);
		}
	}

}
