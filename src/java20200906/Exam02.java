package java20200906;

public class Exam02 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				System.out.println(array[i]);
				sum = sum + array[i];
			}
		}
		System.out.println(sum);
	}

}
