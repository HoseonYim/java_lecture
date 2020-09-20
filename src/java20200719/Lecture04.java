package java20200719;

public class Lecture04 {

	public static void main(String[] args) {
		int[] numberArr = new int [10];
		String[] strArr = new String [3];
		
		numberArr[3] = 14;
		for(int i=0;i<numberArr.length;i++) {
			System.out.println("numberArr의 " + i + " 번째  인덱스 값은 : " + numberArr[i]);
		}
		
		strArr[0] = "임호선";
		for(int i=0;i<strArr.length;i++) {
			System.out.println("strArr의 " + i + " 번째  인덱스 값은 : " + strArr[i]);//배열의 값을 모두 프린트
		}
	}

}
