package j0115;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ja0115_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		int[] input = new int[6];
		
		String[] balls = new String[45];  // 번호 45개
		//1-45 번호저장
		for(int i=0;i<balls.length;i++) {
			balls[i] = i+1+"";
		}
		
		int i=0;
		while(i<6) {
			System.out.print("           [ 로또맞추기 ]");
			for(int j=0;j<balls.length;j++) {
				if(j%5==0) {
					System.out.println();
				}
				System.out.print(balls[j]+"\t");
			}
			
			System.out.println();
			System.out.printf("원하는 번호를 입력하세요.( 입력: %d번째 ) : \n",i+1);
			input[i] = scan.nextInt();
			// 입력한 번호 5 -> 5번자리 X를 입력
     		balls[input[i]-1] = "X";
			i++;
		}
		
		// 입력번호 : 모두출력되도록 하시오.
		System.out.println("입력번호 : "+Arrays.toString(input));
		
		
//		int[] num = {11,9,13,28,5,20,7};
//		Integer[] num2 = {11,9,13,28,5,20,7};
//		System.out.println(Arrays.toString(num));
//		//순차정렬
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
//		//역순정렬
//		Arrays.sort(num2,Collections.reverseOrder());
//		System.out.println(Arrays.toString(num2));
		

	}

}
