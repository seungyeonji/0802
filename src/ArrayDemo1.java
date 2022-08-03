
public class ArrayDemo1 {
	public static void main(String[] args) {
		//Rectangular Array
		//1st way
//		int [][] array = null;		//Declaration & Initialization
//		array = new int[2][3];	//Creation, 메모리에 2행 3열 공간을 만듬(방6개, 24바이트)
										//new는 주소를 만드는 연산자
//		array[0][0] = (int)(Math.random() * 10 + 1);
//		array[0][1] = (int)(Math.random() * 10 + 1);
//		array[0][2] = (int)(Math.random() * 10 + 1);
//		array[1][0] = (int)(Math.random() * 10 + 1);
//		array[1][1] = (int)(Math.random() * 10 + 1);
//		array[1][2] = (int)(Math.random() * 10 + 1);		//Assignment
		
		//2nd way : 생성+할당
//		int [][] array;		//Declaration
//		array = new int [][] {{3,4,5,6}, {7,8,9,10}}; 	//Creation & Assignment
		
		//3rd way : 선언+할당
//		int [][] array = {
//				{1,2,3,4},
//				{5,6,7,8},
//				{9,10,11,12}
//		};
		
		
		//Ragged(Jagged) Array : 각층의 열의 개수가 다른 2차원배열
		//1st way
//		int [][] array;		//Declaration
//		array = new int[3][];	//Creation, 열의 개수는 몰라도됨
//		array[0] = new int[3];		//0층에 방을 3개 만들겠다
//		array[1] = new int[2];
//		array[2] = new int[1];
//		array[0][0] = (int)(Math.random()*10+1);
//		array[0][1] = (int)(Math.random()*10+1);
//		array[0][2] = (int)(Math.random()*10+1);
//		array[1][0] = (int)(Math.random()*10+1);
//		array[1][1] = (int)(Math.random()*10+1);
//		array[1][2] = (int)(Math.random()*10+1);	//Assignment
		
		
		//2nd way : 생성+할당
//		int [][] array;		//Declaration
//		array = new int[3][];
//		array[0] = new int[] {3,4,5,6,7,8};
//		array[1] = new int[] {9,10};
//		array[2] = new int[] {11,12,13,14};
		
		//3rd way
		int [][] array = {
				{3,4,5,6},
				{7,8},
				{9,10,11,12,13,14} 
		};
		
		for(int i = 0; i<array.length;i++) {		//2차원배열이니까 2중for문
															//array는 행에 대한 주소를 갖고 있으니까 length하면 방 3개라는 거를 알고있음
			System.out.println("array" + i + "층");
			for(int j=0; j<array[i].length; j++) {
				System.out.print("array[" + i + "][" + j + "] = " + array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
