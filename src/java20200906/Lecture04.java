package java20200906;

public class Lecture04 {

	public static void main(String[] args) {
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		
		String[] weeks2 = new String[7];
		weeks2[0]= "월";
		weeks2[1]= "화";
		weeks2[2]= "수";
		weeks2[3]= "목";
		weeks2[4]= "금";
		weeks2[5]= "토";
		weeks2[6]= "일";
		
		for(int i=0;i<7;i++) {
			System.out.printf("weeks의 %d번째 인덱스의 값은 %s이다.\n", i,weeks[i]);
		}
		for(int i=0;i<7;i++) {
			System.out.printf("weeks2의 %d번째 인덱스의 값은 %s이다.\n", i,weeks2[i]);
		}
	}

}
