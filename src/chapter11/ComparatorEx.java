package chapter11;
// Comparator - compare(Object o1, Object o2)사용

import java.util.*;


public class ComparatorEx {

	public static void main(String[] args) {
		
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		//String의 Comparable구현에 의한 정렬:
		Arrays.sort(strArr);
		System.out.println("strArr= " + Arrays.toString(strArr));
		
		//대소문자 구분안하고 정렬:
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr= " + Arrays.toString(strArr));
		
		//역순 정렬:
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr= " + Arrays.toString(strArr));
	}
}

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
//			return c1.compareTo(c2) * -1; //-1을 곱해서 기본 정렬방식의 역으로 변경
			return c2.compareTo(c1); //와 같이 순서를 바꿔도됨!
		}
		return -1;
	}
}

/* (실행 결과:)

strArr= [Dog, cat, lion, tiger]
strArr= [cat, Dog, lion, tiger]
strArr= [tiger, lion, cat, Dog]

*/
