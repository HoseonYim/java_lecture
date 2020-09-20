package java20200830;

public class Lecture01 {

	public static void main(String[] args) {
		int a = 123456789;
		String b = "123456789";
		System.out.println(a);
		System.out.println(b);
		if(a == 123456789) {
			System.out.println("1");
		}
		if(b == "123456789") {
			System.out.println("1");
		}
		if(b.equals("123456789")) {
			System.out.println("1");
		}
	}

}
