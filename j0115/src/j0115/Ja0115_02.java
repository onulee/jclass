package j0115;

import java.util.Scanner;

public class Ja0115_02 {

	public static void main(String[] args) {
		// 5개의 숫자를 입력받아, 5개를 저장하고, 5개의 값을 출력하고 합계를 출력
	    Scanner scan = new Scanner(System.in);
	    int[] input = new int[4];
	    int sum = 0;
	    for(int i=0;i<input.length;i++) {
	    	System.out.printf("%d번째 숫자를 입력하세요. \n",i+1);
	    	input[i] = scan.nextInt();
	    	sum += input[i];
	    }
	    for(int i=0;i<input.length;i++) {
	    	System.out.printf("%d번째 숫자 : %d \n",i+1,input[i]);
	    }
	    
	    
	    
	    System.out.println("합계 : "+sum);
	    
	    
	    
	    
	    
//	    System.out.println("숫자를 입력하세요. ");
//	    int input1 = scan.nextInt();
//	    System.out.println("숫자를 입력하세요. ");
//	    int input2 = scan.nextInt();
//	    System.out.println("숫자를 입력하세요. ");
//	    int input3 = scan.nextInt();
//	    System.out.println("숫자를 입력하세요. ");
//	    int input4 = scan.nextInt();
//	    System.out.println("숫자를 입력하세요. ");
//	    int input5 = scan.nextInt();

	}

}
