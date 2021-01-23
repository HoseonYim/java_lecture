package lecture_20210117;

public class Lecture01 {
    public static void main(String[] args) {

        //기본형 타입
        int number; // 숫자형
        boolean flag; // 논리형
        char character; // 문자형
        //.... double, float, long

        // 참조형 타입
        String str = "hi";
        String name = new String("Kim");

        // 기본클래스 -> 래퍼클래스, 래퍼클래스 -> 기본클래스
        int number07 = Integer.parseInt("07"); // 새로운 객체를 생성하기 떄문에 비효율적
        int number08 = Integer.valueOf("08"); // 캐시된 객체를 반환(권장)

        //int -> String
        String number09 = Integer.toString(10);

        /*
        숫자, 문자, 문자열에 상관없이 소스 코드에 직접 기술된 값을 리터럴이라고 부른다.
        리터럴의 종류로는 정수형(integer), 실수형(floating point, 부동소수형),
        부울형(boolean), 문자형(character), 그리고 문자열(string)이 있다.
         */

        //변수의 스코프와 라이프타임
        /*
        스코프란 변수를 사용할 수 있는 범위를 얘기한다.
        { } 안에서 변수를 선언했을 경우 영역이 끝나기 전까지는 어디서든 사용이 가능하다.
        Class 영역에서 선언한 변수를 전역 변수(Global Variable)라 하고 클래스 내의 모든 장소(메소드 포함)에서 사용할 수 있다.
        메소드 내에서 선언하는 변수를 지역 변수(Local Variable)이라고 하고 메소드 안에서만 사용이 가능하다.

        또한 static 키워드가 붙은 변수는 클래스 내에서 공유되어 어디서나 사용 가능하고
        main 메소드에서는 static 변수가 아닐 경우 객체화해야 클래스 변수 사용 가능하다.
         */

    }
}
