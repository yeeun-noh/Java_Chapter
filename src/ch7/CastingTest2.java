package ch7;

public class CastingTest2 {

	public static void main(String[] args) {

		Car car = new FireEngine();
		Car car2 = new Car();
		FireEngine fe = null;

		car.drive();
		fe = (FireEngine)car;
		fe.drive();
		car2 = fe;
		car2.drive();
	}

}

/* (실행결과:)

drive. Brrr--
drive. Brrr--
drive. Brrr--

*/
