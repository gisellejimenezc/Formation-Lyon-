package com.realEstate.main;

import com.realEstate.model.Car;
import com.realEstate.model.Developer;
import com.realEstate.model.MovableAsset;

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car("car", 500, "renault");
		System.out.println(car1.toString());
		
		MovableAsset motorcycle = new MovableAsset("motorcycle", 2000);
		System.out.println(motorcycle.toString());
		
		MovableAsset house = new MovableAsset("house", 200000);
		System.out.println(house.toString());
		
		house.build();
		house.finish();
		house.buy();
		house.clean();
		house.destroy();
		motorcycle.clean();
		motorcycle.sell();
		car1.sell();
		car1.destroy();
		
		Developer developer = new Developer("Jack");
		
		developer.buy();
		developer.sell();

	}

}
