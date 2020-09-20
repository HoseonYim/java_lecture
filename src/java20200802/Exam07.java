package java20200802;

public class Exam07 {
	
	public static int Deposit(int a,int r,int n) {
		int sum=1;
		for(int i=0;i<n;i++) {
			sum=sum*(a+(a*r));
		}
		return sum;
	}

	public static void main(String[] args) {
		int a=10000000,r=3,n=5;
		System.out.printf("%d",Deposit(a,r,n));
	}

}
