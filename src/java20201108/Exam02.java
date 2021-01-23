package java20201108;

import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args){
        String s;
        Scanner scan = new Scanner(System.in);
        s = scan.next();
        String answer = "";
        int length = s.length();
        for(int i=length-1;i>=0;i--){
            answer = answer + s.charAt(i);
        }
        System.out.print(answer);
    }
}
