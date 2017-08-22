package Order;

import Accounting.Visitor;

public class Delivery extends Bridge {

	public Delivery(Order order) {
		super(order);
	}

	@Override
	public double accept(Visitor v) {
		// TODO Auto-generated method stub
		return v.visit(newOrder);
	}
	
	

}
