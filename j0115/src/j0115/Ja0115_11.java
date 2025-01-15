package j0115;

public class Ja0115_11 {

	public static void main(String[] args) {
		//1차원배열
		// 1. 배열선언후 직접입력
		int[] num = new int[10];
		num[0] = 10;
		num[1] = 9;
		// 2. 배열바로 입력
		int[] n = {1,2,3,4,5};
		// 3. for문 입력
		int[] n2 = new int[10];
		for(int i=0;i<10;i++) {
			n2[i] = i+1;
		}
		
		//2차원배열
		int[][] score = new int[5][3];
		score[0][0] = 1;
		score[0][1] = 2;
		score[0][2] = 3;
		score[1][0] = 4;
		score[1][1] = 5;
		
		int[][] s = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		
		int[][] s2 = new int[5][3];
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				s2[i][j] = (3*i)+j+1;
			}
		}
		
		// 1차원배열은 for문 1개 사용
		// 2차원배열은 for문 2개 사용, 3차원배열은 for문 3개 사용
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(s2[i][j]);
			}
		}
		

	}

}
