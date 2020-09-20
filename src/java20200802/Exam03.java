package java20200802;

public class Exam03 {

	public static void threeLines() {
		oneLine();
		oneLine();
		oneLine();
	}
	
	public static void oneLine() {
		System.out.println(">");
	}
	
	public static void main(String[] args) {
		System.out.println("Line 1");
		threeLines();
		System.out.println("Line 2");
	}

}
