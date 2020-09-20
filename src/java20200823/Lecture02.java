package java20200823;

public class Lecture02 {

	public static void main(String[] args) {
		
		//연산자
		int number1 = 10;
		int number2 = 14;
		
		int plus = number1 + number2;
		
		System.out.println("정수형 변수 number1 선언 : " + number1);
		System.out.println("정수형 변수 number2 선언 : " + number2);
		System.out.println("정수형 변수 number1 정수형 변수 number2의 합 : " + plus);
		
		//연산자 우선순위
		int result = 3 + 1 * (8 - 1);
		System.out.println("result의 값은 : " + result);
	}

}
