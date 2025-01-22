package j0122;

public class Singleton {
	//같은클래스
	private static Singleton s = new Singleton();
	private Singleton(){}
	private int num;
	
	void setNum(int num) {
		this.num = num;
	}
	int getNum() {
		return num;
	}
	
	public static Singleton getInstance() {
		return s;
	}

}
