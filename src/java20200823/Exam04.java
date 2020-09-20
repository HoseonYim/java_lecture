package java20200823;

public class Exam04 {

	public static void main(String[] args) {
		int age=19;
		if(age>=19) {
			System.out.printf("%d세, 성인인증 완료 => 캔맥주가 나왔습니다.\n", age);
		}
		String resultStr = "";
		resultStr = (age >= 19) ? "성인인증 완료" : "미성년자입니다.";
		
		System.out.println(resultStr);
	}

}
