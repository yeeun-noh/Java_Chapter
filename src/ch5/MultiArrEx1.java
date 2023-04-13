package ch5;

import java.util.Scanner;

public class MultiArrEx1 {

	public static void main(String[] args) {
		// 좌표에 X표하기 : 입력한 2차원 좌표의 위치에 X를 표시
		
		final int SIZE = 10;
		int x = 0, y = 0;
		
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
			//   1  2  3  4  5  6  7  8  9
				{0, 0, 0, 0, 0, 0, 1, 0, 0}, // 1
				{1, 1, 1, 1, 0, 0, 1, 0, 0}, // 2
				{0, 0, 0, 0, 0, 0, 1, 0, 0}, // 3
				{0, 0, 0, 0, 0, 0, 1, 0, 0}, // 4
				{0, 0, 0, 0, 0, 0, 0, 0, 0}, // 5
				{1, 1, 0, 1, 0, 0, 0, 0, 0}, // 6
				{0, 0, 0, 1, 0, 0, 0, 0, 0}, // 7
				{0, 0, 0, 1, 0, 0, 0, 0, 0}, // 8
				{0, 0, 0, 0, 0, 1, 1, 1, 0}, // 9
		};
		
		//1행에 행번호를, 1열에 열번호를 저장:
		for(int i=0; i<SIZE; i++) {
			board[0][i] = board[i][0] = (char)(i + '0'); //숫자를 문자로 변환
			// (char)(1+'0') => '1' , (숫자1에 문자'0'을 더하면 문자'1'이됨)
			// (char)(2+'0') => '2' , (숫자2에 문자'0'을 더하면 문자'2'이됨)
			// ...
		}												
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("좌표를 입력,(00은 종료)>");
			String input = sc.nextLine();
			
			if(input.length()==2) { // 두 글자를 입력한경우
				x = input.charAt(0) - '0'; // 문자를 숫자로 변환
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0) break;
			}
			
			if(input.length()!=2 || x<=0 || x>SIZE || y<=0 || y>=SIZE) {
				System.out.println("잘못된 입력! 다시입력!");
				continue;
			}
			
			//shipBoard[x-1][y-1]의 값이 1이면, '0'을 board[x][y]에 저장:
			board[x][y] = shipBoard[x-1][y-1]==1 ? 'O' : 'X';
			
			//배열 board에의 내용을 화면에 출력:
			for(int i=0; i<SIZE; i++) {
				System.out.println(board[i]);
			}
			System.out.println();
		}
	}

}

/* (실행결과:)

좌표를 입력,(00은 종료)>1010
잘못된 입력! 다시입력!
좌표를 입력,(00은 종료)>74
0123456789
1
2
3
4      
5
6
7   o
8
9

좌표를 입력,(00은 종료)>33
0123456789
1
2
3  x
4      
5
6
7   o
8
9

좌표를 입력,(00은 종료)>00

 */
