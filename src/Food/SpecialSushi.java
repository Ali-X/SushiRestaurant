package Food;

import Order.Order;

public abstract class SpecialSushi {
	
	Order order;
	
	protected abstract void SushiRollSauce(Sushi sushi, Roll roll, SauceRoll sauce1, SauceSushi sauce2, Order order);
	protected abstract void SushiSauce(Sushi sushi1, Sushi sushi2, SauceSushi sauce, Order order);
	protected abstract void RollSauce(Roll roll1, Roll roll2, SauceRoll sauce, Order order);

}
