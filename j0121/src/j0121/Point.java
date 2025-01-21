package j0121;

public class Point {
	
	Point(){ this(0,0);  }  //this : 다른생성자를 말함.
	Point(int x,int y){
		this.x = x;        //this : 인스턴스 변수를 말함.
		this.y = y;
	}
	
	int x;
	int y;

}
