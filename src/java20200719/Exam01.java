package java20200719;

public class Exam01 {

	public static void main(String[] args) {
		int i,j;
		for(i=2;i<=9;i++) {
			for(j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d ",i,j,i*j);
			}
			System.out.printf("\n");
		}
	}

}
