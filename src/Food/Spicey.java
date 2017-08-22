package Food;

import Order.Order;

public class Spicey extends SauceSushi {
	
	Sushi sushi;

	public Spicey (Sushi sushi, Order order){
		this.sushi = sushi;
		this.order = order;
		order.setOrder(getDescription());
		order.setPrice(getPrice());
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		if (sushi != null) return sushi.getPrice() + 70;
		return 0;
	}

	@Override
	public String getDescription() {
		if (sushi != null) return sushi.getDescription() + "Sauce: Spicey.";
		return null;
	}

}
