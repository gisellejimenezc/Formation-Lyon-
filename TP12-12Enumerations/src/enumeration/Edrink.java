package enumeration;

public enum Edrink {

	BEER(6), SODA(5), SPARKLINGWATER(3), CIDDER(2), JUICE(4);
		
		private int price;
		
		private Edrink() {}
		private Edrink(int price) {
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
