package java20200719;

public class Lecture02 {

	public static void main(String[] args) {
		int[] numberArr = {1,2,3,10,14,6};// 크기가 6인 numberArr
		System.out.println("numberArr의 주소 값은 : " + numberArr);
		System.out.println("numberArr의 0 번째 인덱스 값은 : " + numberArr[0]);
		
		System.out.println("numberArr의 크기 : " + numberArr.length);//배열.length를 하면 배열의 길이를 알 수 있다
		
		numberArr[5] = 100;//5번째 인덱스에 100을 추가
		
		for(int i=0;i<numberArr.length;i++) {
			System.out.println("numberArr의 " + i + " 번째  인덱스 값은 : " + numberArr[i]);//배열의 값을 모두 프린트
		}
		
	}

}
