package Food;

import Order.Order;

public class RollSauce extends SpecialSushi {
	
	public Roll roll1;
	public Roll roll2;
	public SauceRoll sauce;

	public RollSauce(Roll roll1, Roll roll2, SauceRoll sauce, Order order){
		this.roll1 = roll1;
		this.roll2 = roll2;
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
