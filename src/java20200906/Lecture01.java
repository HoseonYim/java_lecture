package java20200906;

public class Lecture01 {

	public static void main(String[] args) {
		String str = "ABCDEFGH";
		String str2 = "AAAAAA";
		
		System.out.println("문자열 str의 길이는 " + str.length() +" 입니다");
		
		int num1=10;
		int num2=20;
		
		if(num1 == num2) {
			System.out.println("num1과 num2는 같습니다.");
		}
		
		if(str.equals(str2)) {
			System.out.println("str과 str2는 같습니다.");
		}
		
		System.out.println(str.substring(1,5));
	}

}
