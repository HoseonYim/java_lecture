package java20201129;

import java.util.Scanner;

public class Debug {
    public static void main(String[] args){
        System.out.println("정수를 입력하시오");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if(number == 10){
            System.out.println(("number의 값은 : " + number));
        }

        for(int i = 0;i < number; i++){
            System.out.println("i의 값은 : " + i);
        }
    }
}
