package Worker;

import Strategy.ICanGiveBill;
import Strategy.WhatICan;
import Strategy.ICanTakeMoney;

public class Accountant extends Worker {
	
	public Accountant(){
		name = "Accountant";
		takemoney = new ICanTakeMoney();
		givebill = new ICanGiveBill();
	}

}
