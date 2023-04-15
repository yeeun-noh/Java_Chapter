package ch6;

public class ReferenceParamEx2 {

	public static void main(String[] args) {
		int[] x = {10}; //크기가 1인배열 ==> x[0]=10;
		System.out.println("main() : x= " + x[0]);
		
		change(x);		
		System.out.println("After change(x),");
		System.out.println("main() : x= " + x[0]);
	}

	
	static void change(int[] x) { //참조형 매개변수
		x[0] = 1000;
		System.out.println("change(): x= " + x[0]);
	}
}

/* (실행결과:)

main() : x= 10
change(): x= 1000
After change(x),
main() : x= 1000

*/
