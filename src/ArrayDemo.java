import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int [] array = {4,7,2,9,4,2,1,5,76,8,7,56,43,6};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array));	//String 넘겨줌
		
		Arrays.sort(array);	//오름차순
		System.out.println("After Ascending Sorting");	
		System.out.println(Arrays.toString(array));
		
		System.out.println("After Descending Sorting");		//내림차순은 따로 함수가 없기 때문에 for문으로 작성
																			//오름차순 먼저 해준뒤에 for문 돌려줘야함
		System.out.print("[");
		for(int i = array.length-1; i>=0;i--) {
			System.out.print(array[i] + ",");
		}
		System.out.println("]");
	}
}
