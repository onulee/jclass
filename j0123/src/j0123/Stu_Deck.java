package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Deck {
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int no=0,kor=0,eng=0,math=0,total=0,rank=0;
	String name = "";
	double avg = 0;
	int choice = 0,temp = 0,rankC = 0;  //번호선택, 검색확인,등수
	
	//0. 상단메뉴 메소드
	int main_print() {
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 성적 삭제");
		System.out.println("5. 등수처리");
		System.out.println("0. 종료");
		System.out.println("-------------------------");
		System.out.println("원하는 번호를 입력하세요. >> ");
		choice = scan.nextInt();
		return choice;
	}//main_print
	
	//1. 입력메소드
	void input() {
		System.out.println("[ 학생성적 입력 ]");
		//입력
		while(true) {
			System.out.printf("[ %d 번째 ]\n",list.size()+1);
			//이름
			System.out.println("이름을 입력하세요.(0.이전페이지 이동) ");
			name = scan.next();
			//0인지 확인
			if(name.equals("0")) {
				break;
			}
			//국어,영어,수학
			System.out.printf("국어 점수를 입력하세요.\n");
			kor = scan.nextInt();
			System.out.printf("영어 점수를 입력하세요.\n");
			eng = scan.nextInt();
			System.out.printf("수학 점수를 입력하세요.\n");
			math = scan.nextInt();
			
			//list저장
			list.add(new Stu(name,kor,eng,math));
			System.out.printf("%s 학생이 저장되었습니다. \n",name);
		}//while
	}//input
	
	
	//2. 출력메소드
	void output() {
		System.out.println("[ 학생성적 출력 ]");
		//출력
		System.out.println("                       [ 학생성적 ]");
		System.out.println("-------------------------------------------------------------");
		for(int j=0;j<title.length;j++) {
			System.out.printf("%s\t",title[j]);
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		for(int j=0;j<list.size();j++) {
			Stu s = (Stu)list.get(j); //Object
			System.out.printf("%d\t",s.getNo());
			System.out.printf("%s\t",s.getName());
			System.out.printf("%d\t",s.getKor());
			System.out.printf("%d\t",s.getEng());
			System.out.printf("%d\t",s.getMath());
			System.out.printf("%d\t",s.getTotal());
			System.out.printf("%.2f\t",s.getAvg());
			System.out.printf("%d\n",s.getRank());
		}
		System.out.println();
	}//output

}//class
