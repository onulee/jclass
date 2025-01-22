package jbuy;

public class Buyer {
	
	int money=10000000; //보유한 현금 :1천만원
	int bonusPoint=0;  //보유한 보너스포인트
	
	Buyer(){}
	Buyer(int money,int bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	void buy(Tv t) {
		System.out.println("TV를 구매합니다.");
		money -= t.price;
		bonusPoint += t.bonusPoint;
	}
	void buy(Computer c) {
		System.out.println("컴퓨터를 구매합니다.");
		money -= c.price;
		bonusPoint += c.bonusPoint;
	}
	
	

}
