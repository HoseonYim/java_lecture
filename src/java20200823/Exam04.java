package java20200823;

public class Exam04 {

	public static void main(String[] args) {
		int age=19;
		if(age>=19) {
			System.out.printf("%d��, �������� �Ϸ� => ĵ���ְ� ���Խ��ϴ�.\n", age);
		}
		String resultStr = "";
		resultStr = (age >= 19) ? "�������� �Ϸ�" : "�̼������Դϴ�.";
		
		System.out.println(resultStr);
	}

}
