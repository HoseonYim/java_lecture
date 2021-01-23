package java20210110;

public class Main {
    public static void main(String[] args) {
        /*
        Car car1 = new Car();
        car1.color = "white";
        car1.doorCount = 1;
        car1.kind = "suv";
        car1.mission = "manual";
        car1.seat = 5;

        System.out.println("car1의 색상은 ? " + car1.color);
        System.out.println("car1의 문 갯수는 ? " + car1.doorCount);
        System.out.println("car1의 종류는 ? " + car1.kind);
        System.out.println("car1의 기어 방식은 ? " + car1.mission);
        System.out.println("car1의 좌석 수는 ? " + car1.seat);
        System.out.println();

        Car car2 = new Car("black", "auto", 2);
        System.out.println("car2의 색상은 ? " + car2.color);
        System.out.println("car2의 기어 방식은 ? " + car2.mission);
        System.out.println("car2의 좌석 수는 ? " + car2.seat);
        System.out.println();

        Animal cat = new Animal();
        cat.setAge(1);
        cat.setName("나비");
        System.out.println("고양이 나이는 "+cat.getAge());
        System.out.println("고양이 이름은 "+cat.getName());
        */
        Country country = new Country();
        country.setCapital("Seoul");
        country.setLanguage("Korean");
        country.setPopulation(51829023);
        country.setName("Korea");

        country.printPopulation(country.getPopulation());
        country.printCapital(country.getCapital());
        country.printLanguage(country.getLanguage());
        country.printCountryInfo(country.getName(), country.getPopulation(), country.getCapital(), country.getLanguage());


    }
}
