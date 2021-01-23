package java20201025;

public class SquareTest {
    public static void main(String[] args) {
        /* 객체 생성 */
        Square s = new Square();
        /* 필드 초기화(값 변경) */
        s.length = 4;
        /* 결과 출력 */
        System.out.printf("한 변이 %d인 정사각형 넓이:%d", s.length,s.area());
    }
}
