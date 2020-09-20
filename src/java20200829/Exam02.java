package java20200829;

public class Exam02 {

	public static void main(String[] args) {
		int sum=0, i;
		for(i=1;i<1000;i++) {
			if(i%3==0) {
				sum=sum+i;
			}
			else if(i%5==0) {
				sum=sum+i;
			}
		}
		System.out.printf("%d",sum);
	}

}
