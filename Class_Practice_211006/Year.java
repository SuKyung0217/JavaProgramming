package week6;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year;
		
		System.out.println("년도를 입력해주세요. :");
		year = scanner.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
		
	}

}

