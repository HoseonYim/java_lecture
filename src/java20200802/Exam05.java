package java20200802;

public class Exam05 {
	
	public static double F(double a,double b) {
		return b/a;
	}

	public static void main(String[] args) {
		double l = 8.86;
		double km = 182.736;
		System.out.printf("%fkm/L",F(l,km));
	}

}
