package Food;

import Order.Order;

public class Soy extends SauceRoll {
	
Roll roll;
	
	public Soy (Roll roll, Order order){
		this.roll = roll;
		this.order = order;
		order.setOrder(getDescription());
		order.setPrice(getPrice());
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		if (roll != null) return roll.getDescription() + "Sauce: Soy.";
		return null;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		if (roll != null) return roll.getPrice() + 10;
		return 0;
	}

}
