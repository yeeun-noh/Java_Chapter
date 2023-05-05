package chapter11;
// 스택(Stack) - "LIFO" => push(), pop(), empty(), peek()
// Vector로부터 상속받아 구현

import java.util.*;

public class StackEx1 {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		goURL("1. 네이트");
		goURL("2. 야후");
		goURL("3. 네이버");
		goURL("4. 다음");
		printStatus();
		
		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();
		
		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();
		
		goForward();
		System.out.println("= '앞으로' 버튼을 누른 후 =");
		printStatus();
		
		goURL("5. 구글");
		System.out.println("= 새로운 주소로 이동 후 =");
		printStatus();		
	}
	
	public static void printStatus() {
		System.out.println("back: " + back);
		System.out.println("forward: " + forward);
		System.out.println("현재화면은 \"" + back.peek() + "\"");
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty())
			forward.clear();
	}
	
	public static void goForward() {
		if(!forward.empty())
			back.push(forward.pop());
	}

	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop());
	}
}

/* (실행 결과:)

back: [1. 네이트, 2. 야후, 3. 네이버, 4. 다음]
forward: []
현재화면은 "4. 다음"

= '뒤로' 버튼을 누른 후 =
back: [1. 네이트, 2. 야후, 3. 네이버]
forward: [4. 다음]
현재화면은 "3. 네이버"

= '뒤로' 버튼을 누른 후 =
back: [1. 네이트, 2. 야후]
forward: [4. 다음, 3. 네이버]
현재화면은 "2. 야후"

= '앞으로' 버튼을 누른 후 =
back: [1. 네이트, 2. 야후, 3. 네이버]
forward: [4. 다음]
현재화면은 "3. 네이버"

= 새로운 주소로 이동 후 =
back: [1. 네이트, 2. 야후, 3. 네이버, 5. 구글]
forward: []
현재화면은 "5. 구글"

*/
