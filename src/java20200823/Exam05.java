package java20200823;

public class Exam05 {

	public static void main(String[] args) {
		//1���� 100���� ����Ͻÿ�.
		//99���� 14���� ����Ͻÿ�.
		
		for(int i=1; i<=100;i++) {
			System.out.printf("%d ",i);
		}
		
		System.out.printf("\n");
		
		for(int i=99; i>=14;i--) {
			System.out.printf("%d ",i);
		}
		
		System.out.printf("\n");
		
		//2�� ���
		for(int i=1; i<=9;i++) {
			System.out.printf("2 * %d = %d ",i,i*2);
		}
	}

}
