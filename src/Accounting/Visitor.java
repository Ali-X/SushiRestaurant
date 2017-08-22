package Accounting;

import Order.Order;

public interface Visitor {
	
	public double visit(Order order);

	public String getName();

}
