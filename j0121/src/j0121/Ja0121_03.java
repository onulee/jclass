package j0121;

public class Ja0121_03 {

	public static void main(String[] args) {
		// Card 52장을 생성한후 1-13, Spade,Diamond,Heart,Clover
		// 출력하시오.
		Deck d = new Deck();
		
		//전체출력
		d.print_all(52);
		
		//섞기실행
		d.shuffle();
		
		// 10번째 카드를 선택
		Card c = d.pick(10);
		d.print_all(c);
		
		//전체출력
		d.print_all(5);
		
		
		
		
		
		
		
		
		

	}

}
