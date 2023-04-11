package ch4;

public class FlowExx29 {

	public static void main(String[] args) {

		for(int i=1; i<=50; i++) {
			System.out.printf("i= %d ", i);
			
			int tmp = i;
			
			do {
				//tmp%10(==tmp의 끝자리)이 3의 배수인지 확인(0제외)
				if(tmp%10%3==0 && tmp%10!=0)
					System.out.print("!");
			} while((tmp/=10)!=0);

			System.out.println();
		}
	}

}

//(실행결과 :)
//
//i= 1 
//i= 2 
//i= 3 !
//i= 4 
//i= 5 
//i= 6 !
//i= 7 
//i= 8 
//i= 9 !
//i= 10 
//i= 11 
//i= 12 
//i= 13 !
//i= 14 
//i= 15 
//i= 16 !
//i= 17 
//i= 18 
//i= 19 !
//i= 20 
//i= 21 
//i= 22 
//i= 23 !
//i= 24 
//i= 25 
//i= 26 !
//i= 27 
//i= 28 
//i= 29 !
//i= 30 !
//i= 31 !
//i= 32 !
//i= 33 !!
//i= 34 !
//i= 35 !
//i= 36 !!
//i= 37 !
//i= 38 !
//i= 39 !!
//i= 40 
//i= 41 
//i= 42 
//i= 43 !
//i= 44 
//i= 45 
//i= 46 !
//i= 47 
//i= 48 
//i= 49 !
//i= 50 
