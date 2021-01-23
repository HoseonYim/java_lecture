package java20201031;

public class Champion {
    String name;
    int power;
    int defense;

    // 생성자 정의
    public Champion(){

    }

    // 메소드 정의
    public void powerUp(){
        power += 5;
    }

    public void powerDown(){
        power -= 5;
    }

    public int getCurrentPower(){
        return power;
    }
}
