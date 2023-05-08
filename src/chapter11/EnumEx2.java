package chapter11;

enum Directions {
	EAST(1,">"), SOUTH(2,"V"), WESET(3,"<"), NORTH(4,"^");
	
	private static final Directions[] DIR_ARR = Directions.values();
	private final int value;
   	private final String symbol;
   	
   	Directions(int value, String symbol) { // 접근제어자 private이 생략됨
   		this.value = value;
       	this.symbol = symbol;
   	}
   	
   	public int getValue() { return value; }
   	public String getSymbol() { return symbol; }
   	
   	public static Directions of(int dir) {
   		if(dir < 1 || dir > 4)
   			throw new IllegalArgumentException("Invalid Value: " + dir);
   		return DIR_ARR[dir - 1];
   	}

   	//방향을 회전시키는 메서드, num의 값만큼 90도씩 시계방향으로 회전함:
   	public Directions rotate(int num) {
   		num = num % 4;
   		if(num < 0)
   			num += 4; //num이 음수일 때는 시계반대방향으로 회전
   		return DIR_ARR[(value - 1 + num) % 4];
   	}
   
   	public String toStirng() {
   		return name() + getSymbol();
   	}
}

public class EnumEx2 {

	public static void main(String[] args) {

		for(Directions d : Directions.values())
			System.out.printf("%s=%d%n", d.name(), d.getValue());
		
		Directions d1 = Directions.EAST;
		Directions d2 = Directions.of(1);
		
		System.out.printf("d1= %s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d2= %s, %d%n", d2.name(), d2.getValue());
		
		System.out.println(Directions.EAST.rotate(1).toStirng());
		System.out.println(Directions.EAST.rotate(2).toStirng());
		System.out.println(Directions.EAST.rotate(-1).toStirng());
		System.out.println(Directions.EAST.rotate(-2).toStirng());
	}

}

/* (실행 결과:)

EAST=1
SOUTH=2
WESET=3
NORTH=4
d1= EAST, 1
d2= EAST, 1
SOUTHV
WESET<
NORTH^
WESET<

*/

