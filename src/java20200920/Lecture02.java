package java20200920;

public class Lecture02 {

	public static void main(String[] args) {
		
		boolean flag = true;
		int state = 0;
		
		while(flag) {
			++state;
			System.out.println("�̷��Դϴ�.");
			
			if(state == 10) {
				flag=false;
				System.out.println("Ż�� �߽��ϴ�.");
				//flag�� �ٲٴ� ��� break �ᵵ ��
			}
		}
	}

}
