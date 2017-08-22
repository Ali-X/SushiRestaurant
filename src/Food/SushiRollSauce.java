package Food;

import Order.Order;

public class SushiRollSauce extends SpecialSushi {
	
	public Sushi sushi;
	public Roll roll;
	public SauceRoll sauce1;
	public SauceSushi sauce2;
	
	public SushiRollSauce(Sushi sushi, Roll roll, SauceRoll sauce1, SauceSushi sauce2, Order order){
		this.sushi = sushi;
		this.roll = roll;
		this.sauce1 = sauce1;
		this.sauce2 = sauce2;
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
