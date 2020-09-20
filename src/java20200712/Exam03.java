package java20200712;

public class Exam03 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			System.out.printf("2 * %d = %d ",i,i*2);
		}
		System.out.printf("\n");
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d ",i,j,i*j);
			}
		}
		System.out.printf("\n");
		for(int i=2;i<=9;i++) {
			System.out.printf("%d * 1 = %d ",i,i);
		}
	}

}
