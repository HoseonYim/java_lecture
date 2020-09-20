package java20200719;

public class Lecture03 {

	public static void main(String[] args) {
		String[] weeks  = {"월", "화", "수", "목", "금", "토", "일"};//문자열 배열 week를 선언
		
		for(int i=0;i<weeks.length;i++) {
			System.out.println("weeks의 " + i + " 번째  인덱스 값은 : " + weeks[i]);//배열의 값을 모두 프린트
		}
	}

}
