package java20201025;

public class CatTest3 {
    public static void main(String[] args) {
        // 두 고양이 객체 생성
        Cat3 cat1 = new Cat3();
        Cat3 cat2 = new Cat3();

        // 객체 필드 초기화
        cat1.name = "네로";
        cat2.name = "나비";

        // 두 고양이의 야옹~
        cat1.meow();
        cat2.meow();

        // 두 고양이의 할퀴기!
        cat1.claw();
        cat2.claw();
    }
}
