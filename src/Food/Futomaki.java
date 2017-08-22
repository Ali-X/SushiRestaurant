package Food;

import Order.Order;

public class Futomaki extends Sushi {
	
	public Futomaki(Order order){
		this.name = "Futomaki";
		this.description = "Eel, salmon, Philadelphia cheese, avocado, cucumber, rice, caviar Masago.";
		this.order = order;
		order.setOrder(getDescription());
		order.setPrice(getPrice());
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 150;
	}

}
