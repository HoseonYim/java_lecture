package car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        CarInfo ci = new CarInfo();

        ci.inputSpeed(car);
        ci.inputPrice(car);
        ci.inputDoor(car);
        ci.inputFuel(car);
        ci.inputKind(car);

    }
}
