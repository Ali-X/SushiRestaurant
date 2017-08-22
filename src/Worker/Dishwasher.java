package Worker;

import Strategy.ICanClean;
import Strategy.ICanWash;

public class Dishwasher extends Worker {
	
	public Dishwasher(){
		name = "Dishwasher";
		clean = new ICanClean();
		wash = new ICanWash();
	}


}
