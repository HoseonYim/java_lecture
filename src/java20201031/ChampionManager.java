package java20201031;

public class ChampionManager {
    public static void main(String[] args){
        // Champion클래스의 객체(teemo) 생성
        Champion teemo = new Champion();
        System.out.println("teemo current power: " + teemo.getCurrentPower());

        teemo.powerUp();
        System.out.println("teemo current power: " + teemo.getCurrentPower());

        teemo.powerDown();
        System.out.println("teemo current power: " + teemo.getCurrentPower());
    }
}
