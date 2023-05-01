package ch9;
//hasCode(), System.identifyHashCode(Object obj)
//System.identifyHashCode(Object obj)는 객체의 주소값으로 해시코드를 생성 

public class HashCodeEx1 {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}

/* (실행결과:)

true
96354
96354
1694819250
1365202186

*/
