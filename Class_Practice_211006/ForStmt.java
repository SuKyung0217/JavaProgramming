package week6;

import java.util.Scanner;

public class ForStmt {
	public static void main(String[] args) {
		int hap = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int i = 1; i <= 10; i++) {
			hap += i;
		}
		System.out.println("1부터 10까지의 합 = " +hap);
		
		Scanner scn = new Scanner(System.in);
		int strt, end;
		hap = 0;
		System.out.println("시작 숫자 : ");
		strt = scn.nextInt();
		System.out.println("종료 숫자 : ");
		end = scn.nextInt();
		for (int i = strt; i <= end; i++) {
			hap += i;
		}
		System.out.println(strt+"부터"+ end+" 까지의 합 = " +hap);
		
		hap = 0;
		for (int i = strt; i <= end; i++) {
			if(i%2==0)
				hap += i;
		}
		System.out.println(strt+"부터"+ end+" 까지의 수 중에 짝수 합 = " +hap);
		
		hap = 0;
		for (int i = strt; i <= end; i++) {
			if(i%7==0)
				continue;
			hap += i;
		}
		System.out.println(strt+"부터"+ end+" 까지의 수 중에 7의 배수를 생략한 합 = " +hap);
		
		int i;
		hap = 0;
		for (i=1; i <= 10; i++) {
			hap += i;
			if(hap > 30)
				break;
		}
		System.out.println("1부터"+ i +" 까지의 합" +hap);
		
		
	}

}
