
public class MethodDemo4 {	//Call by Reference(주소로 호출)
	public static void main(String[] args) {
		int original = 5;
		System.out.println("Before calling method, original = " + original);
		mymethod(original);
		System.out.println("After calling method, original = " + original);
	}
	static void mymethod(int target) {	//call by value -> int target = original
		System.out.println("In method, target = " + target);
		target = 100;
		System.out.println("In method, target = " + target);
	}//call by value로는 target 값이 바뀔 떄 original값도 바뀌게 할 수 없음(값 복사니까)
	
}
