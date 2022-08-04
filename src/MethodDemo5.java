
public class MethodDemo5 {
	public static void main(String[] args) {
		int a = 5, b = 9;
		System.out.println("Before swap : a = " + a + ", b = " + b);
		swap(a,b);
		System.out.println("After swap : a = " + a + ", b = " + b);
	}
	static void swap(int c, int d) {
		System.out.println("In method, before swap : c = " + c + ", d = " + d);
		int temp = c;
		c = d;
		d = temp;
		System.out.println("In method, after swap : c = " + c + ", d = " + d);
	}	//현지에서는 바꼈지만 main 안에서는 안바꼈음 -> 값 복사의 한계
		//call by value로는 스와핑 불가능 -> call by reference를 써야함
}
