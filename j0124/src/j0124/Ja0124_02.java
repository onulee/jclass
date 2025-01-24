package j0124;

import java.util.ArrayList;
import java.util.Comparator;

public class Ja0124_02 {

	public static void main(String[] args) {
		ArrayList<Stu> list = new ArrayList<Stu>();
		
		list.add(new Stu("홍길동",100,100,100)); //1명 입력
//		list.add(1);
//		list.add(new Card());
		
		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
			System.out.printf("[%d,%s,%d]\n",list.get(i).getNo(),list.get(i).getName(),list.get(i).getTotal());
		}
		
		System.out.println("프로그램 종료");
		
//		ArrayList list = new ArrayList();
//		list.add(new Stu("홍길동",100,100,100)); //1명 입력
//		list.add(new Stu("유관순",90,90,90));
//		list.add(new Stu("이순신",95,95,95));
//		list.add(new Stu("강감찬",93,93,93));
//		list.add(new Stu("김구",80,80,80));
//		list.add(new Stu("홍길자",70,70,70));
//		list.add(new Stu("홍길순",75,75,75));
//		
//		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("[%d,%s,%d]\n",s.getNo(),s.getName(),s.getTotal());
//		}
		
		//문자열정렬
		list.sort(new Comparator<Stu>() {
			@Override //애너테이션 - 주석, 스프링 : 명령어...
			public int compare(Stu s1, Stu s2) {
				return s2.getName().compareTo(s1.getName()); //역순정렬
//				return s1.getName().compareTo(s2.getName()); //순차정렬
			}
		});
		
		// 숫자정렬
//		list.sort(new Comparator<Stu>() {
//			@Override //숫자비교, 문자열 비교
//			public int compare(Stu s1, Stu s2) {
////				return s1.getTotal()-s2.getTotal(); //역순정렬
//				return s2.getTotal()-s1.getTotal();     //순차정렬
//			}
//		});
		
//		System.out.println("---------   순차정렬   -----------------");
//		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("[%d,%s,%d]\n",s.getNo(),s.getName(),s.getTotal());
//		}
		
		

	}

}
