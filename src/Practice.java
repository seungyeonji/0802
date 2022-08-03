
public class Practice {
	public static void main(String[] args) {
		int [] answer= {1,2,3,4,1,2,3,4,1,2};
		String [] names = {"한지민", "박지민", "홍지민", "신지민", "김지민"};
		int [][] array = {		//제출답안
				{1,2,2,4,2,2,3,4,1,2},
				{1,2,3,4,1,1,1,4,1,1},
				{1,2,3,4,1,2,3,4,1,2},
				{1,3,3,3,3,3,3,3,1,2},
				{1,2,3,4,1,2,3,1,1,2}
		};
		char [][] results = new char[names.length][10];	//채점결과
		int [] jumsus = new int[names.length];		//점수
		
		for(int i = 0; i<results.length; i++) {
			int jumsu = 0;		//점수 초기화
			for(int j = 0; j<results[i].length; j++) {
				if(array[i][j]==answer[j]) {
					results[i][j] = 'O';
					jumsu += 10;
				}
				else results[i][j] = 'X';
			}
			jumsus[i] = jumsu;
		}
		
		///////////////////////////////////////////////채점결과 출력
		
		for(int i = 0; i< results.length; i++) {
			System.out.print(names[i] + " : ");
			for(int j = 0; j<results[i].length; j++) {
				System.out.printf("%c\t", results[i][j]);
			}
			System.out.println("(" + jumsus[i] + "점)");
		}
	}
}
