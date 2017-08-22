package Food;

import Order.Order;

public abstract class SauceRoll extends Roll {
	
	Order order;

	public abstract String getDescription();
	public abstract double getPrice();

}
