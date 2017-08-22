package Worker;

import Strategy.ICanClean;
import Strategy.ICanWash;

public class CleaningWoman extends Worker {
	
	public CleaningWoman(){
		name = "Cleaning woman";
		clean = new ICanClean();
		wash = new ICanWash();
	}

}
