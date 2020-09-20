package java20200920;

public class Exam02 {

	public static void main(String[] args) {
		int i=2, j=1;
		while(i<=9) {
			while(j<=9) {
				System.out.printf("%d*%d=%d ", i,j,i*j);
				j++;
			}
			System.out.printf("\n");
			i++;
			j=1;
		}
	}

}
