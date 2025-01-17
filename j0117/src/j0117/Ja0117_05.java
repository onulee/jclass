package j0117;

public class Ja0117_05 {

	public static void main(String[] args) {
		// 객체선언
		// aaa,1111,홍길동,20
		// bbb,2222,유관순,24
		// ccc,3333,이순신,22
		
		Stu[] s = new Stu[3];
		s[0] = new Stu();
		s[0].id = "aaa";
		s[0].pw = "1111";
		s[0].name = "홍길동";
		s[0].age = 20;
		System.out.println(s[0].id);
		
		s[1] = new Stu();
		s[1].id = "bbb";
		s[1].pw = "2222";
		s[1].name = "유관순";
		s[1].age = 24;
		
		s[2] = new Stu();

	}

}
