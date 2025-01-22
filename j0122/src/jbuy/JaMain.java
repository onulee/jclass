package jbuy;

import java.util.Scanner;

public class JaMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 로그인구현
		// 보유한 금액, 보너스 포인트가 설정
		Buyer b = new Buyer(); //b 10000000,0
		System.out.printf("현재보유금액 : %,d \n",b.money);
		while(true) {
			System.out.println("[ 전자제품 쇼핑몰 ]");
			System.out.println("1. TV ");
			System.out.println("2. COMPUTER ");
			System.out.println("3. AUDIO ");
			System.out.println("구매를 원하는 번호를 입력하세요.");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				b.buy(new Tv());
				System.out.printf("현재보유금액 : %,d \n",b.money);
				System.out.printf("보유포인트 : %,d \n",b.bonusPoint);
				break;
			case 2:
				b.buy(new Computer());
				System.out.printf("현재보유금액 : %,d \n",b.money);
				System.out.printf("보유포인트 : %,d \n",b.bonusPoint);
				break;
				
			}
			
			
			
		}//while
		
		

	}//main

}
