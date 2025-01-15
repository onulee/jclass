package j0115;

public class Ja0115_01 {

	public static void main(String[] args) {
		
		// score배열 100개를 만들어서, 1-100까지 숫자를 입력해서 출력하시오.
		// 배열에 들어가 있는 숫자 합계를 출력하시오.
		int[] score = new int[100];
		int sum = 0;
		// 1-10까지의 랜덤숫자를 입력해서 합계를 출력하시오.
		for(int i=0;i<100;i++) {
			score[i] = (int)(Math.random()*10)+1;
			System.out.println("랜덤숫자 : "+score[i]);
			sum += score[i];
		}
		
		System.out.println("합계 : "+sum);
		
//		//배열에 데이터 넣기
//		
//		//1.
//		int[] score = new int[10];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		score[5] = 6;
//		score[6] = 7;
//		score[7] = 8;
//		score[8] = 9;
//		score[9] = 10;
//		
//		//2.
//		int[] score2 = {1,2,3,4,5,6,7,8,9,10};
//		
//		//3.
//		int[] score3 = new int[10];
//		for(int i=0;i<10;i++) {
//			score3[i] = i+1;
//		}
		
//		int[] num = new int[10];
//		
//		for(int i=0;i<10;i++) {
//			num[i] = i;
//		}
//		
//		for(int i=0;i<10;i++) {
//			System.out.println(num[i]);
//		}
//		
//		int[] score;
		
		
//		int[] score = new int[5];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score[4]);
		//주소값 출력
//		System.out.println(score);
		
		
		
//		String str = new String("abc");
//		String str2 = "abc"; //
//		System.out.println(str);
//		
//		if(str==str2) {
//			
//		}
//		
//		if(str.equals(str2)) {
//			
//		}

	}

}
