package week6;

import java.util.Scanner;

public class IfStmt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age;
		
		System.out.println("���� �Է� �ϼ���! :");
		age = scanner.nextInt();
		
		int ent = 100000;
		if(age < 19)
			ent = 50000;
		
		System.out.println("���� :" + age + " ����� = " + ent);
	}

}
