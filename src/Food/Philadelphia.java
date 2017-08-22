package Food;

import Order.Order;

public class Philadelphia extends Roll {
	
	public Philadelphia(Order order){
		this.name = "Philadelphia";
		this.description = "Rice, seaweed, cucumber, avocado, salmon, Philadelphia cheese, lemon, caviar Tobiko.";
		this.order = order;
		order.setOrder(getDescription());
		order.setPrice(getPrice());
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 200;
	}

}
