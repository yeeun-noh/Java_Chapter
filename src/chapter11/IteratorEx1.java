package chapter11;
// Iterator

import java.util.*;

public class IteratorEx1 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
	}
	
}

/* (실행 결과:)

1
2
3
4
5

*/
