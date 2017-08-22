package Food;

import Order.Order;

public class Marinated extends Fish {

	public Marinated(Order order) {
		super(order);
		// TODO Auto-generated constructor stub
		type = "Marinated fish";
		order.setOrder(getType());
	}

	@Override
	public Sushi CreateSushi(String type, Order order, String sauce) {
		// TODO Auto-generated method stub
		Sushi sushi = null;
		if (type.equals("uramaki"))sushi = new Uramaki(order);
		if (sauce.equals("spicey")) sushi = new Spicey(sushi, order);
		if (sauce.equals("okonomiaki")) sushi = new Okonomiaki(sushi, order);
		return sushi;
	}

	@Override
	public Roll CreateRoll(String type, Order order, String sauce) {
		// TODO Auto-generated method stub
		Roll roll = null;
		if (type.equals("unagi")) roll = new Unagi(order);
		if (type.equals("california")) roll = new California(order);
		if (sauce.equals("soy")) roll = new Soy(roll, order);
		if (sauce.equals("teriaki")) roll = new Teriaki(roll, order);
		return roll;
	}

}
