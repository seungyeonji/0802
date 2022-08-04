
public class MethodDemo6 {
	public static void main(String[] args) {
		int [] array = new int[] {5,9};	//배열 만들어서 넘기기
		System.out.println("Before swap : a = " + array[0] + ", b = " + array[1]);
		swap(array);
		System.out.println("After swap : a = " + array[0] + ", b = " + array[1]);
	}
	static void swap(int [] array) {	//call by reference
		System.out.println("In method, before swap : c = " + array[0] + ", d = " + array[1]);
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		System.out.println("In method, after swap : c = " + array[0] + ", d = " + array[1]);
	}	//배열 사용한 call by reference해주면 main에서나 method 안에서나 모두 스와핑 가능
		//단순히 주소복사하는 개념이지만, 배열의 입장에서도 개수가 달라도 층끼리 바꿀수 있고, main에서도 스와핑이 가능하다
}
