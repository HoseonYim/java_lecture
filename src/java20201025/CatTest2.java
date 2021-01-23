package java20201025;

public class CatTest2 {
    public static void main(String[] args) {
        // 고양이 객체 c1 생성
        Cat2 cat1 = new Cat2();
        Cat2 cat2 = new Cat2();

        // 메소드 호출
        cat1.meow();
        cat2.meow();

        /* 1. 할퀴기 메소드를 호출하시오. */
        cat1.claw();
        cat2.claw();
    }
}
