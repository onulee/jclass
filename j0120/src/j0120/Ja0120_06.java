package j0120;

public class Ja0120_06 {

//	Ja0120_06(){} //기본생성자
	
	static int bb = 0;
	int aa = 0; //인스턴스변수
//	double aa = 0;
//	int aa = 0;
	
	public static void main(String[] args) {
//		int total = 1;
//		for(int i=1;i<=5;i++) {
//			total = total * i;
//		}
//		
//		System.out.println(total);
		//객체선언
		System.out.println(fac(5));
		int a = 0;
		System.out.println(bb);
//		System.out.println(aa);
		
		int k= 0;
		double m = 0;
		float n = 0;
		System.out.println(k);
		System.out.println(m);
		System.out.println(n);
		
		

	}
	
	static long fac(int n) {
		long result = 0;
		if(n==1) {
			result = 1;
		}else {
			result = n * fac(n-1);
		}
		return result;
	}
	
	

}
