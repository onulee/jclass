package j0123;

import java.util.Scanner;

public class Ja0123_06 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Scanner scan = new Scanner(System.in);
		
		String a = new String("a");
		StringBuffer str = new StringBuffer("aaa");
		System.out.println(a+2+"aaa"+3.14+10.0); // 
		System.out.println(str.append(2).append("aaa").append(3.14));
		
		
//		String a = "a";
//		for(int i=0;i<10;i++) {
//			a += i;
//		}
		
//		// indexOf 
//		String str = "bbaaccAABBCCaaddeeffAAaa";
////		System.out.println(str.indexOf("aa",0));
////		System.out.println(str.indexOf("aa",3));
////		System.out.println(str.indexOf("aa",13));
////		System.out.println(str.indexOf("aa",23));
//		int count = 0;
//		for(int i=0;i<str.length();i++) {
//			if(str.indexOf("aa",i)!=-1) { //aa가 있을때
//				i = str.indexOf("aa",i); // 2
//				System.out.println("aa 존재하는 위치 : "+i);
//				count++;
//			}else { //aa가 없을때
//				break;
//			}
//		}
//		
//		System.out.println("aa가 존재하는 개수 : "+count);
//		
		
		//valueOf
//		int a = 10;
//		double b = 3.14;
//		String a1 = String.valueOf(a); //문자열
//		String a2 = String.valueOf(b); //문자열
//		String a3 = ""+a;
//		String a4 = ""+b;
//		
//		String str1 = "3.14";
//		String str2 = "100";
//		
//		double a5 = Double.parseDouble(str1);
//		int a6 = Integer.parseInt(str2);
		
//		String[] arr = {"홍길동임","유관순입니다.","이순신이다","강감찬일까요?","김구에요","홍길순","홍길자임다"};
//		// 첫글자만 빼고, 마지막글자 빼고 모두 출력하시오
//		//길동임, 관순입니다.,순신이다,감찬일까요?....
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i].substring(1,arr[i].length()-1));
//		}
		
		
//		String str = "1조1234567";
//		//1234 만 출력
//		System.out.println(str.substring(2,6));
//		System.out.println(str.substring(2));
//		System.out.println(str.substring(0,2));
		
		//length() : 문자의 길이
//		String str = "안녕하세요. 반갑습니다. 홍길동입니다.";
//		System.out.println("10자이내로 글자를 입력하세요.>>");
//		//10자 이상이면 글자를 다시 입력하세요.
//		System.out.println(str.length());
//		
//		while(true) {
//			System.out.println("글자를 입력하세요.(10자 이내) >> ");
//			String input = scan.next();
//			if(input.length()<10) {
//				System.out.println("당신이 입력한 글자 : "+input);
//				break;
//			}else {
//				System.out.println("글자를 다시 입력하세요.!!");
//			}
//		}
		
		
		//replace 빈공백 제거
//		String str = "      안녕     하세   요     ";
//		System.out.println(str.replace(" ", ""));
		
		
		//replace : 문자를 다른문자로 대체
//		String str = "안녕하세요.홍길동입니다. 성은 홍입니다.";
//		String input = "김";
//		str.replace("홍", "김");
//		System.out.println(str.replace("홍", "김"));
//		System.out.println(str); //원본은 변경되지 않음.
		
		
		// trim : 빈공백제거
//		String str = "      안녕     하세   요     ";
//		System.out.println(str);
//		System.out.println(str.trim());
		
		
		//indexOf : 존재하는 위치값을 알려줌.
//		String str = "안녕하세요. 성은 홍입니다.";
//		String input = "김";
//		System.out.println("있는 위치 : "+str.indexOf(input));
//		int no = str.indexOf(input);
		
		
		//contains : 문자열 포함되어 있는지 확인
