package week6;

import java.util.Scanner;

public class WhileStmt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i, end, hap;
		
		hap = 0;
		i=1;
		while(i<=10) {
			hap += i;
			i++;
		}
		System.out.println("1���� 10������ �� :");
		System.out.println("���� ���ڸ� �Է� �ϼ���! :");
		end = scanner.nextInt();
		
		hap = 0;
		i=1;
		while(i<=end) {
			hap += i;
			i++;
		}
		System.out.println("���� ���ڸ� �Է� �ϼ���! :");
		System.out.println("1����"+end+"������ �� :");
		
		
//		int i;
//		hap = 0;
//		for (i=1; i <= 10; i++) {
//			hap += i;
//			if(hap > 30)
//				break;
//		}
//		System.out.println("1����"+ i +" ������ ��" +hap);
	

	
	hap = 0;
	i = 1;
	while(i <= 100) {
		if(i%7 == 0) {
			i++;
			continue;
			}
		hap += i;
		}
	System.out.println("1���� 10������ �� �߿� 7�� ��� ������ �� = " + hap);
	}
}


