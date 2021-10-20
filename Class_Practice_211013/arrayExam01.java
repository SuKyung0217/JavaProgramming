package arrayExam;

import java.util.Scanner;

public class arrayExam01 {
	public static void main(String[] args) {
//		final int NUMBER = 10;
		int[] score = {99,89,88,95,100};
		int hap = 0;
		double avg = 0.0;
		int min, max;
//		Scanner input = new Scanner(System.in);
		
//		score[0] = 99;		score[1] = 89;		score[2] = 95;
//		score[3] = 88;		score[4] = 100;
		//	for (int i = 0; i < score.length; i++) {
//			System.out.println(i+1 + "번 학생 성적 : ");
//			score[i] = input.nextInt();
//		}
		min = score[0];
		max = score[0];
		for (int i = 0; i < score.length; i++) {
			if(min > score[i])
				min = score[i];
		    if(max < score[i])
		    	max = score[i];
		}
		for (int i = 0; i < score.length; i++) {
			hap += score[i];
		}
		
		
		avg = (double)hap/score.length;
		System.out.println("Score 배열의 합 =" + hap + " 평균 = " + avg + "최대값 = " + max + "최소값 = " + min);
		
	}
}
