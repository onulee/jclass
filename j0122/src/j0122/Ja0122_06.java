package j0122;

import java.util.ArrayList;

public class Ja0122_06 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Car("white","auto",5));
		list.add(new Car("red","stick",4));
		list.add(new Car("blue","auto",4));
		list.add(new Car("yellow","stick",6));
		list.add(new Car("green","auto",3));
		
		for(int i=0;i<list.size();i++) {
			Car c = (Car)list.get(i);
			System.out.printf("[%s,%s,%d]\n",c.color,c.gearType,c.door);
		}
		
//		System.out.println(((Car)list.get(0)).color);
//		System.out.println(((Car)list.get(1)).color);
//		System.out.println(((Car)list.get(2)).color);
//		System.out.println(((Car)list.get(3)).color);
//		System.out.println(((Car)list.get(4)).color);
		
		
		
		
	}

}
