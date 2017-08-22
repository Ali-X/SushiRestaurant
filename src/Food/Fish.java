package Food;

import Order.Order;

public abstract class Fish {

	Order order;
	String type;

	public Fish(Order order) {
		this.order = order;
	}

	public abstract Sushi CreateSushi(String type, Order order, String sauce);

	public abstract Roll CreateRoll(String type, Order order, String sauce);

	public String getType() {
		return type;
	}

}
