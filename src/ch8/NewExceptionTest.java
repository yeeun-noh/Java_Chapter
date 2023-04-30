package ch8;

public class NewExceptionTest {

	public static void main(String[] args) {

		try {
			startInstall();
			copyFiles();
		} catch(SapceException se) {
			System.out.println("에러메세지: " + se.getMessage());
			se.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다");
		} catch(MemoryException me) {
			System.out.println("에러메세지: " + me.getMessage());
			me.printStackTrace();
			System.gc(); // Garbage Collector을 수행하여 메모리를 늘려줌!
			System.out.println("다시 설치를 시도하세요");
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SapceException, MemoryException {
		if(!enoughSpace())  //충분한 설치 공간이 없으면...
			throw new SapceException("설치할 공간이 부족합니다");
		if(!enoughMemory()) //충분한 메모리가 없으면...
			throw new MemoryException("메모리가 부족합니다");
	}

	static void copyFiles() { /* 파일들을 복사하는 코드 */}
	static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드 */}

	static boolean enoughMemory() {
		/* 설치하는데 필요한 공간이 있는 학인하는 코드 */
		return false;
	}

	static boolean enoughSpace() {
		/* 설치하는데 필요한 메모리공간이 있는 학인하는 코드 */
		return false;
	}
}

class SapceException extends Exception {
	SapceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}


/* (실행결과:)

에러메세지: 설치할 공간이 부족합니다
ch8.SapceException: 설치할 공간이 부족합니다
	at ch8.NewExceptionTest.startInstall(NewExceptionTest.java:26)
	at ch8.NewExceptionTest.main(NewExceptionTest.java:8)
공간을 확보한 후에 다시 설치하시기 바랍니다

*/
