package Accounting;

import Order.Order;

public class BirthDay implements Visitor {

	public String name = "Birthday";

	public double visit(Order order) {
		return 0 - order.getPrice() * 0.3;
	}

	public String getName() {
		return this.name;
	}

}
