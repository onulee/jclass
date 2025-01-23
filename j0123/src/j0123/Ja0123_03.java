package j0123;

import java.util.Scanner;

public class Ja0123_03 {

	public static void main(String[] args) {
		
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			throw new Exception(); // 고의로 에러 발생
            //System.out.println(3/0); //에러발생
			// 정상적으로 돌아가는 프로그램 구현
		} catch (Exception e) {
		    System.out.println(e.getMessage());
			e.printStackTrace(); // 에러가 났을때 에러 위치, 에러 설명
			// 에러가 났을때 실행되는 부분
			System.out.println("4-2");
		}
		System.out.println(5);
		System.out.println(6);
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.printn("안녕하세요."); //오타 : 컴파일에러
//		int[] n = new int[3];
//		for(int i=0;i<4;i++) {
//			System.out.println("숫자를 입력하세요.");
//			n[i] = scan.nextInt(); // 런타임에러 
//			
//		}

	}

}
