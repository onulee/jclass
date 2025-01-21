package j0121;

public class Deck {
	//생성자
	Deck(){
		//입력
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(s[i],j+1);
			}
		}
	}
	
	//변수선언
	Card[] c = new Card[52]; //Card 배열
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","k"};
	String[] s = {"Spade","Diamond","Heart","Clover"};
	
	//카드전체 출력메소드
	void print_all(int no) {
		System.out.printf("     [ %d개 출력 ]\n",no);
		System.out.println("---------------------------");
		for(int i=0;i<no;i++) {
			System.out.printf("[%s,%s]\n",c[i].shape,n[c[i].number]);
		}
	}//print_all()
	
	// 오버로딩
	void print_all(Card c) {
		System.out.printf("     [ 카드확인 ]\n");
		System.out.println("---------------------------");
		System.out.printf("[%s,%s]\n",c.shape,n[c.number]);
	}//print_all()
	
	//섞기 메소드
	void shuffle() {
		Card temp = null;
		int randomN = 0;
		for(int i=0;i<300;i++) {
			randomN = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[randomN];
			c[randomN] = temp;
		}
	}//shuffle
	
	Card pick(int no) {
		if(no>=0 && no<=51) {
			return c[no];
		}else {
			System.out.println("[경고] 번호 확인을 하셔야 합니다.");
			return c[0];
		}
	}
	
	

}
