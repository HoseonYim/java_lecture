package java20200927;

import java.util.Scanner;
import java.util.Random;

public class Exam01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("게임을 시작 하시겠습니까? 1)예, 2)아니오");
        String ans = scan.next();
        System.out.println();
        String pos;
        int i = (int) (Math.random() * 5);
        int j = (int) (Math.random() * 2);
        int num=0;
        int snum=0;
        boolean re = true;
        String mode;
        String team = "";
        if (ans.equals("예")) {
            if (i == 0) {
                pos = "탑";
            } else if (i == 1) {
                pos = "정글";
            } else if (i == 2) {
                pos = "미드";
            } else if (i == 3) {
                pos = "원딜";
            } else {
                pos = "서포터";
            }
            while (re == true) {
                re = false;
                System.out.printf("파티원의 수를 정해주세여 : ");
                num = scan.nextInt();
                num--;
                snum = num;
                System.out.println();
                System.out.printf("게임을 선택해 주세요.\n1.일반게임\n2.랭크게임\n3.우르프\n4.단일챔피언\n5.AI\n");
                mode = scan.next();
                System.out.println();
                if (mode.equals("일반게임") || mode.equals("랭크게임") || mode.equals("우르프") || mode.equals("단일챔피언") || mode.equals("AI")) {
                    System.out.printf("%s을 선택했습니다. %s을 매칭을 하겠습니다..........\n\n", mode, mode);
                } else {
                    System.out.printf("게임 모드를 알아듣지 못했으므로 일반게임으로 선택하겠습니다. 일반게임을 매칭을 하겠습니다..........\n\n");
                    mode = "일반게임";
                }
                int out = (int) (Math.random() * 6);
                outerloop:
                while (out == 0 || out == 2) {
                    if (out == 0) {
                        try {
                            System.out.println("......누군가 게임을 취소해 다시 메칭을 시작합니다......\n");
                            Thread.sleep(4000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("......우리 파티원이 게임을 취소했습니다......\n");
                        out = 1;
                        re = true;
                        break outerloop;
                    }
                    out = (int) (Math.random() * 4);
                }
            }
            if (j == 0) {
                team = "레드팀";
            } else if (j == 1){
                team = "블루팀";
            }
            System.out.printf("게임이 매칭되었습니다.\n\n팀 진영은 %s입니다.\n\n", team);
            System.out.printf("페이커님의 포지션은 %s\n", pos);
            if (!pos.equals("탑")) {
                num--;
                if (num >= 0) {
                    System.out.printf("파티원%d님의 포지션은 탑\n", snum - num);
                } else {
                    System.out.printf("외부인%d님의 포지션은 탑\n", num * -1);
                }
            }
            if (!pos.equals("정글")) {
                num--;
                if (num >= 0) {
                    System.out.printf("파티원%d님의 포지션은 정글\n", snum - num);
                } else {
                    System.out.printf("외부인%d님의 포지션은 정글\n", num * -1);
                }
            }
            if (!pos.equals("미드")) {
                num--;
                if (num >= 0) {
                    System.out.printf("파티원%d님의 포지션은 미드\n", snum - num);
                } else {
                    System.out.printf("외부인%d님의 포지션은 미드\n", num * -1);
                }
            }
            if (!pos.equals("원딜")) {
                num--;
                if (num >= 0) {
                    System.out.printf("파티원%d님의 포지션은 원딜\n", snum - num);
                } else {
                    System.out.printf("외부인%d님의 포지션은 원딜\n", num * -1);
                }
            }
            if (!pos.equals("서포터")) {
                num--;
                if (num >= 0) {
                    System.out.printf("파티원%d님의 포지션은 서포터\n", snum - num);
                } else {
                    System.out.printf("외부인%d님의 포지션은 서포터\n", num * -1);
                }
            }
        }
        else if(ans.equals("아니오")){
            System.out.printf("예, 게임을 종료합니다.");
        }
        else{
            System.out.printf("무엇을 입력했는지 알아들을 수가 없으므로 게임을 종료하겠습니다.");
        }
    }
}
