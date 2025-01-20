package j0120;

import java.util.Scanner;

public class Cal2 {

	String[] strPrint() {
		String[] input = new String[3];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<input.length;i++) {
			System.out.println("이름을 입력하세요.>> ");
			input[i] = scan.next();
		}
		return input;
	}
}
