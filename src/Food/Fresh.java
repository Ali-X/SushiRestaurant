package Food;

import Order.Order;

public class Fresh extends Fish {

	public Fresh(Order order) {
		super(order);
		// TODO Auto-generated constructor stub
		type = "Fresh fish";
		order.setOrder(getType());
	}
	@Override
	public Sushi CreateSushi(String type, Order order, String sauce) {
		// TODO Auto-generated method stub
		Sushi sushi = null;
		if (type.equals("futomaki")) sushi = new Futomaki(order);
		if (type.equals("hosomaki")) sushi = new Hosomaki(order);
		if (sauce.equals("spicey")) sushi = new Spicey(sushi, order);
		if (sauce.equals("okonomiaki")) sushi = new Okonomiaki(sushi, order);
		return sushi;
	}

	@Override
	public Roll CreateRoll(String type, Order order, String sauce) {
		// TODO Auto-generated method stub
		Roll roll = null;
		if (type.equals("philadelphia")) roll = new Philadelphia(order);
		if (sauce.equals("soy")) roll = new Soy(roll, order);
		if (sauce.equals("teriaki")) roll = new Teriaki(roll, order);
		return roll;
	}

}
