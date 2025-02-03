package j0131;

public class Refrigerator extends Product {
	
	private int liter;
	
	public Refrigerator(){
		this("삼성900냉장고",1200000,120000,900);
	}

	public Refrigerator(String name,int price, int point,int liter) {
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
