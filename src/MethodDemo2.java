
public class MethodDemo2 {
	public static void main(String[] args) {
		System.out.println("Program is Starting...");
		MethodDemo2 md = new MethodDemo2();
		int start = 1, last = 100;	//makeSum()의 start, last는 영역이 다르기 때문에 다른 변수를 뜻함 -> 이름 같아도 상관없음
		int result = md.makeSum(start, last);	//넘어갈때는 1, 100을 가지고 갔고 이후 다시 복귀한 sum을 result에 대입
		System.out.println(start + "부터 " + last + "까지의 합은 " + result);
		start = 30;
		last = 50;
		result = md.makeSum(start, last);
		System.out.println(start + "부터 " + last + "까지의 합은 " + result);
		System.out.println("Program is Over...");
	}
	
	int makeSum(int start, int last) {	//Call by Value
		System.out.println("Method is Starting...");
		int sum = 0;
		for(int i = start; i<=last; i++) {
			sum += i;
		}
		System.out.println("Method is Over...");
		return sum;	//sum을 가지고 복귀하겠다 -> return type void 대신 int로 변경 -> 리턴타입 안맞추면 오류 발생
		// 메소드는 필요할때 호출하는데 이름, 값, 주소로 호출할 수 있음
		//복귀할때 빈손으로 오는지, 갖고 와서 현지에서 처리할건지에 따라 void인지 등 리턴타입을 써주는게 달라짐
	}
}
