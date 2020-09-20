package java20200830;

public class Exam01 {

	public static void main(String[] args) {
		int i = 3;
		
		int j = 0;
		
		j = i++;
		
		System.out.println("1 : " + i);
		System.out.println("2 : " + j);
		
		j = i - j;
		
		System.out.println("3 : " + -i);
		System.out.println("4 : " + (j = -j));
		
		i++;
		
		++j;
		
		System.out.println("5 : " + i++);
		
		System.out.println("3 : " + ++j);
		
		System.out.println("3 : " + -i);
		
		System.out.println("3 : " + -++j);
	}

}
