package java20201115;

import java.util.*;

public class Exam01 {
    public static void main(String[] args){
        Phone apple = new Phone();
        Phone samsung = new Phone();
        Phone lg = new Phone();
        Phone xiaomi = new Phone();
        Phone lenovo = new Phone();

        apple.setGrade(5);
        samsung.setGrade(4);
        lg.setGrade(3);
        xiaomi.setGrade(2);
        lenovo.setGrade(1);

        apple.setPrice(2000000);
        samsung.setPrice(1600000);
        lg.setPrice(1500000);
        lenovo.setPrice(1300000);
        xiaomi.setPrice(1000000);

        lg.setWeight(2000);
        samsung.setWeight(1800);
        apple.setWeight(1600);
        lenovo.setWeight(1500);
        xiaomi.setWeight(1300);

        HashMap<String, Integer> grade = new HashMap<>();

        grade.put("apple", apple.getGrade());
        grade.put("samsung", samsung.getGrade());
        grade.put("lg", lg.getGrade());
        grade.put("lenovo", lenovo.getGrade());
        grade.put("xiaomi", xiaomi.getGrade());

        HashMap<String, Integer> price = new HashMap<>();

        price.put("apple", apple.getPrice());
        price.put("samsung", samsung.getPrice());
        price.put("lg", lg.getPrice());
        price.put("lenovo", lenovo.getPrice());
        price.put("xiaomi", xiaomi.getPrice());

        HashMap<String, Integer> weight = new HashMap<>();

        weight.put("apple", apple.getWeight());
        weight.put("samsung", samsung.getWeight());
        weight.put("lg", lg.getPrice());
        weight.put("lenovo", lenovo.getWeight());
        weight.put("xiaomi", xiaomi.getWeight());

        grade.keySet().forEach(key -> {
            System.out.print(key + " ");
        });
        System.out.println();
        price.keySet().forEach(key -> {
            System.out.print(key + " ");
        });
        System.out.println();
        weight.keySet().forEach(key -> {
            System.out.print(key + " ");
        });
    }
}
