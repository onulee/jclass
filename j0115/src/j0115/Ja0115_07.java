package j0115;

public class Ja0115_07 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		int i=0;
		loop:while(i<6) {
			int ranNum = (int)(Math.random()*45)+1;
			//동일한 숫자가 lotto배열에 있으면, 입력하지 않고 다음진행
			for(int j=0;j<i;j++) {
				if(lotto[j]==ranNum) {
					System.out.println("동일한 숫자가 있습니다. 숫자 : "+ranNum);
					continue loop;
				}
			}
			lotto[i] = ranNum;
			i++;
		}
		
		System.out.print("로또 번호 : ");
		for(int j=0;j<lotto.length;j++) {
			System.out.print(lotto[j]+" ");
		}
		System.out.println();

	}

}
