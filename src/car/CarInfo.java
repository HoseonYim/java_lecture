package car;

import java.util.Scanner;

public class CarInfo {

    Scanner sc = new Scanner(System.in);

    public void inputSpeed(Car car){
        System.out.println("속도를 입력해주세요.");

        car.setSpeed(sc.nextDouble());

        System.out.println("입력받은 속도는 : " + car.getSpeed());
    }

    public void inputPrice(Car car){
        System.out.println("가격을 입력해주세요.");

        car.setPrice(sc.nextInt());

        System.out.println("입력받은 가격은 : " + car.getPrice());
    }

    public void inputDoor(Car car){
        System.out.println("문 개수를 입력해주세요.");

        car.setCountDoor(sc.nextInt());

        System.out.println("문 개수는 : " + car.getCountDoor());
    }

    public void inputFuel(Car car){
        System.out.println("연료를 입력해주세요.");

        car.setFuel(sc.next());

        System.out.println("입력받은 연료는 : " + car.getFuel());
    }

    public void inputKind(Car car){
        System.out.println("종류를 입력해주세요.");

        car.setKind(sc.next());

        System.out.println("입력받은 종류는 : " + car.getKind());
    }

}
