package Accounting;

import Order.Order;

public class HolliDay implements Visitor {

	public String name = "Holliday";
	
	@Override
	public double visit(Order order) {
		// TODO Auto-generated method stub
		return 0 - order.getPrice() * 0.1;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
