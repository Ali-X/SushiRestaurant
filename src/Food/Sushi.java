package Food;

import Order.Order;

public abstract class Sushi implements Cloneable{
	
	public String name = "";
	public String description = "";
	Order order;
	
	public String getDescription()
	{
		return description; 
	}
	
	public String getName()
	{
		return name; 
	}
	
	public abstract double getPrice();
	
	public void getFullInfo()
	{
		System.out.println("Name: " + this.getName()
				+ "\n" + "Description: " +
				this.getDescription() + "\n"+
				"Price: " + getPrice() + " uah. \n");
	}	
	
	public Object clone() {
		// shallow copy
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
