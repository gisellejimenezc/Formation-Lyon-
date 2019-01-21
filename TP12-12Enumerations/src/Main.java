import com.order.model.Order;

import enumeration.Edessert;
import enumeration.Edrink;
import enumeration.EmainCourse;

public class Main {

	public static void main(String[] args) {
		
		Order order1 = new Order("Gomez");
		order1.setMain(EmainCourse.STEAK);
		order1.setDessert(Edessert.FLAN);
		order1.setDrink(Edrink.CIDDER);
		
		System.out.println(order1.toString());
		System.out.println(order1.getPrice());
		
		

	}

}
