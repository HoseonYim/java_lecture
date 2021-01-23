package java20201108;

import java.util.Arrays;

class Exam01 {
    public Exam01(int[] array, int[][] commands) {
        int[] answer = {};
        int[][] organize = new int[0][];
        int num;
        for(int i=0;i<commands.length-1;i++){
            num = 0;
            for(int j=commands[i][0];j<commands[i][1];j++){
                organize[i][num] = array[j];
                num++;
            }
        }
        for(int i=0;i<commands.length-1;i++){
            answer[i] = organize[i][commands[i][2]];
        }
        System.out.println(Arrays.toString(answer));
    }
}


