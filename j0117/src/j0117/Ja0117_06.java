package j0117;

public class Ja0117_06 {

	static int c = 0;     //1. 클래스변수 - 프로그램이 실행되면 사용가능
	int num = 10;         //2. 인스턴스 변수 - 객체선언을 해야 사용가능
	
	public static void main(String[] args) {
		
		Stu.count = 1;
		System.out.println(Stu.count);
		
		
		
		
//		//1-100까지의 합을 구하시오.
//		// 1-100 -> 200을 넘는 시점의 i의 값을 출력하시오.
//		// 1,2,3,4,5
//		// 1,3,6,10,15.......
//		int sum = 0;
//		int k = 0;
//		int sum2 = 0;
//		int k2 = 0;
//		for(int i=1;i<=100;i++) {
//			sum += i;
//			if(sum>200) {
//				k = i;
//				k2 = i-1;
//				sum2 = sum - i;
//				break;
//			}
//		}
//		//-------------------------------
//		// 200 바로 전단계 -----------------
//		System.out.println("i-1의 값 : "+k2);
//		System.out.println("합계 : "+sum2);
//		// 200넘는 시점 --------------------
//		System.out.println("i의 값 : "+k);
//		System.out.println("합계 : "+sum);
//		
//		
		
		
//		int a = 5;       //3. 지역변수 - 객체선언을 해야 사용가능
//		System.out.println(a);

	}

}
