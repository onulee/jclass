package j0120;

import java.util.Scanner;

public class Input {

	int valInput() {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		System.out.println("숫자를 입력하세요.>> ");
		input = scan.nextInt();
		return input;
	}
}
