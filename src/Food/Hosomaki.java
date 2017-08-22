package Food;

import Order.Order;

public class Hosomaki extends Sushi {
	
	public Hosomaki(Order order){
		this.name = "Hosomaki";
		this.description = "Rice, eel, unagi sauce, sesame.";
		this.order = order;
		order.setOrder(getDescription());
		order.setPrice(getPrice());
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 125;
	}

}
