package Food;

import Order.Order;

public class California extends Roll {
	
	public California(Order order){
		this.name = "California";
		this.description = "Rice, seaweed, cucumber, avocado, wasabi Japanese horseradish, crab meat, tobiko.";
		this.order = order;
		order.setOrder(getDescription());
		order.setPrice(getPrice());
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 250;
	}

}
