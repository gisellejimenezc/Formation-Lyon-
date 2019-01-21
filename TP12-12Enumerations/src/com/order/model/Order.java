package com.order.model;

import java.util.ArrayList;
import java.util.List;
import enumeration.Edessert;
import enumeration.Edrink;
import enumeration.EmainCourse;

public class Order {

	private String name;
	private	EmainCourse main;
	private	Edessert dessert;
	private	Edrink drink;
	
	
	public Order(String name) {
		this.name = name;
	}

	public int getPrice() {
		return main.getPrice()+ dessert.getPrice()+ drink.getPrice();
	}
	
	
	public String getName() {
		return name;
	}

	public EmainCourse getMain() {
		return main;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMain(EmainCourse main) {
		this.main = main;
	}

	public Edessert getDessert() {
		return dessert;
	}

	public Edrink getDrink() {
		return drink;
	}

	public void setDessert(Edessert dessert) {
		this.dessert = dessert;
	}

	public void setDrink(Edrink drink) {
		this.drink = drink;
	}

	@Override
	public String toString() {
		return "Order " + this.name + "\n"
				+ this.main.toString() + " "+ this.dessert.toString() + " " + this.drink.toString();
	}
	
}
