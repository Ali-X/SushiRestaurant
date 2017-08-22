package Food;

import Order.Order;

public class Unagi extends Roll {
	
	public Unagi(Order order){
		this.name = "Unagi";
		this.description = "Rice, seaweed, cucumber, pickled ginger, soy sauce, wasabi, lemon.";
		this.order = order;
		order.setOrder(getDescription());
		order.setPrice(getPrice());
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 300;
	}

}
