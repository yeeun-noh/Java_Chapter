package ch3;

public class OperatorExx27 {

	public static void main(String[] args) {
		
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b = %b%n", b);
		System.out.printf("!b = %b%n", !b); // 논리 부정 연산자(!)
		System.out.printf("!!b = %b%n", !!b);
		System.out.printf("!!!b = %b%n", !!!b);
		
		System.out.println();
		
		System.out.printf("ch = %c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z' = %b%n", ch < 'a' || ch > 'z');
		System.out.printf("!('a' <= ch || ch >= 'z') = %b%n", !('a' <= ch || ch >= 'z'));
		System.out.printf("  'a' <= ch || ch >= 'z' = %b%n", 'a' <= ch || ch >= 'z');
		
//		(실행결과 :)
//			
//		b = true
//		!b = false
//		!!b = true
//		!!!b = false
//
//		ch = C
//		ch < 'a' || ch > 'z' = true
//		!('a' <= ch || ch >= 'z') = true
//		  'a' <= ch || ch >= 'z' = false
	}
	
}
