package j0120;

public class Stuscore {
	
	Stuscore(){} //기본생성자
	Stuscore(int no,String name,int kor,int eng,int math){
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
		
	}
	
	
	
	
	//학생성적
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	void print() {
		System.out.printf("출력 : %d, %s, %d, %d, %d, %d, %.2f \n",no,name,kor,eng,math,total,avg);
	}
	
	

}
