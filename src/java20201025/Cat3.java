package java20201025;

public class Cat3 {
    /* 필드(상태) 영역 */
    String name;    // 이름
    String breeds;  // 품종
    int age;        // 나이

    /* 메소드(동작) 영역 */
    void meow() {
        System.out.printf("[%s]의 야옹~\n", name);
    }

    void claw() {
        /* 1. claw 메소드를 완성하시오. */
        System.out.printf("[%s]의 할퀴기! 샥샥~\n", name);
    }
}
