package j0123;

public class Point implements Cloneable {
	int x;
	int y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	
	@Override
	public String toString() {
		return String.format("[%d,%d]", x,y);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
