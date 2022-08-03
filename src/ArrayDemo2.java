import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int [][] array = {
				{1,2,3,4,5},
				{10,9,8,7,6,5,4,3,2,1}
		};
		
		System.out.println("Before Swapping");
		System.out.println("<<0층>>");
		System.out.println(Arrays.toString(array[0]));
		System.out.println("<<1층>>");
		System.out.println(Arrays.toString(array[1]));
	
		 
		//0층과 1층 맞바꾸끼(스와핑)
		//정수와 정수를 바꾸려면 정수 변수가 있어야함 = 바뀌는 타입이 같아야함
		int [] temp = array[0];
		array[0] = array[1];
		array[1] = temp;		//주소복사 -> 스와핑
		
		System.out.println("After Swapping");
		System.out.println("<<0층>>");
		System.out.println(Arrays.toString(array[0]));
		System.out.println("<<1층>>");
		System.out.println(Arrays.toString(array[1]));
	}
}
