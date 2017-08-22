package Food;

import Order.Order;

public class DoubleRoll {

	Order order;
	Roll roll;
	
	public void cook(Roll roll, Order order){
		this.roll = roll;
		this.order = order;
		Roll cloneroll = (Roll) this.roll.clone();
		this.order.setOrder(cloneroll.getDescription());
		this.order.setPrice(cloneroll.getPrice());
	}
	
}
