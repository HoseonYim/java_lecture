package java20201025;

public class CatTest {
    public static void main(String[] args) {
        // Cat 객체 생성
        Cat c = new Cat();

        /* 1. 객체의 필드 값을 변경하시오. */
        c.name = "네로";
        c.breeds = "페르시안";
        c.age = 3;
        // Dog 객체 필드값 출력
        System.out.printf("이름: %s\n", c.name);
        System.out.printf("품종: %s\n", c.breeds);
        System.out.printf("나이: %s\n", c.age);
    }
}
