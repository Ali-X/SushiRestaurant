package Order;

import Accounting.Visitor;

public abstract class Bridge {

	protected Order newOrder;
	
	public Bridge(Order order){
		newOrder = order;
	}
	
	public void Additional() {
		// TODO Auto-generated method stub
		newOrder.setOrder("Delivery to home.");
		newOrder.setPrice(10);
	}
	
	public abstract double accept (Visitor v);
}
