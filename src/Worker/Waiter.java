package Worker;

import Strategy.ICanClean;
import Strategy.ICanDistribute;
import Strategy.ICanGiveBill;
import Strategy.ICanTakeMoney;
import Strategy.ICanWash;

public class Waiter extends Worker {
	
	public Waiter(){
		name = "Waiter";
		takemoney = new ICanTakeMoney();
		givebill = new ICanGiveBill();
		clean = new ICanClean();
		distribute = new ICanDistribute();
		wash = new ICanWash();
	}
	
	

}
