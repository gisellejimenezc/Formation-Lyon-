package enumeration;

public enum Edessert {

	RICEPUDDING(5), FRENCHCOFFEE(8), FLAN(7), CHOCOLATECAKE(5), SMOOTHIE(8);
		
		private int price;
		
		private Edessert() {}
		private Edessert(int price) {
			this.price = price;
		}
		
		
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String toString() {
			return this.name().toLowerCase() + " " + this.price;
		}
}
