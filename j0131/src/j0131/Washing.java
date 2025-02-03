package j0131;

public class Washing extends Product {
	private int liter;
	
	public Washing(){
		this("삼성200세탁기",900000,90000,200);
	}
	
	public Washing(String name,int price, int point,int liter) {
		setName(name);
		setPrice(price);
		setPoint(point);
		this.liter = liter;
	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}
	
	

}
