package week6;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year;
		
		System.out.println("�⵵�� �Է����ּ���. :");
		year = scanner.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
		
	}

}

