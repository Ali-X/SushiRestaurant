package Food;

import Order.Order;

public abstract class SauceSushi extends Sushi {
	
	Order order;

	public abstract String getDescription();
	public abstract double getPrice();
	
}
