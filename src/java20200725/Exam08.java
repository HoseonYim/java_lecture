package java20200725;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		String name;
		int age;
		double tall;
		boolean gen;
		
		Scanner scan = new Scanner(System.in);
		
		name = scan.nextLine();
		age = scan.nextInt();
		tall = scan.nextDouble();
		gen = scan.nextBoolean();
		
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("신장:" + tall);
		System.out.println("성별:" + gen);
	}

}
