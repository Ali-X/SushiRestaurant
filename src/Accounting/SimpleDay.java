package Accounting;

import Order.Order;

public class SimpleDay implements Visitor {
	
	public String name = "Simple day";

	@Override
	public double visit(Order order) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
