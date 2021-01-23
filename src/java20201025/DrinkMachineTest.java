package java20201025;

public class DrinkMachineTest {
    public static void main(String[] args) {
        // 객체 생성
        DrinkMachine machine1 = new DrinkMachine();
        DrinkMachine machine2 = new DrinkMachine();

        // 음료 뽑기
        machine1.pushButton(1);
        machine2.pushButton(2);

        // 음료 확인
        machine1.printOutput();
        machine2.printOutput();
    }
}
