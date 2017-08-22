package Food;

import Order.Order;

public class Okonomiaki extends SauceSushi {
	
	Sushi sushi;
	
	public Okonomiaki (Sushi sushi, Order order){
		this.sushi = sushi;
		this.order = order;
		order.setOrder(getDescription());
		order.setPrice(getPrice());
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		if (sushi != null) return sushi.getPrice() + 50;
		return 0;
	}

	@Override
	public String getDescription() {
		if (sushi != null) return sushi.getDescription() + "Sauce: Okonomiaki.";
		return null;
	}

}
