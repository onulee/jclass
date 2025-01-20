package j0120;

import java.util.Scanner;

public class Ja0120_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Stuscore[] s = new Stuscore[10]; //배열선언
		int no=0,kor=0,eng=0,math=0,total=0,rank=0;
		int[] score = new int[3];
		String name="";		
		double avg = 0;
		
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int choice = 0,temp = 0,rankC = 0,count=0;  //번호선택, 검색확인, 등수, 학생수 확인
		
		//무한반복
		loop:while(true) {
			//화면구현
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수처리");
			System.out.println("0. 종료");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요. >> ");
			choice = scan.nextInt();
			
			switch (choice) {
			case 1: 
				System.out.println("[ 학생성적 입력 ]");
				//입력
				while(count<10) {
					System.out.printf("[ %d 번째 ]\n",count+1);
					//이름
					System.out.println("이름을 입력하세요.(0.이전페이지 이동) ");
					name = scan.next();
					//0인지 확인
					if(name.equals("0")) {
						break;
					}
					
					for(int i=0;i<score.length;i++) {
						System.out.printf("%s 점수를 입력하세요.",title[i+2]);
						score[i] = scan.nextInt();
					}
					// name,kor,eng,math -> no,total,avg
					s[count] = new Stuscore(name, score[0], score[1], score[2]);
					
					s[count].print();
					System.out.println("학생성적이 저장되었습니다.");
					count++;
				}//while
				break;
				
			case 2:
				System.out.println("[ 학생성적 출력 ]");
				
				//출력
				System.out.println("                       [ 학생성적 ]");
				System.out.println("-------------------------------------------------------------");
				for(int j=0;j<title.length;j++) {
					System.out.printf("%s\t",title[j]);
				}
				System.out.println();
				System.out.println("-------------------------------------------------------------");
				for(int j=0;j<count;j++) {
					System.out.printf("%d\t",s[j].no);
					System.out.printf("%s\t",s[j].name);
					System.out.printf("%d\t",s[j].kor);
					System.out.printf("%d\t",s[j].eng);
					System.out.printf("%d\t",s[j].math);
					System.out.printf("%d\t",s[j].total);
					System.out.printf("%.2f\t",s[j].avg);
					System.out.printf("%d\n",s[j].rank);
				}
				System.out.println();
				break;
			case 3:
				System.out.println("[ 학생성적 수정 ]");
				// 수정할 학생이름을 입력하시오.
				System.out.println("수정할 학생이름을 입력하세요.>> ");
				String search  = scan.next();
				
				//name배열
				temp = 0;
				int searchNo = 0;
				for(int j=0;j<count;j++) {
					if(search.equals(s[j].name)) {
						searchNo = j; //위치값
						temp = 1;     //검색이 있음.
					}
				}
				
				if(temp == 0) {
					System.out.println("검색한 학생을 찾지 못했습니다.");
				}else {
					System.out.printf("[ %s 학생 성적 수정 ]\n",search);
					System.out.println("1.국어점수수정");
					System.out.println("2.영어점수수정");
					System.out.println("3.수학점수수정");
					System.out.println("-----------------------");
					System.out.println("원하는 번호를 입력하세요.>> ");
					choice = scan.nextInt();
					switch(choice) {
					case 1:
						System.out.println("[ 국어점수 수정 ]");
						System.out.printf("현재점수 : %d \n",s[searchNo].kor);
						System.out.println("변경점수를 입력하세요. >> ");
						s[searchNo].kor = scan.nextInt();
						break;
					case 2:
						System.out.println("[ 영어점수 수정 ]");
						System.out.printf("현재점수 : %d \n",s[searchNo].eng);
						System.out.println("변경점수를 입력하세요. >> ");
						s[searchNo].eng = scan.nextInt();
						break;
					case 3:
						System.out.println("[ 수학점수 수정 ]");
						System.out.printf("현재점수 : %d \n",s[searchNo].math);
						System.out.println("변경점수를 입력하세요. >> ");
						s[searchNo].math = scan.nextInt();
						break;
					}//switch
					s[searchNo].total = s[searchNo].kor+s[searchNo].eng+s[searchNo].math;
					s[searchNo].avg = s[searchNo].total/3.0;
				}
				break;
			case 4:	
				System.out.println("[ 등수처리 ]");
				for(int j=0;j<count;j++) {
					rankC = 1; //리셋
					for(int k=0;k<count;k++) {
						if(s[j].total<s[k].total) {
							rankC++;
						}
					}
					s[j].rank = rankC;
				}
				
				System.out.println("등수처리가 완료되었습니다.");
				System.out.println();
				break;	
			
			default:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}
			
		}//while loop 
		

	}

}
