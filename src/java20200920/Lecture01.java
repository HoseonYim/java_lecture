package java20200920;

public class Lecture01 {

	public static void main(String[] args) {
		
		int state = 0;
		int plusVariable = 0;
		
		while(state<100) {
			++state;
			plusVariable += state;
		}
		
		System.out.println(plusVariable);
	}
}
