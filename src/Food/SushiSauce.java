package Food;

import Order.Order;

public class SushiSauce extends SpecialSushi {
	
	public Sushi sushi1;
	public Sushi sushi2;
	public SauceSushi sauce;
	
	public SushiSauce(Sushi sushi1, Sushi sushi2, SauceSushi sauce, Order order){
		this.sushi1 = sushi1;
		this.sushi2 = sushi2;
		this.sauce = sauce;
		this.order = order;
	}

	@Override
	protected void SushiRollSauce(Sushi sushi, Roll roll, SauceRoll sauce1, SauceSushi sauce2, Order order) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void SushiSauce(Sushi sushi1, Sushi sushi2, SauceSushi sauce, Order order) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void RollSauce(Roll roll1, Roll roll2, SauceRoll sauce, Order order) {
		// TODO Auto-generated method stub

	}

}
