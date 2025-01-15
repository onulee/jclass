package j0115;

public class Ja0115_08 {

	public static void main(String[] args) {
		// 1-10까지 랜덤숫자를 저장하는데, 동일한 번호가 없게 저장하시오.
		
		int[] num = new int[10];
		int i = 0;
		loop:while(i<10) {
			int randomN = (int)(Math.random()*10)+1;
			for(int j=0;j<i;j++) {
				if(num[j]==randomN) {
					System.out.println("번호가 동일합니다. "+ randomN);
					continue loop;
				}
			}
			num[i] = randomN;
			i++;
		}
		
		System.out.print("랜덤입력숫자 : ");
		for(int j=0;j<10;j++) {
			System.out.print(num[j]+" ");
		}
		System.out.println();
		
		//배열을 랜덤섞기 출력하는 방법
		
		int[] num2 = new int[10];
		//입력
		for(int j=0;j<10;j++) {
			num2[j] = j+1;
		}
		
		//섞기
		int temp = 0;
		for(int j=0;j<300;j++) {
			int ran = (int)(Math.random()*10);
			temp = num2[0];
			num2[0] = num2[ran];
			num2[ran] = temp;
		}
		
		System.out.print("랜덤입력숫자 : ");
		for(int j=0;j<10;j++) {
			System.out.print(num2[j]+" ");
		}
		System.out.println();
		
		

	}

}
