package java20200913;

public class Lecture01 {
	
	public static int plusMethod(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
	}
	public static int minusMethod(int num1, int num2) {
		int result = num1 - num2;
		
		return result;
	}
	public static int multiMethod(int num1, int num2) {
		int result = num1 * num2;
		
		return result;
	}
	public static int dividMethod(int num1, int num2) {
		int result = num1 / num2;
		
		return result;
	}

	public static void main(String[] args) {
		int plus = plusMethod(14,7);
		int minus = minusMethod(14,7);
		int multi = multiMethod(14,7);
		int divid = dividMethod(14,7);
		System.out.printf("%d %d %d %d", plus, minus, multi, divid);
	}

}
