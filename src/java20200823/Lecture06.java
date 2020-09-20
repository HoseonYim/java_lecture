package java20200823;

public class Lecture06 {

	public static void main(String[] args) {
		//이중 for문
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 3;j++) {
				System.out.println("i의 값은 " + i + " j의 값은 " + j);
				System.out.println("j의 1사이클");
			}
			System.out.println("i의 1사이클");
		}
	}

}
