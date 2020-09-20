package java20200920;

public class Lecture02 {

	public static void main(String[] args) {
		
		boolean flag = true;
		int state = 0;
		
		while(flag) {
			++state;
			System.out.println("미로입니다.");
			
			if(state == 10) {
				flag=false;
				System.out.println("탈출 했습니다.");
				//flag를 바꾸는 대신 break 써도 됨
			}
		}
	}

}
