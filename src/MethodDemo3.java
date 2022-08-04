
public class MethodDemo3 {
	public static void main(String[] args) {
//		System.out.println(mymethod(50)); 	
	}
//	static String mymethod(int su) {	//주소 없이 접근하고 싶으면 static, return값이 String이기 때문에 리턴타입은 String
////		return 5; //return type : int
////		return 500_000_000_000L; //retrun type : long
////		return "Hello", 5; //불가능 -> 반드시 하나만 한번만 리턴해야함
//		
//		//return 2개 쓰는 방법 있긴함 -> 조건문
//		if(su%2 ==0) return "Hello";
//		else return "Wolrd";		//return이 두개더라도 하나만 출력함
//										//즉, return은 한번만, 하나만 하게됨
//	}
	
	
	//굳이 리턴을 두개 넘기고 싶다면 배열에 담아서 넘기면 됨, 타입 다르면 객체로 넘기면 됨
//	static int [] mymethod() {	//배열의 개수는 결국 한개, 리턴타입은 int array
//		return new int [] {5,9,4,5,6,7,8,9};
//	}
	
	static Student mymethod() {
		Student jimin = new Student();
		jimin.name = "한지민";
		jimin.age = 26;
		return jimin;
	}	//이 경우 서로 다른 타입 두개를 넘겨줌 -> 객체를 만들어서 넘겨주면 됨
	// 리턴을 여러번:조건문, 여러개:배열(동일타입) 또는 객체(다른타입) 사용
	
}
