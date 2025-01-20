package j0120;

public class Car {
	
	Car(){
		this("white","auto",4);
		door = 5;
	}
	Car(String color,String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	String color;
	String gearType;
	int door;

}