//		String[] arr = {"홍길동","유관순","이순신","강감찬","김구","홍길순","홍길자"};
//		String str = "안녕하세요. 성은 홍입니다.";
//		String input = "홍";
//		
//		// arr의 배열에서 홍 있는 이름을 출력하시오.
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i].contains(input)) {
//				System.out.println(arr[i]);
//			}
//		}
		
//		if(str.contains(input)) {
//			System.out.println("홍이라는 글자가 있습니다.");
//		}else {
//			System.out.println("홍이라는 글자는 없습니다.");
//		}
		
		
		
		
		
//		String str = "1,홍길동,89,100,93,0,0,0,0";
		// 학번 : 1
		// 이름 : 홍길동
		// 국어 : 89
		// 영어 : 100
		// 수학 : 93
		// 합계 : 300
		// 평균 : 100.0
		// 등수 : 0
		// 출력하시오.
		
//		String[] arr = str.split(",");
//		System.out.println("번호 : "+arr[0]);
//		System.out.println("이름 : "+arr[1]);
//		int kor = Integer.parseInt(arr[2]);
//		System.out.println("국어 : "+arr[2]);
//		int eng = Integer.parseInt(arr[3]);
//		System.out.println("영어 : "+arr[3]);
//		int math = Integer.parseInt(arr[4]);
//		System.out.println("수학 : "+arr[4]);
//		System.out.println("합계 : "+(kor+eng+math));
//		System.out.println("평균 : "+((kor+eng+math)/3.0));
//		System.out.println("등수 : "+arr[7]);
		
		
		
//		String str = "5";
//		int n = Integer.parseInt(str); //문자열을 숫자로 변경
		
//		System.out.println("숫자를 입력하세요.>> 10,9");
//		// 두수의 합,곱을 구하시오. 
//		String str = scan.next();
//		String[] arr = str.split(",");
//		int n1 = Integer.parseInt(arr[0]);
//		int n2 = Integer.parseInt(arr[1]);
//		System.out.println(n1+n2);
//		System.out.println(n1*n2);
		
		
		//split : 특정 분리자로 분리
//		String str = "100,100,100";
//		String[] arr = str.split(",");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		
		
		//concat : 문자열 합치기
//		String str = "안녕";
//		String str2 = "반가워";
//		System.out.println(str.concat(str2));
		
		
		
		//charAt : 지정된 위치의 문자 반환
//		String str = "abcdef";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
		
		
		//equals : 대소문자 구분 비교 , equalsIgnoreCase : 대소문자 구분없이 비교
//		String str = "abc";
//		String str2 = "aBc";
//		String str3 = "abc";
//		
//		if(str.equalsIgnoreCase(str2)) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		if(str.equals(str3)) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		
		
		
//		Point p1 = new Point(3,5);
//		Point p2 = (Point)p1.clone(); //객체복사
//		Point p3 = new Point(p1);     //객체복사
//		
//		//값을 변경
//		p1.x = 10;
//		p2.x = 100;
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		Stu s = new Stu();
//		System.out.println(s);
//		
//		Class s2 = Stu.class;
//		System.out.println(s2.getName());
//		
//		String a = "a";
//		String b = "b";
//		a += b;
//		
//		for(int i=0;i<100;i++) {
//			a += i;
//		}
		
		
		
		
		
		
//		String txt = "윤석열 대통령 변호인단은 23일 “공수처의 위법 수사와 불법행위에 대해서는 끝까지 법적 책임을 물을 것임을 엄중히 경고한다”고 밝혔다.\r\n"
//				+ "\r\n"
//				+ "고위공직자범죄수사처가 윤 대통령 사건을 검찰에 넘기며 기소를 요구하자 입장문을 통해 비판의 메시지를 전한 셈이다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “공수처장은 세 번이나 강제구인을 시도하며 대통령에게 사법부를 존중해 달라고 요청했지만, 불법 수사를 자행하던 공수처가 법질서의 존중을 이야기하는 것은 언어도단”이라고 말했다.\r\n"
//				+ "\r\n"
//				+ "이어 “공수처는 수사권이 없음에도 관할권 없는 법원에서 불법 영장을 받아낸 후 수사지휘권 없이 경찰 기동대 수천 명을 동원해 불법 영장 집행을 강행했다”고 주장했다.\r\n"
//				+ "\r\n"
//				+ "또 “55경비단의 공문서를 위조하거나 경호처 관계자로부터 군사시설의 배치 등 기밀 사항을 유출하도록 하는 행위에 공모하는 등 온갖 불법을 저질렀다”고도 했다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “대통령을 체포한 후 진술을 강요하며 망신 주기에 앞장섰고, 가족의 접견과 서신도 제한하는 등 과도한 인권침해를 자행했다”면서 “수사 착수 후 51일 동안 공수처가 한 것은 불법과 꼼수, 대통령의 인권과 방어권을 침해하는 위법이 전부”라고 전했다.\r\n"
//				+ "\r\n"
//				+ "이후 검찰을 향해서는 \"공수처와 같은 불법 수사가 아니라 법적 정당성을 갖춘 수사로 적법절차를 준수하라\"고 요청했다.\r\n"
//				+ "\r\n"
//				+ "그러면서 \"대통령은 향후 수사와 재판, 탄핵심판에서 비상계엄 선포의 필요성을 국민들에게 알리고, 헌정질서 회복과 국정 마비 상황을 극복하기 위해 노력할 것\"이라고 덧붙였다.";
//		
//		String txt2 = "윤석열 대통령 변호인단은 23일 “공수처의 위법 수사와 불법행위에 대해서는 끝까지 법적 책임을 물을 것임을 엄중히 경고한다”고 밝혔다.\r\n"
//				+ "\r\n"
//				+ "고위공직자범죄수사처가 윤 대통령 사건을 검찰에 넘기며 기소를 요구하자 입장문을 통해 비판의 메시지를 전한 셈이다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “공수처장은 세 번이나 강제구인을 시도하며 대통령에게 사법부를 존중해 달라고 요청했지만, 불법 수사를 자행하던 공수처가 법질서의 존중을 이야기하는 것은 언어도단”이라고 말했다.\r\n"
//				+ "\r\n"
//				+ "이어 “공수처는 수사권이 없음에도 관할권 없는 법원에서 불법 영장을 받아낸 후 수사지휘권 없이 경찰 기동대 수천 명을 동원해 불법 영장 집행을 강행했다”고 주장했다.\r\n"
//				+ "\r\n"
//				+ "또 “55경비단의 공문서를 위조하거나 경호처 관계자로부터 군사시설의 배치 등 기밀 사항을 유출하도록 하는 행위에 공모하는 등 온갖 불법을 저질렀다”고도 했다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “대통령을 체포한 후 진술을 강요하며 망신 주기에 앞장섰고, 가족의 접견과 서신도 제한하는 등 과도한 인권침해를 자행했다”면서 “수사 착수 후 51일 동안 공수처가 한 것은 불법과 꼼수, 대통령의 인권과 방어권을 침해하는 위법이 전부”라고 전했다.\r\n"
//				+ "\r\n"
//				+ "이후 검찰을 향해서는 \"공수처와 같은 불법 수사가 아니라 법적 정당성을 갖춘 수사로 적법절차를 준수하라\"고 요청했다.\r\n"
//				+ "\r\n"
//				+ "그러면서 \"대통령은 향후 수사와 재판, 탄핵심판에서 비상계엄 선포의 필요성을 국민들에게 알리고, 헌정질서 회복과 국정 마비 상황을 극복하기 위해 노력할 것\"이라고 덧붙였다.";
//		
//		String txt3 = "안녕하세요";
//		String str1 = new String(txt);
//		String str2 = new String(txt2);
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		
		
		
//		Stu s1 = new Stu("홍길동",100,90,90);
//		Stu s2 = new Stu("홍길동",70,70,70);
//		
//		if(s1.equals(s2)) {
//			System.out.println("같은 사람");
//		}else {
//			System.out.println("다른 사람");
//		}
		
//		Person p1 = new Person(200101011111111L);
//		Person p2 = new Person(200101011111111L);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		if(p1.equals(p2)) {
//			System.out.println("같은 사람입니다.");
//		}else {
//			System.out.println("다른 사람입니다.");
//		}

	}

}
