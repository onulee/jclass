package j0117;

public class Ja0117_01 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		t1.color = "red";
		t1.power = false;
		t1.channel = 7;
		
		t1.power();
		t1.channelUp();
		
		System.out.println("현재채널 : "+t1.channel);
		

	}

}
