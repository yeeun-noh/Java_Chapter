package ch8;
// ArithmeticException : 산술연산과정에서 오류가 있을 때 발생하는 예외 (정수는 0으로 나누는 것이 금지되어있음)

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		int number = 100;
		int result = 0;
		
		for(int i=0; i< 10; i++) {
			try {
				result = number / (int)(Math.random()*10);
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException: / zero 발생!");
			}
		}
	}
}
// 만일 예외처리를 안했다면, 첫번째줄까지만 출력되고 예외가 발생해서 프로그램이 비정상적으로 종료되었을 것임!

/* (실행결과:)

33
ArithmeticException: / zero 발생!
11
50
14
20
20
ArithmeticException: / zero 발생!
50
14

*/
