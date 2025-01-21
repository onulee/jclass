package jjcard;

class Point {
	int x;
	int y;
	
	Point(){} //기본생성자를 무조건 생성
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : "+x+","+"y : "+y;
	}
}
