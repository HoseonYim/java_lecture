package dog;

public class Main {
    public static void main(String[] args) {
        // Dog 객체 생성
        Dog d = new Dog();

        // Dog 객체 필드 값 출력
        System.out.printf("이름: %s\n", d.name);
        System.out.printf("품종: %s\n", d.breeds);
        System.out.printf("나이: %s\n", d.age);
    }
}
