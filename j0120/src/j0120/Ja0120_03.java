package j0120;

public class Ja0120_03 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println(d.x);
		d.x = cal(d.x);
		//d.x를 20으로 변경하시오.
		System.out.println(d.x);

	}
	
	static int cal(int x) {
		x = x+10;
		return x;
	}

}
