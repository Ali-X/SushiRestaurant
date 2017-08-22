package Food;

import Order.Order;

public class Uramaki extends Sushi {
	
	public Uramaki(Order order){
		this.name = "Uramaki";
		this.description = "Fig. Salmon. Nori. Cucumber. Omelet. Tobiko caviar.";
		this.order = order;
		order.setOrder(getDescription());
		order.setPrice(getPrice());
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 175;
	}

}
