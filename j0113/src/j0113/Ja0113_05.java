package j0113;

public class Ja0113_05 {

	public static void main(String[] args) {
		
		// boolean - true,false
		// char - ''표시, 아스키코드값 : 65-'A', 97-'a', 48 - '0'
		// 정수형 - byte,short 거의사용안함.  기본형 정수 int - 값을 입력
		// 정수형 - long : 접미사 L붙여야 함.
		// 실수형 - float,double  float - 접미사 F, double - D 생략가능
		
		
		char ch = 'A';
		System.out.println(ch);
		
		char ch2 = '\u0041'; // 16*4 + 1*1 = 64+1 = 65
		System.out.println(ch2);
		
		char ch3 = 97;       // 97 - a
		System.out.println(ch3);
		
		char ch4 = '\t';
		System.out.print(ch4);
		
		char ch5 = 'a';
		System.out.print(ch5);
		
		char ch6 = 'b';
		System.out.print(ch6);
		
		char ch7 = 'c';
		System.out.print(ch7);
		
		boolean p = true;
		boolean p2 = false;
		
		long l = 10000000000L;
		
		float f = 3.14F;
		float f2 = 100F;
		
		double d = 3.14;
		
		
		

	}

}
