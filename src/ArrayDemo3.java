import java.util.Arrays;

public class ArrayDemo3 {
	public static void main(String[] args) {
//		String [] array = {"Hello", "World", "한지민", "박지민"};		//String은 참조형이니까 주소의 배열
																				//Hello, World, 한지민 등의 "번지"를 저장
//		for(int i = 0; i<10; i++) {
//			System.out.println(array[i]);
//		}
		
		//이후 array에 값이 2개 더 들어온다해도 3개만 돌리니까 상관없음
		//이후 다시 5개에서 3개로 줄어든다면 문제가 됨
		//5개 돌기로 했는데 입력을 3개만 하면 에러남
		//array 범위를 오버하면 arrayIndexOutOfBounds 오류가 나게됨 but 이 오류는 컴파일 오류가 아님
		//이 문제를 해결하려면 아래 코드처럼 i범위에 숫자로 쓰지말고 array.length 써주면됨
		//-> 방 개수만큼 런타임 돌게됨
		
		
		
		
		////////////////////////////////////
		//array는 resizing이 불가능하다 -> 배열은 한번 만들어지면 절대 늘어나지 않는다
//		int [] array = {1,2};
//		array = new int[3];
//		array[2] = 3;		//배열은 resizing이 안되기 때문에 새 주소로 생성해야함
								//방 두개 만들어놨는데 세번째 방에 값을 넣을수가 없음
								//똑같이 arrayIndexOutOfBounds 오류가 뜸
								//배열의 이런 고정사이즈 한계 때문에 컬렉션이 나왔음
		
		////////////////////////////////
		//배열의 값 복사
		//주소복사는 쉽지만 값 복사는 어려움 
		//System.arraycopy()라는 메소드를 사용
		
//		int [] original = {1,2,3,4,5};
//		int [] target = {10,9,8,7,6,5,4,3,2,1};
//		System.arraycopy(original, 2, target, 0, 3);		//original의 3,4,5를 10,9,8에 덮어쓰기
//		System.out.println(Arrays.toString(target));		
//		
//		original[2]=100;	//진짜 값복사가 된건지 확인 -> original 바꿔보기
//		System.out.println(Arrays.toString(target));		//값복사기 떄문에 출력결과는 바뀌지 않음
		
		
//		System.arraycopy(original, 0, target, 9, 5);
		//-> ArrayIndexOutOfBounds 에러남
		// 방크기가 정해져 있기 때문에 맨마지막에 5개 넣으려면 안들어감
	}
}

