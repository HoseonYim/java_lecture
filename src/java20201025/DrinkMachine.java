package java20201025;

public class DrinkMachine {
    /* 필드 */
    String output;

    /* 메소드 */
    void pushButton(int num) {
        String[] drinks = {"콜라", "사이다", "맥주"};
        output = drinks[num];
    }

    void printOutput() {
        System.out.println(output);
    }
}
