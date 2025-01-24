package j0123;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ja0123_08 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add("abc");
		set.add("aaa");
		set.add("ccc"); // 순서X, 중복X
		set.add("aaa"); //안됨.
		set.add("ggg");
		
		System.out.println("개수 : "+set.size());
		
		Iterator i = set.iterator(); //1회성
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("------");
		Iterator i2 = set.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		
		
//		for(int i=0;i<set.size();i++) {
//			System.out.println(set.get(i)); //값출력
//		}
		
		
		
		
//		ArrayList list = new ArrayList();
//		
//		for(int i=0;i<10;i++) {
//			list.add(i+1); //값입력
//		}
//		
//		// 기본형태 - 데이터 읽어오기
//		Iterator i1 = list.iterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
//		
//		// 편하게 사용하는 형태
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i)); //값출력
//		}

	}

}
