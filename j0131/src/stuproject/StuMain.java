package stuproject;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		
		System.out.println("-------------------------");
		System.out.println("   [ 학생성적프로그램 ]");
		System.out.println("-------------------------");
		System.out.println("1. 학생성적입력");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적삭제");
		System.out.println("5. 학생성적검색");
		System.out.println("6. 학생등수정렬");
		System.out.println("7. 학생이름정렬");
		System.out.println("8. 등수처리");
		System.out.println("9. 파일저장");
		System.out.println("0. 프로그램 종료");
		System.out.println("-------------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		choice = scan.nextInt();

	}

}
