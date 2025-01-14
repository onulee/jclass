package j0113;

public class Ja0113_07 {

	public static void main(String[] args) {
		// 형변환
		int n1 = 48;
		char ch1 = (char)n1; //int->char : 강제형변환 변환하려는 타입을 붙여줌.
		System.out.println(n1);
		System.out.println(ch1);
		
		char ch2 = 'a';
		int n2 = ch2; //변환하려는 타입 생략가능
		System.out.println(n2);
		
		float f1 = 3.14f;
		int n3 = (int)f1;
		System.out.println(n3);
		
		int n4 = 10;
		float f2 = n4;
		System.out.println(f2);
		
		
		

	}

}
