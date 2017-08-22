package Food;

import Order.Order;

public class Teriaki extends SauceRoll {
	
	Roll roll;
	
	public Teriaki (Roll roll, Order order){
		this.roll = roll;
		this.order = order;
		order.setOrder(getDescription());
		order.setPrice(getPrice());
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		if (roll != null) return roll.getPrice() + 60;
		return 0;
	}

	@Override
	public String getDescription() {
		if (roll != null) return roll.getDescription() + "Sauce: Teriaki.";
		return null;
	}

}
