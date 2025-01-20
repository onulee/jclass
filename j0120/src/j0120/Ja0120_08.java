package j0120;

public class Ja0120_08 {

	public static void main(String[] args) {

		Car c1 = new Car("red","auto",5);
		Car c2 = new Car();
		c2 = c1; //얕은 복사
		Car c3 = new Car(c1);
		
		
		
		
		
		
		// 객체선언후 1,홍길동,100,100,100 넣어서 
		// 출력 : 1,홍길동,100,100,100,300,100.0 
		// 출력하시오.
//		Stuscore s1 = new Stuscore();
//		s1.no = 1;
//		s1.name = "홍길동";
//		s1.kor = 100;
//		s1.eng = 100;
//		s1.math = 100;
//		s1.total = s1.kor+s1.eng+s1.math;
//		s1.avg = s1.total/3.0;
//		s1.print();
//		
//		Stuscore s2 = new Stuscore(2,"유관순",99,98,97);
//		s2.print();
		
//		System.out.printf("출력 : %d, %s, %d, %d, %d, %d, %.2f \n",s1.no,s1.name,s1.kor,s1.eng,s1.math,s1.total,s1.avg);
//		System.out.printf("출력 : %d, %s, %d, %d, %d, %d, %.2f \n",s2.no,s2.name,s2.kor,s2.eng,s2.math,s2.total,s2.avg);
		//		Car c = new Car();
//		c.color = "White";
//		c.gearType = "auto";
//		c.door = 4;
//		
//		//red,stick,5
//		Car c2 = new Car("red","stick",5);
//		System.out.println(c2.color);
//		System.out.println(c2.gearType);
//		System.out.println(c2.door);
		

	}

}
