package java20201011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Score score = new Score();//score 개체 생성

        while (true) {
            Student student = new Student();
            System.out.println("1.학생 정보 입력\n2.학생 정보 수정(이름)\n3.학생 정보 삭제(이름)\n4.학생 정보 출력");//입력 할 수 있는 것들을 설명

            int select = sc.nextInt();//입력 값을 select 라는 정수형 변수에다가 저장

            switch (select) {
                case 1:
                    score.Input(student);//score 클래스의 Input 메소드를 실행한다.
                    break;
                case 2:
                    score.Modify();//score 클래스의 Modify 메소드를 실행한다.
                    break;
                case 3:
                    score.Delete();//score 클래스의 Delete 메소드를 실행한다.
                    break;
                case 4:
                    score.Output();//score 클래스의 Output 메소드를 실행한다.
                    break;
                default:
                    System.out.printf("잘못 입력을 하신 것 같습니다./n다시 입력 해주세요./n");
                    break;//1, 2, 3, 4 외의 수가 아닌면 그냥 넘긴다(무한 반복)
            }
        }
    }
}
