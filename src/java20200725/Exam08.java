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
		
		System.out.println("�̸�:" + name);
		System.out.println("����:" + age);
		System.out.println("����:" + tall);
		System.out.println("����:" + gen);
	}

}
