package ch4;

import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {

		int score = 0;
		char grade = ' '; // 공백으로 초기화

		System.out.print("점수를 입력하세요 >>");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		}else {
			grade = 'D';
		}
		
		System.out.println("당신의 점수는 " + grade);
	}

}

//	(실행결과 :)
//
//	점수를 입력하세요 >>79
//	당신의 점수는 C
