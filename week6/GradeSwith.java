package week6;

import java.util.Scanner;

public class GradeSwith {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		char grade ='A';
		
		System.out.println("���� �Է� �ϼ���! :");
		score = scanner.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		case 6:
			grade = 'D'; break;
		default:
			grade = 'F';
		}
		System.out.println("������ " +score+" �̰� ����� "+grade+"�Դϴ�.");

	}

}
