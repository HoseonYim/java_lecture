package java20200906;

public class Lecture04 {

	public static void main(String[] args) {
		String[] weeks = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		String[] weeks2 = new String[7];
		weeks2[0]= "��";
		weeks2[1]= "ȭ";
		weeks2[2]= "��";
		weeks2[3]= "��";
		weeks2[4]= "��";
		weeks2[5]= "��";
		weeks2[6]= "��";
		
		for(int i=0;i<7;i++) {
			System.out.printf("weeks�� %d��° �ε����� ���� %s�̴�.\n", i,weeks[i]);
		}
		for(int i=0;i<7;i++) {
			System.out.printf("weeks2�� %d��° �ε����� ���� %s�̴�.\n", i,weeks2[i]);
		}
	}

}
