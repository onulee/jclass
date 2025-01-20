package j0120;

import java.util.Arrays;

public class Ja0120_04 {

	public static void main(String[] args) {
		
		//두수를 Cal3에 보내면 +,-,* 의 값을 리턴해서 출력하시오.
		Cal3 c3 = new Cal3();
		int[] re = new int[3];
		int a = 10;
		int b = 3;
		System.out.println(Arrays.toString(re));
		c3.op(a, b, re);
		System.out.println(Arrays.toString(re));
		
		// Cal2 - strPrint() 에서 이름을 입력받아
		// main메소드에서 str변수로 넘겨받아 출력하시오.
//		Cal2 c2 = new Cal2();
//		String[] input = c2.strPrint();
//		System.out.println(Arrays.toString(input));
		
//		//객체선언
//		Input i = new Input();
//		
//		int[] input = new int[5];
//		//입력
//		for(int j=0;j<input.length;j++) {
//			 input[j] = i.valInput();
//		}
//		//출력
//		for(int j=0;j<input.length;j++) {
//			System.out.println("입력값 : "+input[j]);
//		}
//		
		
		
		
		
		
		
		
//		int a = 10;
//		int b = 3;
//		
//		Cal c = new Cal();
//		int result = c.multi(a, b);
//		System.out.println(result);
//		
//		int result2 = c.add(a, b);
//		System.out.println(result2);
//		
//		double result3 = c.div(a, b);
//		System.out.println(result3);

	}

}
