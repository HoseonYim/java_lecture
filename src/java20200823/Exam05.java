package java20200823;

public class Exam05 {

	public static void main(String[] args) {
		//1부터 100까지 출력하시오.
		//99부터 14까지 출력하시오.
		
		for(int i=1; i<=100;i++) {
			System.out.printf("%d ",i);
		}
		
		System.out.printf("\n");
		
		for(int i=99; i>=14;i--) {
			System.out.printf("%d ",i);
		}
		
		System.out.printf("\n");
		
		//2단 출력
		for(int i=1; i<=9;i++) {
			System.out.printf("2 * %d = %d ",i,i*2);
		}
	}

}
