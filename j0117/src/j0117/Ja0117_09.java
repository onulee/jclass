package j0117;

import java.util.Scanner;

public class Ja0117_09 {

//	//메소드
//	int add(int a,int b) {
//		int result = a+b;
//		return result;
//	}
//	
//	boolean power; //인스턴스변수 - 객체선언후, 참조변수명.변수명
//	void power() {
//		power = !power;
//	}
	
	//메소드
	public static void main(String[] args) {
		
		//2개의 값을 넘겨주면
		// 메소드 3개
		// a,b -> a,b 각각 10더해서 두수를 더하기를 해서 리턴
		// a,b -> a,b 각각 10곱해서 두수를 더하기 해서 리턴
		// a,b -> a,b 곱해서 리턴
		Scanner scan = new Scanner(System.in);
		Cal2 c = new Cal2(); //객체선언
		
		while(true) {
			//입력이 -1 들어오면 프로그램을 종료하시오.
			System.out.println("1. 숫자를 입력하세요.>> ");
			int a = scan.nextInt();
			if(a==-1) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("2. 숫자를 입력하세요.>> ");
			int b = scan.nextInt();
			
			// 출력
			int result = c.method1(a, b);
			System.out.println(result);
			int result2 = c.method2(a, b);
			System.out.println(result2);
			int result3 = c.method3(a, b);
			System.out.println(result3);
			
		}
		
		
		
//		Cal c = new Cal(); //객체선언
//		//
//		int num = 100;
//		int num2 = 20;
//		
//		int result = c.add(num, num2);
//		System.out.println("더하기 : "+result);
//		
//		int result2 = c.sub(num,num2);
//		System.out.println("빼기 : "+result2);
//		
//		c.mult(num, num2);
		
		
		
		
//		int a = 0; //지역변수
//		Ja0117_09 j = new Ja0117_09();
//		j.power = true;
//		System.out.println(j.power);

	}

}
