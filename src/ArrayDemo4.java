//cmd 창에서 실행
public class ArrayDemo4 {
	public static void main(String[] array) {	//args를 array로 변경(안바꾸고 그대로 써도 되는데 그럼 for문에섣도 args.length 써줘야함
		//java ArrayDemo4 mango banana apple
		// -> mango, banana, apple이 ArrayDemo4에 들어감
		//main 메소드의 (String[] args) 괄호안에 String 배열이 받음
		
		
		//java ArrayDemo4 45+78
		for(int i = 0; i<array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
		if(array.length !=3) {
			System.err.println("Usage Error");
			System.exit(-1);	//프로그램 강제로 멈추기(0은 정상종료, -1은 비정상종료)
		}	//이항연산자이기 때문에 모자라게 넣거나 오버해서 넣으면 안됨
		
		int first = Integer.parseInt(array[0]);		//"45" -> 45
		int second = Integer.parseInt(array[2]);	//"78" -> 78
		switch(array[1]) {
		case "+" :
			System.out.printf("%d + %d = %d\n", first, second, (first+second));
			break;
		case "-" :
			System.out.printf("%d - %d = %d\n", first, second, (first-second));
			break;
		case "x" :
			System.out.printf("%d x %d = %d\n", first, second, (first*second));
			break;
		case "/" :
			System.out.printf("%d / %d = %d\n", first, second, (first/second));
			break;
		case "%" :
			System.out.printf("%d %% %d = %d\n", first, second, (first%second));
			break;
		default : System.out.println("그런 연산자는 없습니다");
		}
	}
}
