package lecture_20210117;

public class Scope {

    static String classValue = "Class Value"; // 전역변수
    static String STATIC_VALUE = "static value"; // static은 클래스 내에서 공유되어 어디서나 사용 가능

    public static void main(String[] args) {
        // 메인 메소드에서는 static 변수가 아닐 경우 객체화 해야 클래스 변수 사용이 가능하다.
        int number = 1;
        int count = 1;
    }

    public static void add() {
        int number = 3; // 지역변수
        System.out.println(classValue); // 메소드 안에서 클래스 변수 사용 가능
    }
}
