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
		System.out.println("1부터 10까지의 합 :");
		System.out.println("종료 숫자를 입력 하세요! :");
		end = scanner.nextInt();
		
		hap = 0;
		i=1;
		while(i<=end) {
			hap += i;
			i++;
		}
		System.out.println("종료 숫자를 입력 하세요! :");
		System.out.println("1부터"+end+"까지의 합 :");
		
		
//		int i;
//		hap = 0;
//		for (i=1; i <= 10; i++) {
//			hap += i;
//			if(hap > 30)
//				break;
//		}
//		System.out.println("1부터"+ i +" 까지의 합" +hap);
	

	
	hap = 0;
	i = 1;
	while(i <= 100) {
		if(i%7 == 0) {
			i++;
			continue;
			}
		hap += i;
		}
	System.out.println("1부터 10까지의 수 중에 7의 배수 생략한 합 = " + hap);
	}
}


