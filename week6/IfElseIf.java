package week6;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age;
		
		System.out.println("나이 입력 하세요! :");
		age = scanner.nextInt();
		
		int ent = 100000;
		if(age < 19)
			ent = 50000;
		
		System.out.println("나이 :" + age + " 입장료 = " + ent);
	}

}

