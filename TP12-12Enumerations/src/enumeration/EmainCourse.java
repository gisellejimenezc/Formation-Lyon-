package enumeration;

public enum EmainCourse {
	BURGUER(15), FRIEDCHICKEN(18), STEAK(20), LASAGNE(15), VEGGIE(18);
	
	private int price;
	
	private EmainCourse() {}
	private EmainCourse(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	public int getNom() {
		return price;
	}
		
	public String toString() {
		return this.name().toLowerCase() + " " + this.price;
	}
	
}
