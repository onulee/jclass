package star;

public class JaStar {

	public static void main(String[] args) {
//		Unit u = new Unit();
		Unit[] u = new Unit[10]; //배열선언
		u[0] = new Marine();
		u[1] = new Marine();
		u[2] = new Marine();
		u[3] = new Tank();
		u[4] = new Tank();
		u[5] = new Tank();
		u[6] = new Tank();
		u[7] = new Dropship();
		u[8] = new Dropship();
		u[9] = new Dropship();
		
		for(int i=0;i<u.length;i++) {
			u[i].move(100, 100);
		}
		

	}

}
