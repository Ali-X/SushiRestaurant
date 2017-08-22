package Food;

import Order.Order;

public class DoubleSushi {
	
	Order order;
	Sushi sushi;
	
	public void cook(Sushi sushi, Order order){
		this.sushi = sushi;
		this.order = order;
		Sushi clonesushi = (Sushi) this.sushi.clone();
		this.order.setOrder(clonesushi.getDescription());
		this.order.setPrice(clonesushi.getPrice());
	}

}
