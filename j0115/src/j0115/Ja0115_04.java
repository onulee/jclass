package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_04 {

	public static void main(String[] args) {
		// 1-100 랜덤숫자를 생성
		// 10번의 도전으로 해서 정답을 맞추면 종료
		// 랜덤숫자보다 큰수, 작은수입니다.
		// 입력한 숫자를 모두 출력
		
		// 랜덤숫자 : 55
		// 입력한 숫자 : 1,2,3,4,55
		// 도전 : 5
		
		Scanner scan = new Scanner(System.in);
		int randomN = (int)(Math.random()*100)+1; //랜덤숫자
		int[] num = new int[10]; //입력한 숫자배열
		int count = 0;          // 도전횟수 변수
		for(int i=0;i<10;i++) { //최소1, 최대10
			count += 1;
			System.out.printf("%d 번째 도전 (숫자입력) : ",i+1);
			int input = scan.nextInt();
			num[i] = input; //입력한 숫자를 배열에 저장
			//비교
			if(randomN>input) {
				System.out.println("입력숫자가 작습니다.");
			}else if(randomN<input) {
				System.out.println("입력숫자가 큽니다.");
			}else {
				System.out.println("정답입니다.");
				break;
			}
			
		}
		
		System.out.printf("랜덤숫자 : %d \n",randomN);
		System.out.printf("도전 : %d \n",count);
		System.out.print("입력숫자 : ");
		for(int i=0;i<count;i++) {
			if(i==0) {
				System.out.print(num[i]);
			}else {
				System.out.print(","+num[i]);
			}
		}


	}

}
