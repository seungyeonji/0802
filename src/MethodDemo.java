/*
 * method = function = 행위, 동작
 * cf. ( ) 가 있으면 method ex.main
 * 메소드 필수 3요소 : 호출할 때 필요한 이름, 파라미터가 들어올수 있는 ( ), 복귀할때 필요한 리턴타입
 * 프로그램 시작 - 메소드 시작 - 메소드 끝 - 프로그램 끝 순서
 */
public class MethodDemo {
	public static void main(String[] args) {
		System.out.println("Program is Starting...");
		MethodDemo md = new MethodDemo();	//멤버메소드 -> 주소로 접근 -> 주소 생성
		md.makeSum();	//메소드 call
//		md.makeSum();
		System.out.println("Program is Over...");
	}
	
	void makeSum() {	//1부터 100까지 합 (Call by Name)
								//main 안에서 1부터 100까지 합을 구하는 코드를 여러번 써야하는 경우 -> 코드를 아웃소싱해서 필요할때마다 call
								//아웃소싱의 최소 단위가 메소드
		System.out.println("Method is Starting...");
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
		System.out.println("Method is Over...");
	}
}
